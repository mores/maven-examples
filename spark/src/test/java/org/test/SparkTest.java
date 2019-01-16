package org.test;

import org.junit.Test;

public class SparkTest
{
	private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( SparkTest.class );

	@Test
	public void testOne() throws Exception
	{
		log.debug( "testOne" );

		String testFile = "src/test/resources/README.md";
		org.apache.spark.sql.SparkSession spark = org.apache.spark.sql.SparkSession.builder().appName("Simple Application").config("spark.master", "local").getOrCreate();
		org.apache.spark.sql.Dataset<String> logData = spark.read().textFile( testFile ).cache();

		long numAs = logData.filter(s -> s.contains("a")).count();
		long numBs = logData.filter(s -> s.contains("b")).count();

		log.debug( "Lines with a: " + numAs + ", lines with b: " + numBs );

		spark.stop();
	}
}
