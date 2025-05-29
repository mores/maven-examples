JavaFX 20 requires JDK17 or later


1. Run locally
	mvn clean compile exec:java

2a. Package ( java 11 )
	mvn clean compile javafx:jlink

	sh ./target/hellofx/bin/hellofx

2b. Package ( java 17 )
	mvn clean compile javafx:jlink jpackage:jpackage
