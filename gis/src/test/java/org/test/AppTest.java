package org.test;

import org.junit.Before;
import org.junit.Test;

public class AppTest
{
        private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( AppTest.class );

	private com.vividsolutions.jts.geom.GeometryFactory gf;
	
	@Before
        public void init()
	{
		gf = new com.vividsolutions.jts.geom.GeometryFactory();
	}
	

        @Test
        public void testCenter() throws Exception
        {
		log.info( "testCenter" );

		org.geotools.process.spatialstatistics.core.DistanceFactory distanceFactory = new org.geotools.process.spatialstatistics.core.DistanceFactory();
		java.util.List<org.geotools.process.spatialstatistics.core.SpatialEvent> events = new java.util.ArrayList<>();
		events.add( createSpatialEvent( 100L, 10.0, -10.0 ) ); 
		events.add( createSpatialEvent( 100L, 10.0, 10.0 ) );
		events.add( createSpatialEvent( 100L, -10.0, -10.0 ) );
		events.add( createSpatialEvent( 100L, -100.0, 100.0 ) );

		double standardDeviation = 1.0;
		boolean useWeight = false;

		org.geotools.process.spatialstatistics.core.SpatialEvent spatialEvent = distanceFactory.getStandardDistance( events, standardDeviation, useWeight );
		log.info( "Center: " + spatialEvent.getCoordinate() );
	}

	private org.geotools.process.spatialstatistics.core.SpatialEvent createSpatialEvent( Long id, double lng, double lat )
	{
		com.vividsolutions.jts.geom.Coordinate coordinate = new com.vividsolutions.jts.geom.Coordinate( lng, lat );
		org.geotools.process.spatialstatistics.core.SpatialEvent spatialEvent = new org.geotools.process.spatialstatistics.core.SpatialEvent( id, coordinate );	
		return spatialEvent;
	}
}
