package org.test;

public class MessageListener implements com.fazecast.jSerialComm.SerialPortMessageListener
{
        private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( MessageListener.class );

        private com.fazecast.jSerialComm.SerialPort port;

        private int total;
        private int count;

        public MessageListener( com.fazecast.jSerialComm.SerialPort port )
        {
                this.port = port;
        }

        @Override
        public int getListeningEvents()
        {
                return com.fazecast.jSerialComm.SerialPort.LISTENING_EVENT_DATA_RECEIVED;
        }

        @Override
        public byte[] getMessageDelimiter()
        {
                return new byte[] { (byte)0xDE, (byte)0xAD, (byte)0xBE, (byte)0xEF };
        }

        @Override
        public boolean delimiterIndicatesEndOfMessage()
        {
                return true;
        }

        @Override
        public void serialEvent( com.fazecast.jSerialComm.SerialPortEvent event)
        {
                log.info( "\n - - - - - - - - serialEvent: " + event );

                try
                {
                        byte[] newData = event.getReceivedData();
			java.nio.ByteBuffer byteBuffer = java.nio.ByteBuffer.wrap( newData ).order( java.nio.ByteOrder.LITTLE_ENDIAN );

			short dataLength = byteBuffer.getShort();
                        log.debug( "Length of Data: " + dataLength );

                        byte type = byteBuffer.get();
                        log.info( "Type: " + type );

			if( type == 1 )
                        {
                                String macAddress = getMacAddress( byteBuffer );
                                log.info( "Sender: " + macAddress );

                                byte rssi = byteBuffer.get();
                                log.info( "RSSI: " + rssi );

                                count = count + 1;
                                total = total + rssi;
                                double average = (double) total / count;
                                log.info( "Average RSSI: " + average );

                                log.info( "Vendor: " + byteBuffer.getInt() );
                                log.info( "Application : " + (int)byteBuffer.get() );
                                log.info( "Version: " + (int)byteBuffer.get() );
                                log.info( "Data0: " + (char)byteBuffer.get() );
                                log.info( "Data1: " + (char)byteBuffer.get() );
                                log.info( "Data2: " + (char)byteBuffer.get() );
                                log.info( "Data3: " + (char)byteBuffer.get() );
                        }
                        else if( type == 3 )
                        {
				byte[] payload = new byte[dataLength];
                                byteBuffer.get( payload );
                                log.info( "Version: " + new String( payload ) );
                        }
                        else if( type == 4 )
                        {
                                log.info( "My Mac is: " + getMacAddress( byteBuffer ) );
                        }
                        else
                        {
                                log.info( "Unknow type: " + type );
                        }
                }
                catch( Exception exception )
                {
                        java.io.StringWriter sw = new java.io.StringWriter();
                        java.io.PrintWriter pw = new java.io.PrintWriter( sw );
                        exception.printStackTrace( pw );
                        log.error( exception.getMessage() + " " + sw.toString() );
                }
        }
 
        private String getMacAddress( java.nio.ByteBuffer byteBuffer )
        {
                 String macAddress = "";

                // Mac Address
                macAddress = macAddress + String.format("%02X", byteBuffer.get() );
                macAddress = macAddress + ":" + String.format("%02X", byteBuffer.get() );
                macAddress = macAddress + ":" + String.format("%02X", byteBuffer.get() );
                macAddress = macAddress + ":" + String.format("%02X", byteBuffer.get() );
                macAddress = macAddress + ":" + String.format("%02X", byteBuffer.get() );
                macAddress = macAddress + ":" + String.format("%02X", byteBuffer.get() );

                return macAddress;
        }
} 
