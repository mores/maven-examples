package org.test;

import org.junit.Before;
import org.junit.Test;

public class AppTest
{
	private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( AppTest.class );

	private com.vividsolutions.jts.geom.GeometryFactory geometryFactory;
	private org.geotools.map.MapContent map;
	private org.geotools.styling.Style pointStyle;

	@Before
	public void init()
	{
		geometryFactory = new com.vividsolutions.jts.geom.GeometryFactory();
	}

	@Test
	public void testCenter() throws Exception
	{
		log.info( "testCenter" );
		map = new org.geotools.map.MapContent();
		pointStyle = org.geotools.styling.SLD.createPointStyle( "Circle", java.awt.Color.RED, java.awt.Color.RED, 0.5f, 15 );

		org.geotools.process.spatialstatistics.core.DistanceFactory distanceFactory = new org.geotools.process.spatialstatistics.core.DistanceFactory();
		java.util.List<org.geotools.process.spatialstatistics.core.SpatialEvent> events = new java.util.ArrayList<>();
		events.add( createSpatialEvent( 100L, 10.0, -10.0 ) );
		events.add( createSpatialEvent( 100L, 10.0, 10.0 ) );
		events.add( createSpatialEvent( 100L, -10.0, -10.0 ) );

		double standardDeviation = 1.0;
		boolean useWeight = false;

		org.geotools.process.spatialstatistics.core.SpatialEvent center = distanceFactory.getStandardDistance( events, standardDeviation, useWeight );
		log.info( "Center: " + center.getCoordinate() );

		double maxDistance = 0;
		for( org.geotools.process.spatialstatistics.core.SpatialEvent event : events )
		{
			double distance = distanceFactory.getDistance( center, event );
			log.trace( "Distance: " + distance );
			if( distance > maxDistance )
			{
				maxDistance = distance;
			}

			map.addLayer( addPoint( event ) );
		}
		maxDistance = maxDistance + 1;
		log.info( "Max Distance: " + maxDistance );

		org.geotools.gml3.Circle circle = new org.geotools.gml3.Circle( center.getCoordinate(), maxDistance );

		org.opengis.referencing.crs.CoordinateReferenceSystem crs = map.getCoordinateReferenceSystem();
		org.geotools.geometry.jts.ReferencedEnvelope mapBounds = new org.geotools.geometry.jts.ReferencedEnvelope( -20, 20, -20, 20, crs );
		log.info( "mapBounds: " + mapBounds );

		org.geotools.renderer.GTRenderer renderer = new org.geotools.renderer.lite.StreamingRenderer();
		renderer.setMapContent( map );

		int imageWidth = 700;

		double heightToWidth = mapBounds.getSpan( 1 ) / mapBounds.getSpan( 0 );
		java.awt.Rectangle imageBounds = new java.awt.Rectangle( 0, 0, imageWidth, (int)Math.round( imageWidth * heightToWidth ) );

		java.awt.image.BufferedImage image = new java.awt.image.BufferedImage( imageBounds.width, imageBounds.height, java.awt.image.BufferedImage.TYPE_INT_RGB );

		java.awt.Graphics2D g2d = image.createGraphics();
		g2d.setPaint( java.awt.Color.WHITE );
		g2d.fill( imageBounds );

		renderer.paint( g2d, imageBounds, mapBounds );

		java.io.File file = new java.io.File( "/tmp/out.jpg" );
		javax.imageio.ImageIO.write( image, "jpeg", file );

	}

	private org.geotools.process.spatialstatistics.core.SpatialEvent createSpatialEvent( Long id, double lng, double lat )
	{
		com.vividsolutions.jts.geom.Coordinate coordinate = new com.vividsolutions.jts.geom.Coordinate( lng, lat );

		org.geotools.process.spatialstatistics.core.SpatialEvent spatialEvent = new org.geotools.process.spatialstatistics.core.SpatialEvent( id, coordinate );
		return spatialEvent;
	}

	public org.geotools.map.Layer addPoint( org.geotools.process.spatialstatistics.core.SpatialEvent event )
	{
		org.geotools.feature.simple.SimpleFeatureTypeBuilder b = new org.geotools.feature.simple.SimpleFeatureTypeBuilder();
		b.setName( "MyFeatureType" );
		b.setCRS( map.getCoordinateReferenceSystem() );
		b.add( "location", org.opengis.geometry.primitive.Point.class );
		// building the type
		final org.opengis.feature.simple.SimpleFeatureType TYPE = b.buildFeatureType();

		org.geotools.feature.simple.SimpleFeatureBuilder featureBuilder = new org.geotools.feature.simple.SimpleFeatureBuilder( TYPE );

		com.vividsolutions.jts.geom.GeometryFactory geometryFactory = org.geotools.geometry.jts.JTSFactoryFinder.getGeometryFactory();
		com.vividsolutions.jts.geom.Point point = geometryFactory.createPoint( new com.vividsolutions.jts.geom.Coordinate( event.coordinate.x, event.coordinate.y ) );
		featureBuilder.add( point );
		org.opengis.feature.simple.SimpleFeature feature = featureBuilder.buildFeature( "FeaturePoint" );
		org.geotools.feature.DefaultFeatureCollection featureCollection = new org.geotools.feature.DefaultFeatureCollection( "internal", TYPE );
		featureCollection.add( feature );

		org.geotools.styling.Style style = org.geotools.styling.SLD.createPointStyle( "Star", java.awt.Color.BLUE, java.awt.Color.BLUE, 0.3f, 15 );
		org.geotools.map.Layer layer = new org.geotools.map.FeatureLayer( featureCollection, style );
		layer.setTitle( "NewPoint" );
		return layer;
	}
}
