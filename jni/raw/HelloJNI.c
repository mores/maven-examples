#include <jni.h>
#include <stdio.h>
#include "HelloJNI.h"

// Implementation of the native method
JNIEXPORT void JNICALL Java_HelloJNI_sayHello(JNIEnv *env, jobject thisObject) {
    printf("Hello from C!\n");
}
