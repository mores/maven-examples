graniteds-helloworld - Example how maven can build Flex and Java at same time
	cd graniteds-helloworld
	mvn install
	cd www
	mvn jetty:run
	http://<server name or ip>:9090/helloworld/hello.swf
