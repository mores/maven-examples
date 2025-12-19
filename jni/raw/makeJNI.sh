#!/bin/sh

if [ ! -n "${JAVA_HOME}" ]; then
    echo "The variable JAVA_HOME needs to be set."
    exit
fi

javac -h . HelloJNI.java

gcc -I"${JAVA_HOME}/include" -I"${JAVA_HOME}/include/linux" -shared -o libhello.so HelloJNI.c

java -Djava.library.path=. HelloJNI
