#include <jni.h>
#include <stdio.h>

JNIEXPORT jstring JNICALL
Java_com_example_demo_nativeinterface_HelloSpring_print
(JNIEnv *env, jobject obj)
{
    char msg[64] = "Hello Spring~~!!~! I'm from C";
    jstring result;

    // C Style 2 Java Style(문자 포맷 변환)
    result = (*env)->NewStringUTF(env, msg);
    return result;
}