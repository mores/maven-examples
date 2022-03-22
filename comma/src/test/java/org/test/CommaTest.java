package org.test;

import org.junit.Test;

public class CommaTest
{
	private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( CommaTest.class );

	@Test
	public void testOpenCsv() throws Exception
	{
		log.info( "\nOpenCsv" );

		com.opencsv.CSVReader reader = new com.opencsv.CSVReader( new java.io.FileReader("src/test/resources/sample.data") );

		String[] record = null;
		while( (record = reader.readNext()) != null)
		{
			log.info( record[0] + "\t" + record[2] + "\t" + record[1] );
		}
	}

	@Test
	public void testSpark() throws Exception
	{
		log.info( "\nspark" );

		org.apache.spark.sql.SparkSession spark = org.apache.spark.sql.SparkSession.builder().appName("Simple Application").config("spark.master", "local").getOrCreate();
		org.apache.spark.sql.SQLContext sqlContext = new org.apache.spark.sql.SQLContext( spark.sparkContext() );
		org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> dataset = sqlContext.read()
                    .format("com.databricks.spark.csv")
                    .option("inferSchema", "true")
                    .option("unescapedQuoteHandling", "STOP_AT_CLOSING_QUOTE" )
                    .option("header", "true")
                    .load("src/test/resources/sample.data");

		log.info( "Count: " + dataset.count() );

		java.util.List<org.apache.spark.sql.Row> rows = dataset.collectAsList();
		for( org.apache.spark.sql.Row row : rows )
		{
			log.info( row.getString( 0 ) + "\t" + row.getString( 2 ) + "\t" + row.getString( 1 ) );
		}
	}

	@Test
	public void testCommons() throws Exception
	{
		log.info( "\ncommons" );

		java.io.Reader in = new java.io.FileReader("src/test/resources/sample.data");
		Iterable<org.apache.commons.csv.CSVRecord> records = org.apache.commons.csv.CSVFormat.DEFAULT
			.withHeader( "h1","h2","h3" )
			.withFirstRecordAsHeader()
			.parse(in);
		for( org.apache.commons.csv.CSVRecord record : records )
		{
        		log.info( record.get( "h1" ) + "\t" + record.get( "h3" ) + "\t" + record.get( "h2" ) );
		}
	}
}
