1. Run locally
	mvn clean compile exec:java

2a. Package ( java 11 )
	mvn clean compile javafx:jlink

2b. Package ( java 17 )
	mvn clean compile javafx:jlink jpackage:jpackage
