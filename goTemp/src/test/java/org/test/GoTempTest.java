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

								byte[] bytesToRead = new byte[8];

								javax.usb.UsbIrp irpRead = pipe.createUsbIrp();
								irpRead.setData( bytesToRead );
								pipe.asyncSubmit( irpRead );
								irpRead.waitUntilComplete(1000);

								Thread.sleep( 1000 );

								org.apache.commons.codec.binary.Hex hex = new org.apache.commons.codec.binary.Hex();
								String stuff = hex.encodeHexString( bytesToRead );
								log.info( stuff );
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
}
