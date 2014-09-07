package org.test;

class KryoUtils
{
	public static void register( com.esotericsoftware.kryo.Kryo kryo )
	{
		kryo.register( SomeRequest.class );
		kryo.register( SomeResponse.class );
	}
}
