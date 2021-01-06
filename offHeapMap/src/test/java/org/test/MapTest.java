package org.test;

import org.junit.Test;

public class MapTest
{
        private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( MapTest.class );

	private int maxEntries = 19000000;

	private void loadMap( java.util.Map<String, String> map )
	{
		for( int x = 0; x < maxEntries; x++ )
                {
                        map.put( java.util.UUID.randomUUID().toString(), java.util.UUID.randomUUID().toString() );
                        if( x % 1000000 == 0 )
                        {
                                log.info( "row: " + x );
                                long heapSize = Runtime.getRuntime().totalMemory(); 
                                long heapMaxSize = Runtime.getRuntime().maxMemory();
                                long heapFreeSize = Runtime.getRuntime().freeMemory();
                         
                                log.info( "heapsize: "+formatSize(heapSize) + " heapmaxsize: "+formatSize(heapMaxSize) + " heapFreesize: "+formatSize(heapFreeSize));
                        }
                }
	}

        //@Test
        public void testBreak() throws Exception
        {
		java.util.Map<String, String> map = new java.util.HashMap<>();
		loadMap( map );
	}

	//@Test
        public void testWorks() throws Exception
        {
		org.mapdb.DB db = org.mapdb.DBMaker.memoryDB().make();
		org.mapdb.HTreeMap<String, String> map = db.hashMap("map").keySerializer( org.mapdb.Serializer.STRING ).valueSerializer( org.mapdb.Serializer.STRING ).createOrOpen();
		loadMap( map );
		db.close();
        }

	@Test
	public void testAlsoWorks() throws Exception
	{
		net.openhft.chronicle.map.ChronicleMapBuilder<String, String> mapBuilder = net.openhft.chronicle.map.ChronicleMapBuilder.of( String.class, String.class)
			.name("map")
			.averageKey( java.util.UUID.randomUUID().toString() )
			.averageValue( java.util.UUID.randomUUID().toString() )
			.entries( maxEntries );
		net.openhft.chronicle.map.ChronicleMap<String, String> map = mapBuilder.create();

		loadMap( map );
	}

	public static String formatSize(long v)
	{
        	if (v < 1024) return v + " B";
        	int z = (63 - Long.numberOfLeadingZeros(v)) / 10;
        	return String.format("%.1f %sB", (double)v / (1L << (z*10)), " KMGTPE".charAt(z));
	}
}
