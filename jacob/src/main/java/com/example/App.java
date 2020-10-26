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
		String libFile = System.getProperty("os.arch").equals("amd64") ? "jacob-1.20-x64.dll" : "jacob-1.20-x86.dll";
		java.io.File dllLocation = new  java.io.File( libFile );
		log.info( "run: " + dllLocation.getAbsolutePath() );

		if( ! dllLocation.exists() )
		{
			throw new Exception( "Unable to find: " + dllLocation.getAbsolutePath() );
		}

		System.setProperty( com.jacob.com.LibraryLoader.JACOB_DLL_PATH, dllLocation.getAbsolutePath());
		com.jacob.com.LibraryLoader.loadJacobLibrary();

		com.jacob.activeX.ActiveXComponent compProgramID = new com.jacob.activeX.ActiveXComponent("Excel.Application");

		com.jacob.com.Dispatch.put(compProgramID, "Visible", new com.jacob.com.Variant(true));
		com.jacob.com.Dispatch workbook = compProgramID.getProperty("Workbooks").toDispatch();
		com.jacob.com.Dispatch.call(workbook, "Open", new com.jacob.com.Variant("E:\\test\\test.xlsx"));
	}
}
