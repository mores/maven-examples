package org.test;

import org.junit.Test;

public class AppTest
{
        private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( AppTest.class );

        @Test
        public void testZero() throws Exception
        {
                log.info( "testZero" );

		com.fazecast.jSerialComm.SerialPort[] ports = com.fazecast.jSerialComm.SerialPort.getCommPorts();

		log.info( "Available Serial Ports:" );
		for( com.fazecast.jSerialComm.SerialPort port : ports )
		{
			log.info( port.getSystemPortName() + "\t" + port.getDescriptivePortName() );

			if( ! "ttyACM0".equals( port.getSystemPortName() ) )
			{
				continue;
			}

			port.setBaudRate(115200);
                        port.setNumDataBits(8);
                        port.setNumStopBits(1);
                        port.setParity( com.fazecast.jSerialComm.SerialPort.NO_PARITY);
                        port.setComPortTimeouts( com.fazecast.jSerialComm.SerialPort.TIMEOUT_NONBLOCKING, 0, 0);

			if( ! port.openPort() )
			{
				log.error( "Unable to open port" );
				continue;
			}

			log.info( "Port Opened" );

			DataListener listener = new DataListener( port );
			port.addDataListener(listener);

			try
			{
				String message = "Hello\r\n";
                                byte[] dataToWrite = message.getBytes();
                                port.writeBytes(dataToWrite, dataToWrite.length);
                                log.info("Wrote: " + message + " to " + port.getSystemPortName());

				Thread.sleep(1000);

				message = "print('Hello')\r\n";
				dataToWrite = message.getBytes();
				port.writeBytes(dataToWrite, dataToWrite.length);

				Thread.sleep(1000);
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
			port.removeDataListener();
			port.closePort();

			log.info( "Port Closed" );

		}
	}
}
