curl -L https://aka.ms/InstallAzureCli | bash

mvn archetype:generate -B -DarchetypeGroupId=com.microsoft.azure -DarchetypeArtifactId=azure-functions-archetype -DarchetypeVersion=1.1 -DgroupId=org.test -DartifactId=hello -Dversion=1.0-SNAPSHOT -Dpackage=org.test.hello


mvn -DskipTests clean package

az login

mvn azure-functions:deploy
