package org.test;

import org.junit.Test;

public class BoxTest
{
        private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( BoxTest.class );

        @Test
        public void testOne() throws Exception
        {
                log.debug( "testOne" );

		com.box.sdk.BoxAPIConnection api = new com.box.sdk.BoxAPIConnection("");
		com.box.sdk.BoxFolder rootFolder = com.box.sdk.BoxFolder.getRootFolder(api);

		try
		{
			com.box.sdk.BoxFolder.Info childFolderInfo = rootFolder.createFolder("Child Folder Name");
		}
		catch( com.box.sdk.BoxAPIResponseException boxAPIResponseException )
		{
			java.io.StringWriter sw = new java.io.StringWriter();
                        java.io.PrintWriter pw = new java.io.PrintWriter( sw );
                        boxAPIResponseException.printStackTrace( pw );
                        log.error( "create Error: " + sw.toString() );
		}

		for( com.box.sdk.BoxItem.Info itemInfo : rootFolder)
		{
			log.info( itemInfo.getID() + "\t" + itemInfo.getName() );
		}
	}
}
