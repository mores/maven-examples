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
		CLibrary.INSTANCE.printf( "Hello, World\n" );
	}
}
