package org.test;

public class App
{
	public static void main(String[] args) throws Exception
	{
		com.esotericsoftware.kryonet.Server server = new com.esotericsoftware.kryonet.Server();
		com.esotericsoftware.kryo.Kryo kryo = server.getKryo();
		KryoUtils.register( kryo );
		server.start();
		server.bind( 54555 );

		server.addListener( new com.esotericsoftware.kryonet.Listener()
		{
			public void received( com.esotericsoftware.kryonet.Connection connection, Object object )
			{
				if( object instanceof SomeRequest )
				{
					SomeRequest request = (SomeRequest)object;
					System.out.println(request.text);

					java.util.List<SomeResponse> responses = new java.util.Vector();

					SomeResponse response = new SomeResponse();
					response.text = "Thank";
					responses.add( response );

					SomeResponse response2 = new SomeResponse();
					response2.text = "You";
					responses.add( response2 );

					connection.sendTCP( responses );
				}
			}
		});
	}
}
