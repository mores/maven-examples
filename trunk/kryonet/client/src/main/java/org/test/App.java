package org.test;

public class App
{
	public static void main(String[] args) throws Exception
	{
		com.esotericsoftware.kryonet.Client client = new com.esotericsoftware.kryonet.Client();
		com.esotericsoftware.kryo.Kryo kryo = client.getKryo();
		KryoUtils.register( kryo );
		client.start();
		client.connect( 5000, "127.0.0.1", 54555 );

		client.addListener( new com.esotericsoftware.kryonet.Listener()
		{
			public void received( com.esotericsoftware.kryonet.Connection connection, Object object )
			{
				System.out.println( "received: " + object );
				if( object instanceof SomeResponse )
				{
					SomeResponse response = (SomeResponse)object;
					System.out.println(response.text);
				}
			}
		});	

		SomeRequest request = new SomeRequest();
		request.text = "Here is the request";
		client.sendTCP( request );

		Thread.sleep( 4000 );
	}
}
