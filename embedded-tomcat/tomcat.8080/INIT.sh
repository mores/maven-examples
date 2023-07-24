#!/bin/sh

echo "Enter hostname: "

read hostname

keytool -genkey -keyalg RSA -alias selfsigned -keystore keystore.jks -storepass password -validity 360 -keysize 2048 -dname "CN=$hostname, OU=Unknown, O=Unknown, L=Unknown, ST=Unknown, C=Unknown" -ext SAN=dns:$hostname

## The following can export a PEM file
keytool -exportcert -rfc -alias selfsigned -file $hostname.pem -keystore keystore.jks -storepass password -v
