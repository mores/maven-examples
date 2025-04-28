package org.test;

import java.io.File;
import java.util.*;

import org.geotools.api.data.*;
import org.geotools.api.feature.simple.*;
import org.geotools.api.filter.*;
import org.geotools.api.style.*;
import org.geotools.feature.*;
import org.geotools.feature.simple.*;
import org.geotools.filter.*;
import org.geotools.filter.text.cql2.CQL;
import org.geotools.geometry.jts.*;
import org.geotools.map.*;
import org.geotools.styling.SLD;

import org.locationtech.jts.geom.*;

import org.junit.Before;
import org.junit.Test;

public class MapTest {

	private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(MapTest.class);

	@Test
	public void test() throws Exception {

		File file = new File("data/countyp020.shp" );
		Map<String, Object> hashMap = new HashMap<>();
		hashMap.put("url", file.toURI().toURL());

		DataStore dataStore = DataStoreFinder.getDataStore(hashMap);
		String typeName = dataStore.getTypeNames()[0];

		FeatureSource<SimpleFeatureType, SimpleFeature> usSource = dataStore.getFeatureSource(typeName);

		Filter filter = CQL.toFilter("STATE = 'NY'");

		//Filter filter = Filter.INCLUDE; // ECQL.toFilter("BBOX(THE_GEOM, 10,20,30,40)")

		FeatureCollection<SimpleFeatureType, SimpleFeature> featureSource = usSource.getFeatures(filter);

		/*
		try (FeatureIterator<SimpleFeature> features = collection.features()) {
		    while (features.hasNext()) {
			SimpleFeature feature = features.next();
			System.out.print(feature.getID());
			System.out.print(": ");
			System.out.println(feature.getDefaultGeometryProperty().getValue());
		    }
		}
		*/

		MapContent map = new MapContent();
		map.setTitle("StyleLab");

		// Create a basic Style to render the features
		Style style = SLD.createSimpleStyle(featureSource.getSchema());

		// Add the features and the associated Style object to
		// the MapContent as a new Layer
		Layer layer = new FeatureLayer(featureSource, style);
		map.addLayer(layer);

		org.geotools.feature.simple.SimpleFeatureTypeBuilder simpleFeatureTypeBuilder = new org.geotools.feature.simple.SimpleFeatureTypeBuilder();
                simpleFeatureTypeBuilder.setName("Location");
                simpleFeatureTypeBuilder.setCRS(org.geotools.referencing.crs.DefaultGeographicCRS.WGS84);
                simpleFeatureTypeBuilder.add("the_geom",org.locationtech.jts.geom.Point.class);
                simpleFeatureTypeBuilder.length(15).add("Name", String.class);
                SimpleFeatureType cityType = simpleFeatureTypeBuilder.buildFeatureType();

		DefaultFeatureCollection featureCollection = new DefaultFeatureCollection();

		featureCollection.add( addPoint( cityType, -73.8807208, 42.6680631, "Albany" ) );
                featureCollection.add( addPoint( cityType, -78.9346538, 42.8962175, "Buffalo" ) );
                featureCollection.add( addPoint( cityType, -73.96597, 40.78116, "New York City" ) );

		Layer layer2 = new FeatureLayer(featureCollection, SLD.createPointStyle("circle", java.awt.Color.RED, java.awt.Color.GREEN, 1.0f, 20));
                layer2.setVisible(true);
                layer2.setTitle("Points");
                map.addLayer(layer2);

		org.geotools.geometry.jts.ReferencedEnvelope mapBounds = featureSource.getBounds();
                log.trace("Map Bounds: " + mapBounds);

		int imageWidth = 1400;
		double heightToWidth = mapBounds.getSpan(1) / mapBounds.getSpan(0);
		java.awt.Rectangle imageBounds = new java.awt.Rectangle(0, 0, imageWidth, (int) Math.round(imageWidth * heightToWidth));

		org.geotools.renderer.GTRenderer renderer = new org.geotools.renderer.lite.StreamingRenderer();
		renderer.setMapContent(map);

		java.awt.image.BufferedImage image = new java.awt.image.BufferedImage( imageBounds.width, imageBounds.height, java.awt.image.BufferedImage.TYPE_INT_RGB);

		java.awt.Graphics2D g2d = image.createGraphics();
		g2d.setPaint(java.awt.Color.WHITE);
		g2d.fill(imageBounds);

		renderer.paint(g2d, imageBounds, mapBounds);

		java.io.File outFile = new java.io.File("/tmp/out.jpg");
		javax.imageio.ImageIO.write(image, "jpeg", outFile);
	}

	private SimpleFeature addPoint( SimpleFeatureType type, double lat, double lng, String name )
        {
		GeometryFactory geometryFactory = JTSFactoryFinder.getGeometryFactory();

                SimpleFeatureBuilder simpleFeatureBuilder = new SimpleFeatureBuilder( type );
                org.locationtech.jts.geom.Coordinate coordinate = new org.locationtech.jts.geom.Coordinate( lat, lng );
                org.locationtech.jts.geom.Point point = geometryFactory.createPoint( coordinate );
                simpleFeatureBuilder.add( point );
                simpleFeatureBuilder.add( name );
                SimpleFeature simpleFeature = simpleFeatureBuilder.buildFeature( name );

                return simpleFeature;
        }
}
