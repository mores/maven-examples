package org.test;

import org.junit.Test;

public class GoTempTest
{

	private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( GoTempTest.class );

	private short VERNIER = 0x08f7;

	@Test
	public void testHigh() throws Exception
	{
		log.debug( "testHigh" );

		javax.usb.UsbServices services = javax.usb.UsbHostManager.getUsbServices();

		javax.usb.UsbHub hub = services.getRootUsbHub();
		java.util.List<javax.usb.UsbDevice> devices = new java.util.ArrayList<>();

		findDevices( hub, devices );
	}

	private void findDevices( javax.usb.UsbHub hub, java.util.List<javax.usb.UsbDevice> devices ) throws Exception
	{
		for( javax.usb.UsbDevice usbDevice : (java.util.List<javax.usb.UsbDevice>)hub.getAttachedUsbDevices() )
		{
			log.info( "usbDevice: " + usbDevice );
			if (usbDevice.isUsbHub())
			{	
				log.info( "\thub" );
				findDevices((javax.usb.UsbHub)usbDevice, devices);
			}
			else
			{
				log.info( "\tendpoint" );
				javax.usb.UsbDeviceDescriptor deviceDesc = usbDevice.getUsbDeviceDescriptor();
				if( deviceDesc.idVendor() == VERNIER )
				{
					log.info( "\t\tVernier" );

					javax.usb.UsbConfiguration config = usbDevice.getActiveUsbConfiguration();
					for( javax.usb.UsbInterface iface: (java.util.List<javax.usb.UsbInterface>) config.getUsbInterfaces() )
					{
						log.info( "iface: " + iface );
						try
						{
							iface.claim( new javax.usb.UsbInterfacePolicy()
							{            
								@Override
								public boolean forceClaim( javax.usb.UsbInterface usbInterface)
								{
									return true;
								}
							});

							java.util.List<javax.usb.UsbEndpoint> endpoints = iface.getUsbEndpoints();
							for( javax.usb.UsbEndpoint endpoint : endpoints )
							{
								log.info( "endpoint: " + endpoint );
								javax.usb.UsbEndpointDescriptor ed = endpoint.getUsbEndpointDescriptor();
								log.info( "descriptor: " + ed );

								javax.usb.UsbPipe pipe = endpoint.getUsbPipe();
								pipe.open();

								for( int x = 0; x < 20; x++ )
								{
									byte[] bytesToRead = new byte[8];

									javax.usb.UsbIrp irpRead = pipe.createUsbIrp();
									irpRead.setData( bytesToRead );
									pipe.syncSubmit( irpRead );
									/*
									pipe.asyncSubmit( irpRead );
									irpRead.waitUntilComplete( 1000 );
									Thread.sleep( 1000 );
									*/

									if( x == 0 )
									{
										// garbage from the last run
										continue;
									}

									int sampleCount = bytesToRead[0];
									int sequence = bytesToRead[1];
									log.info( sampleCount + "\t" + sequence );

									if( sampleCount > 0 )
									{
										double celsius = getCelsius( bytesToRead[2], bytesToRead[3] );
										double fahrenheit = getFahrenheit( celsius );
									}

									if( sampleCount > 1 )
									{
										double celsius = getCelsius( bytesToRead[4], bytesToRead[5] );
										double fahrenheit = getFahrenheit( celsius );
									}
									
									if( sampleCount > 2 )
									{
										double celsius = getCelsius( bytesToRead[6], bytesToRead[7] );
										double fahrenheit = getFahrenheit( celsius );
									}
								}
							}
						}
						catch( Exception e )
						{
							java.io.StringWriter sw = new java.io.StringWriter();
							java.io.PrintWriter pw = new java.io.PrintWriter( sw );
							e.printStackTrace( pw );
							log.error( "Error " + sw.toString() );
						}
						finally
						{
							iface.release();
						}
					}
				}
			}
		}
	}

	private double getCelsius( byte one, byte two )
	{
		int vTemp = ((two & 0xff) << 8) | (one & 0xff);

		// https://finninday.net/wiki/index.php/Vernier_Go_Temp_USB_device_in_Linux
		// 126.74
		// double celsius = vTemp / 126.74;

		// https://github.com/VernierST/GoIO_SDK/blob/4bd9d650c22036a77b666cebd4f3b1051b699d28/src/GoIO_cpp/GUSBDirectTempDevice.cpp#L51
		double kDegreesCelsiusPerBit = 0.0078125;

		double celsius = vTemp * kDegreesCelsiusPerBit;
		log.info( "\t" + celsius );

		return celsius;
	}

	private double getFahrenheit( double celsius )
	{
		double fahrenheit = ( celsius * 9 / 5 ) + 32;
		log.info( "\t" + fahrenheit );
		return fahrenheit;
	}
}
