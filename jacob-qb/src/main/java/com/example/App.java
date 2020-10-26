package com.example;

public class App
{
        private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( App.class );

	private String[] args;

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
		String os = System.getProperty( "os.arch" );
		if( os.equals( "amd64") )
		{
			throw new Exception( "QB must be accessed from 32-bit java only." );
		}

		java.io.File dllLocation = new java.io.File( "jacob-1.20-x86.dll" );
		log.info( "run: " + dllLocation.getAbsolutePath() );

		if( ! dllLocation.exists() )
		{
			throw new Exception( "Unable to find: " + dllLocation.getAbsolutePath() );
		}

		System.setProperty( com.jacob.com.LibraryLoader.JACOB_DLL_PATH, dllLocation.getAbsolutePath());
		com.jacob.com.LibraryLoader.loadJacobLibrary();

		com.jacob.com.Dispatch requestProc = new com.jacob.com.Dispatch("QBXMLRP2.RequestProcessor");
		com.jacob.com.Dispatch.call( requestProc, "OpenConnection2", "", "App", 1);
	
		String xml = "<?xml version=\"1.0\" encoding=\"utf-8\"?> <?qbxml version=\"13.0\"?> <QBXML> <QBXMLMsgsRq onError=\"stopOnError\"> <HostQueryRq></HostQueryRq> </QBXMLMsgsRq> </QBXML>";
		log.info( "IN: " + xml );

		com.jacob.com.Variant ticket = null;
		try {
			ticket = com.jacob.com.Dispatch.call( requestProc, "BeginSession", "C:\\Users\\Public\\Documents\\Intuit\\QuickBooks\\Company Files\\demo.QBW", 2);

			String response = com.jacob.com.Dispatch.call( requestProc, "ProcessRequest", ticket, xml).toString();
			log.info( "OUT: " + response );
		}
		finally
		{
			//End Session
			if( requestProc != null && ticket != null )
			{
				com.jacob.com.Dispatch.call(requestProc, "EndSession", ticket);
			}
		}

		if( requestProc != null )
		{
			com.jacob.com.Dispatch.call(requestProc, "CloseConnection");
		}	
	}
}
