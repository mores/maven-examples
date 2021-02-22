package org.test;

import org.junit.Test;

public class AppTest
{
        private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( AppTest.class );

        @Test
        public void testOne() throws Exception
        {
                log.debug( "testOne" );
	
		com.profesorfalken.jpowershell.PowerShell powerShell = null;

		try
		{
			powerShell = com.profesorfalken.jpowershell.PowerShell.openSession( "pwsh" );

			com.profesorfalken.jpowershell.PowerShellResponse response = powerShell.executeCommand("Get-Process");

			log.info("List Processes:" + response.getCommandOutput());

		}
		finally
		{
			powerShell.close();
		}
	}
}
