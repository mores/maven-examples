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

	private org.locationtech.jts.geom.GeometryFactory gf;

	private org.opengis.feature.simple.SimpleFeatureType cityType;
	private java.util.List<org.geotools.process.spatialstatistics.core.SpatialEvent> events;
	private org.geotools.feature.DefaultFeatureCollection featureCollection;

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
		cityType = simpleFeatureTypeBuilder.buildFeatureType();

		featureCollection = new org.geotools.feature.DefaultFeatureCollection();

		addPoints( 500, -73.8807208, 42.6680631, "Albany" );
		addPoints( 400, -78.9346538, 42.8962175, "Buffalo" );
		addPoints( 1000, -74.2605513, 40.6971478, "New York City" );

		log.trace("Point Bounds: " + featureCollection.getBounds());

		Layer layer2 = new FeatureLayer(featureCollection, SLD.createPointStyle("circle", java.awt.Color.RED, java.awt.Color.GREEN, 1.0f, 1.0f));
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
			//log.trace( "Distance: " + distance );
		}

		org.geotools.feature.DefaultFeatureCollection centerCollection = new org.geotools.feature.DefaultFeatureCollection();
		centerCollection.add( addPoint( cityType, center.getCoordinate().getX(), center.getCoordinate().getY(), "Center" ) );

		Layer layer3 = new FeatureLayer( centerCollection, SLD.createPointStyle("star", java.awt.Color.YELLOW, java.awt.Color.RED, 1.0f, 15.0f));
		layer3.setVisible(true);
		layer3.setTitle("Center");
		map.addLayer(layer3);

		int imageWidth = 700;
		double heightToWidth = mapBounds.getSpan(1) / mapBounds.getSpan(0);
		java.awt.Rectangle imageBounds = new java.awt.Rectangle(0, 0, imageWidth, (int) Math.round(imageWidth * heightToWidth));

		// Begin Heat Map
		log.info( "point CRS: " + featureCollection.getSchema().getCoordinateReferenceSystem() );
		log.info( "Map CRS: " + mapBounds.getCoordinateReferenceSystem() );
		
		org.geotools.process.vector.HeatmapProcess heatmapProcess = new org.geotools.process.vector.HeatmapProcess();
                int argRadiusPixels = 20;
                String valueAttr = null;
                Integer argPixelsPerCell = 1;
                org.geotools.geometry.jts.ReferencedEnvelope argOutputEnv = new org.geotools.geometry.jts.ReferencedEnvelope( featureSource.getBounds(), featureCollection.getSchema().getCoordinateReferenceSystem() );
		// org.geotools.geometry.jts.ReferencedEnvelope argOutputEnv = mapBounds;

                int argOutputWidth = imageBounds.width;
                int argOutputHeight = imageBounds.height;
                org.opengis.util.ProgressListener monitor = null;
                org.geotools.coverage.grid.GridCoverage2D gridCoverage = heatmapProcess.execute( featureCollection, argRadiusPixels, valueAttr, argPixelsPerCell, argOutputEnv, argOutputWidth, argOutputHeight, monitor );

		java.awt.image.RenderedImage heatmap = gridCoverage.getRenderedImage();
                log.info( heatmap.getWidth() + " x " + heatmap.getHeight() );

                java.io.File heatFile = new java.io.File("/tmp/heat.tif");
                boolean wroteHeat = javax.imageio.ImageIO.write(heatmap, "tif", heatFile);

		org.geotools.styling.StyleFactory styleFactory = org.geotools.factory.CommonFactoryFinder.getStyleFactory();
		org.geotools.xml.styling.SLDParser sldParser = new org.geotools.xml.styling.SLDParser( styleFactory, "src/test/resources/heatmap.sld" );
		Style[] styles = sldParser.readXML();

		org.geotools.map.GridCoverageLayer layer4 = new org.geotools.map.GridCoverageLayer( gridCoverage, styles[0]);
		map.addLayer(layer4);
		// End Heat Map

		org.geotools.renderer.GTRenderer renderer = new org.geotools.renderer.lite.StreamingRenderer();
		renderer.setMapContent(map);

		java.awt.image.BufferedImage image = new java.awt.image.BufferedImage( imageBounds.width, imageBounds.height, java.awt.image.BufferedImage.TYPE_INT_RGB);

		java.awt.Graphics2D g2d = image.createGraphics();
		g2d.setPaint(java.awt.Color.WHITE);
		g2d.fill(imageBounds);

		renderer.paint(g2d, imageBounds, mapBounds);

		java.io.File file = new java.io.File("/tmp/out.jpg");
		javax.imageio.ImageIO.write(image, "jpeg", file);
	}

	private void addPoints( int count, double lat, double lng, String name )
	{
		for( int x = 0; x < count; x++ )
                {
                        double randLat = lat + Math.random();
                        double randLng = lng + Math.random();
                        featureCollection.add( addPoint( cityType, randLat, randLng, name + x ) );
                }
	}

	private org.opengis.feature.simple.SimpleFeature addPoint( org.opengis.feature.simple.SimpleFeatureType type, double lat, double lng, String name )
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

	private SimpleFeatureSource getSource(String fileName) throws Exception {
		File file = new File(fileName);
		if (file == null) {
			throw new Exception("File not found: " + fileName);
		}

		FileDataStore store = FileDataStoreFinder.getDataStore(file);
		SimpleFeatureSource source = store.getFeatureSource();

		return source;
	}
}
