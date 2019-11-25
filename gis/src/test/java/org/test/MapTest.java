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

	@Test
	public void test() throws Exception {

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
		org.opengis.feature.simple.SimpleFeatureType LOCATION = simpleFeatureTypeBuilder.buildFeatureType();

		org.locationtech.jts.geom.GeometryFactory gf = new org.locationtech.jts.geom.GeometryFactory();
		org.locationtech.jts.geom.Point point = gf.createPoint(new org.locationtech.jts.geom.Coordinate(-73.8807208f, 42.6680631f));

		org.geotools.feature.simple.SimpleFeatureBuilder simpleFeatureBuilder = new org.geotools.feature.simple.SimpleFeatureBuilder( LOCATION);
		simpleFeatureBuilder.add(point);
		simpleFeatureBuilder.add("Albany");
		String id = "101";
		org.opengis.feature.simple.SimpleFeature simpleFeature = simpleFeatureBuilder.buildFeature(id);

		org.geotools.feature.DefaultFeatureCollection featureCollection = new org.geotools.feature.DefaultFeatureCollection();
		featureCollection.add(simpleFeature);

		log.trace("Point Bounds: " + featureCollection.getBounds());

		Layer layer2 = new FeatureLayer(featureCollection, SLD.createPointStyle("circle", java.awt.Color.RED, java.awt.Color.GREEN, 1.0f, 1.0f));
		layer2.setVisible(true);
		layer2.setTitle("Points");
		map.addLayer(layer2);

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
