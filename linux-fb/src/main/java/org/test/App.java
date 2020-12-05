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
			fd = CLibrary.INSTANCE.open( "/tmp/abc", CLibrary.O_RDWR | CLibrary.O_CREAT );

			byte[] data = plainJavaString.getBytes( java.nio.charset.StandardCharsets.UTF_8 );
			CLibrary.INSTANCE.write( fd, data, data.length );
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
