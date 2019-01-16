package org.test;

import org.junit.Test;

public class SparkTest
{
	private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( SparkTest.class );

	@Test
	public void testOne() throws Exception
	{
		log.debug( "testOne" );

		org.apache.spark.sql.SparkSession spark = org.apache.spark.sql.SparkSession.builder().appName("Simple Application").config("spark.master", "local").getOrCreate();
		org.apache.spark.sql.Dataset<String> logData = spark.read().textFile( "src/test/resources/README.md" ).cache();

		long numAs = logData.filter(s -> s.contains("a")).count();
		long numBs = logData.filter(s -> s.contains("b")).count();

		log.debug( "Lines with a: " + numAs + ", lines with b: " + numBs );

		org.junit.Assert.assertEquals( 62L, numAs );
		org.junit.Assert.assertEquals( 31L, numBs );

		org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> people = spark.read().json( "src/test/resources/people.json").cache();
		people.printSchema();

		org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> cooked = people.agg( org.apache.spark.sql.functions.avg( people.col( "age" ) ).as( "averageAge" ), org.apache.spark.sql.functions.count( people.col( "name" ) ) );
		cooked.printSchema();

		org.apache.spark.sql.Row row = cooked.first();
		double average = row.getDouble( 0 );
		long count = row.getLong( 1 );

		log.debug( "average: " + average );
		log.debug( "count: " + count );

		org.junit.Assert.assertEquals( (double)24.5, average, 0.001 );
		org.junit.Assert.assertEquals( 3, count );

		cooked.show();

		spark.stop();
	}
}
