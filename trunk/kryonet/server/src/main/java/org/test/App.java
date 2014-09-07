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

					SomeResponse response = new SomeResponse();
					response.text = "Thanks";
					connection.sendTCP( response );
				}
			}
		});
	}
}
