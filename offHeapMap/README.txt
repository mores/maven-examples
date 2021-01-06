Testing of large map that contains 19,000,000 key value pairs of random uuids.

initial max heapsize: 2.6 GB

java.util.HashMap
	Hangs or Crash after 9,000,000 entries with heapsize of 2.6 GB 

org.mapdb.DB
	Completes in 254.002 with heapsize of 2.9 GB	

net.openhft.chronicle.map.ChronicleMap
	Completes in 106.821 with heapsize of 180.0 MB
	
