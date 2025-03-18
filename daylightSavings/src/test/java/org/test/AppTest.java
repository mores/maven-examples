package org.test;

import org.junit.Test;

public class AppTest
{
        private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( AppTest.class );

	@Test
	public void testIt() throws Exception
	{
		log.info( "Time: "+  createTimes( 2025, 1, 10, 6, 15, 0 ) );
		log.info( "Time: "+  createTimes( 2025, 2, 10, 6, 15, 0 ) );
		log.info( "Time: "+  createTimes( 2025, 3, 10, 6, 15, 0 ) );
		log.info( "Time: "+  createTimes( 2025, 4, 10, 6, 15, 0 ) );
	}

	public java.util.Date createTimes( int year, int month, int day, int hour, int minute, int second )
	{
		java.util.TimeZone tz = java.util.TimeZone.getTimeZone( "America/New_York" );

		java.util.GregorianCalendar calendar = new java.util.GregorianCalendar( year, month, day, hour, minute, second );
                calendar.setTimeZone( tz );

                return calendar.getTime();
	}
}
