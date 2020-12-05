package org.test;

public class App
{
        private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( App.class );

	private final String[] args;

	public static void main( String[] args ) throws Exception
        {
                new App( args ).run();
        }

        public App( String[] args )
        {
                this.args = args;
        }

        public void run() throws Exception
        {
		String plainJavaString =  "Hello, World\n";
		CLibrary.INSTANCE.printf( plainJavaString );

		int fd = 0;
		try
		{
			String fileName = "/dev/fb0";
			fd = CLibrary.INSTANCE.open( fileName, CLibrary.O_RDWR | CLibrary.O_CREAT );
			if( fd == -1 )
			{
				log.error( "Unable to open: " + fileName );
				System.exit( 1 );
			}
			System.out.println( "File Descriptior: " + fd );

			byte[] data = { (byte)0xff, (byte)0xff, (byte)0xff, (byte)0x00 };

			int written = CLibrary.INSTANCE.write( fd, data, data.length );
			System.out.println( "Wrote: " + written );
		}
		catch( Exception e )
                {
                        java.io.StringWriter sw = new java.io.StringWriter();
                        java.io.PrintWriter pw = new java.io.PrintWriter( sw );
                        e.printStackTrace( pw );
                        log.error( "Error:" + sw.toString() );
                }
		finally
		{
			CLibrary.INSTANCE.close( fd );
		}
	}
}
