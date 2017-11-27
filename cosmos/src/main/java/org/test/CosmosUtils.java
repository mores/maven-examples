package org.test;

public class CosmosUtils
{
	private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( CosmosUtils.class );

	private com.microsoft.azure.documentdb.DocumentClient documentClient;	
	private com.google.gson.Gson gson;

	public CosmosUtils( String host, String masterKey )
	{
		documentClient = new com.microsoft.azure.documentdb.DocumentClient( host, masterKey, com.microsoft.azure.documentdb.ConnectionPolicy.GetDefault(), com.microsoft.azure.documentdb.ConsistencyLevel.Session);
		gson = new com.google.gson.Gson();
	}

	/* Collection */

	public com.microsoft.azure.documentdb.DocumentCollection createCollection( com.microsoft.azure.documentdb.Database database, String collectionId ) throws com.microsoft.azure.documentdb.DocumentClientException
	{
		com.microsoft.azure.documentdb.DocumentCollection collectionDefinition = new com.microsoft.azure.documentdb.DocumentCollection();
		collectionDefinition.setId( collectionId );

                return documentClient.createCollection( database.getSelfLink(), collectionDefinition, null).getResource();
	}

	public java.util.List<com.microsoft.azure.documentdb.DocumentCollection> listCollections( com.microsoft.azure.documentdb.Database database )
	{
		return documentClient.queryCollections( database.getSelfLink(), "SELECT * FROM root r", null).getQueryIterable().toList();
	}

	/* DB */

	public com.microsoft.azure.documentdb.Database createDB( String databaseId ) throws com.microsoft.azure.documentdb.DocumentClientException
	{
		com.microsoft.azure.documentdb.Database databaseDefinition = new com.microsoft.azure.documentdb.Database();
		databaseDefinition.setId( databaseId );

		return documentClient.createDatabase( databaseDefinition, null ).getResource();
	}

	public com.microsoft.azure.documentdb.ResourceResponse deleteDB( com.microsoft.azure.documentdb.Database database ) throws com.microsoft.azure.documentdb.DocumentClientException
	{
		com.microsoft.azure.documentdb.RequestOptions requestOptions = new com.microsoft.azure.documentdb.RequestOptions();
		com.microsoft.azure.documentdb.ResourceResponse response = documentClient.deleteDatabase( database.getSelfLink(), requestOptions );
		return response;
	}

	public java.util.List<com.microsoft.azure.documentdb.Database> listDBs()
	{
		return documentClient.queryDatabases( "SELECT * FROM root", null).getQueryIterable().toList();
	}

	/* Items */

	public Object getItem( com.microsoft.azure.documentdb.DocumentCollection collection, String id, Class clz )
	{
		java.util.List<com.microsoft.azure.documentdb.Document> documentList = documentClient.queryDocuments( collection.getSelfLink(), "SELECT * FROM root r WHERE r.id='" + id + "'", null).getQueryIterable().toList();
		if( documentList.size() > 0 )
		{
			return gson.fromJson( documentList.get(0).toString(), clz);
		}
		else
		{
			return null;
		}
	}

	public java.util.List getItems( com.microsoft.azure.documentdb.DocumentCollection collection, Class clz )
	{
		java.util.List items = new java.util.ArrayList();
		java.util.List<com.microsoft.azure.documentdb.Document> documentList = documentClient.queryDocuments( collection.getSelfLink(), "SELECT * FROM root r WHERE r.entityType = '" + clz.getName() + "'", null).getQueryIterable().toList();

		for( com.microsoft.azure.documentdb.Document itemDocument : documentList)
		{
			String rawJson = itemDocument.toString();
			log.trace( "rawJson: " + rawJson );
			items.add( gson.fromJson( rawJson, clz ));
		}

		return items;
	 }

	public Object createItem( com.microsoft.azure.documentdb.DocumentCollection collection, Object item ) throws com.microsoft.azure.documentdb.DocumentClientException
	{
		com.microsoft.azure.documentdb.Document itemDocument = new com.microsoft.azure.documentdb.Document( gson.toJson( item ) );
		itemDocument.set( "entityType", item.getClass().getName() );
		itemDocument = documentClient.createDocument( collection.getSelfLink(), itemDocument, null, false).getResource();

		return gson.fromJson( itemDocument.toString(), item.getClass() );
	}

	public Object updateItem( Object item ) throws com.microsoft.azure.documentdb.DocumentClientException
	{
		String rawJson = gson.toJson( item );
		log.trace( "rawJson: " + rawJson );
		com.microsoft.azure.documentdb.Document itemDocument = new com.microsoft.azure.documentdb.Document( rawJson );
		itemDocument = documentClient.replaceDocument( itemDocument, null ).getResource();

		return gson.fromJson( itemDocument.toString(), item.getClass() );
	}
}
