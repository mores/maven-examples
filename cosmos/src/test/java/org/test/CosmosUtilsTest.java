package org.test;

import org.junit.Before;
import org.junit.Test;

public class CosmosUtilsTest
{
	private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( CosmosUtilsTest.class );

	private String host = "";
	private String key = "";

	private CosmosUtils cosmosUtils;

	@Before
	public void createUtils()
	{
		cosmosUtils = new CosmosUtils( host, key );
	}

	@Test
	public void testListDatabases() throws Exception
	{
		java.util.List<com.microsoft.azure.documentdb.Database> dbs = cosmosUtils.listDBs();
		for( com.microsoft.azure.documentdb.Database db : dbs )
		{
			log.debug( "db: " +db );
			//cosmosUtils.deleteDB( db );

			for( com.microsoft.azure.documentdb.DocumentCollection collection : cosmosUtils.listCollections( db ) )
			{
				log.debug( "collection: " + collection );

				java.util.List<Item> items = cosmosUtils.getItems( collection, Item.class );
				log.info( "Number of Items: " + items.size() );
				int x = 0;
				for( Item item : items )
				{
					log.debug( "item: " + item );
					if( x == 0 )
					{
						item.setName( "Zero" );
						item = (Item)cosmosUtils.updateItem( item );
					}
					x = x + 1;
				}

				Item item = new Item();
				cosmosUtils.createItem( collection, item );
			}
		}
	}

	//@Test
	public void testCreateDatabase() throws Exception
	{
		java.text.DateFormat dateFormat = new java.text.SimpleDateFormat( "yyyyMMddHHmmssSSS" );
		String dbName = "db-" + dateFormat.format( new java.util.Date() );

		com.microsoft.azure.documentdb.Database database = cosmosUtils.createDB( dbName );
		junit.framework.Assert.assertNotNull( database );
	}

	//@Test
        public void testCreateCollection() throws Exception
        {
                java.text.DateFormat dateFormat = new java.text.SimpleDateFormat( "yyyyMMddHHmmssSSS" );
                String dbName = "db-" + dateFormat.format( new java.util.Date() );
		String collectionName = "col-" + dateFormat.format( new java.util.Date() );

                com.microsoft.azure.documentdb.Database database = cosmosUtils.createDB( dbName );
                junit.framework.Assert.assertNotNull( database );

		com.microsoft.azure.documentdb.DocumentCollection collection = cosmosUtils.createCollection( database, collectionName );
		junit.framework.Assert.assertNotNull( collection );  
        }
}
