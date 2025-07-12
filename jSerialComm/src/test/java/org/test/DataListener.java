package org.test;

public class DataListener implements  com.fazecast.jSerialComm.SerialPortDataListener
{
        private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( DataListener.class );

	private com.fazecast.jSerialComm.SerialPort port;

	public DataListener( com.fazecast.jSerialComm.SerialPort port )
	{
		this.port = port;
	}

        @Override
        public int getListeningEvents()
	{
		return com.fazecast.jSerialComm.SerialPort.LISTENING_EVENT_DATA_RECEIVED;
	}

	@Override
	public void serialEvent( com.fazecast.jSerialComm.SerialPortEvent event)
	{
		log.info( "serialEvent: " + event );

		byte[] newData = event.getReceivedData();
		System.out.println("Received data of size: " + newData.length);
		for (int i = 0; i < newData.length; ++i)
		{
			System.out.print((char)newData[i]);
		}
		System.out.println("\n");
	}
}	
