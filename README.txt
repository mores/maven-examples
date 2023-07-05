graniteds-helloworld - Example how maven can build Flex and Java at same time
	cd graniteds-helloworld
	mvn install
	cd www
	mvn jetty:run
	http://<server name or ip>:9090/helloworld/hello.swf

graniteds-jdo - Example how granite can use JDO
	cd graniteds-jdo
	mvn install
	cd www
	mvn jetty:run
	http://<server name or ip>:9090/helloworld/hello.swf

jsf-ajax-simple - Adapted from http://weblogs.java.net/blog/driscoll/archive/2008/11/a_simple_ajax_j.html 
	cd jsf-ajax-simple
	mvn jetty:run
	http://<server name or ip>:8080/helloworld/index.jsf


mvn versions:display-dependency-updates
mvn versions:display-plugin-updates
