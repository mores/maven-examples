package org.test;

import java.io.File;
import org.geotools.data.FileDataStore;
import org.geotools.data.FileDataStoreFinder;
import org.geotools.data.simple.SimpleFeatureSource;
import org.geotools.map.FeatureLayer;
import org.geotools.map.Layer;
import org.geotools.map.MapContent;
import org.geotools.styling.SLD;
import org.geotools.styling.Style;
import org.geotools.filter.text.cql2.CQL;
import org.opengis.filter.Filter;
import org.geotools.data.simple.SimpleFeatureCollection;

import org.junit.Before;
import org.junit.Test;

public class MapTest {

	private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(MapTest.class);

	private static org.locationtech.jts.geom.GeometryFactory gf;

	private static java.util.List<org.geotools.process.spatialstatistics.core.SpatialEvent> events;

	@Test
	public void test() throws Exception {

		gf = new org.locationtech.jts.geom.GeometryFactory();
		events = new java.util.ArrayList<>();

		Filter filter = CQL.toFilter("STATE = 'NY'");

		SimpleFeatureSource usSource = getSource("data/countyp020.shp");
		SimpleFeatureCollection featureSource = usSource.getFeatures(filter);

		org.geotools.geometry.jts.ReferencedEnvelope mapBounds = featureSource.getBounds();
		log.trace("Map Bounds: " + mapBounds);

		int count = featureSource.size();
		log.trace("Map count: " + count);

		MapContent map = new MapContent();
		map.setTitle("NY");

		Style style = SLD.createSimpleStyle(featureSource.getSchema());
		Layer layer = new FeatureLayer(featureSource, style);
		map.addLayer(layer);

		org.geotools.feature.simple.SimpleFeatureTypeBuilder simpleFeatureTypeBuilder = new org.geotools.feature.simple.SimpleFeatureTypeBuilder();
		simpleFeatureTypeBuilder.setName("Location");
		simpleFeatureTypeBuilder.setCRS(org.geotools.referencing.crs.DefaultGeographicCRS.WGS84);
		simpleFeatureTypeBuilder.add("the_geom",org.locationtech.jts.geom.Point.class);
		simpleFeatureTypeBuilder.length(15).add("Name", String.class);
		org.opengis.feature.simple.SimpleFeatureType CITY = simpleFeatureTypeBuilder.buildFeatureType();

		org.geotools.feature.DefaultFeatureCollection featureCollection = new org.geotools.feature.DefaultFeatureCollection();

		featureCollection.add( addPoint( CITY, -73.8807208, 42.6680631, "Albany" ) );
		featureCollection.add( addPoint( CITY, -78.9346538, 42.8962175, "Buffalo" ) );
		featureCollection.add( addPoint( CITY, -74.2605513, 40.6971478, "New York City" ) );

		log.trace("Point Bounds: " + featureCollection.getBounds());

		Layer layer2 = new FeatureLayer(featureCollection, SLD.createPointStyle("circle", java.awt.Color.RED, java.awt.Color.GREEN, 1.0f, 15.0f));
		layer2.setVisible(true);
		layer2.setTitle("Points");
		map.addLayer(layer2);

		org.geotools.process.spatialstatistics.core.DistanceFactory distanceFactory = new org.geotools.process.spatialstatistics.core.DistanceFactory();
		double standardDeviation = 1.0;
		boolean useWeight = false;
		org.geotools.process.spatialstatistics.core.SpatialEvent center = distanceFactory.getStandardDistance( events, standardDeviation, useWeight );
		log.info( "Center: " + center.getCoordinate() );

		for( org.geotools.process.spatialstatistics.core.SpatialEvent event : events )
		{
			double distance = distanceFactory.getDistance( center, event );
			log.trace( "Distance: " + distance );
		}

		org.geotools.feature.DefaultFeatureCollection centerCollection = new org.geotools.feature.DefaultFeatureCollection();
		centerCollection.add( addPoint( CITY, center.getCoordinate().getX(), center.getCoordinate().getY(), "Center" ) );

		Layer layer3 = new FeatureLayer( centerCollection, SLD.createPointStyle("star", java.awt.Color.YELLOW, java.awt.Color.RED, 1.0f, 15.0f));
		layer3.setVisible(true);
		layer3.setTitle("Center");
		map.addLayer(layer3);

		org.geotools.renderer.GTRenderer renderer = new org.geotools.renderer.lite.StreamingRenderer();
		renderer.setMapContent(map);

		int imageWidth = 700;

		double heightToWidth = mapBounds.getSpan(1) / mapBounds.getSpan(0);
		java.awt.Rectangle imageBounds = new java.awt.Rectangle(0, 0, imageWidth, (int) Math.round(imageWidth * heightToWidth));

		java.awt.image.BufferedImage image = new java.awt.image.BufferedImage( imageBounds.width, imageBounds.height, java.awt.image.BufferedImage.TYPE_INT_RGB);

		java.awt.Graphics2D g2d = image.createGraphics();
		g2d.setPaint(java.awt.Color.WHITE);
		g2d.fill(imageBounds);

		renderer.paint(g2d, imageBounds, mapBounds);

		java.io.File file = new java.io.File("/tmp/out.jpg");
		javax.imageio.ImageIO.write(image, "jpeg", file);
	}

	private static org.opengis.feature.simple.SimpleFeature addPoint( org.opengis.feature.simple.SimpleFeatureType type, double lat, double lng, String name )
	{
		org.geotools.feature.simple.SimpleFeatureBuilder simpleFeatureBuilder = new org.geotools.feature.simple.SimpleFeatureBuilder( type );
		org.locationtech.jts.geom.Coordinate coordinate = new org.locationtech.jts.geom.Coordinate( lat, lng );
		org.locationtech.jts.geom.Point point = gf.createPoint( coordinate );
		simpleFeatureBuilder.add( point );
		simpleFeatureBuilder.add( name );
		org.opengis.feature.simple.SimpleFeature simpleFeature = simpleFeatureBuilder.buildFeature( name );

		org.geotools.process.spatialstatistics.core.SpatialEvent spatialEvent = new org.geotools.process.spatialstatistics.core.SpatialEvent( name, coordinate );
		events.add( spatialEvent );

		return simpleFeature;
	}

	private static SimpleFeatureSource getSource(String fileName) throws Exception {
		File file = new File(fileName);
		if (file == null) {
			throw new Exception("File not found: " + fileName);
		}

		FileDataStore store = FileDataStoreFinder.getDataStore(file);
		SimpleFeatureSource source = store.getFeatureSource();

		return source;
	}
}
