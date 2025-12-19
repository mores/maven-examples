
public class HelloJNI {
    // Declare a native method that receives no arguments and returns void
    public static native void sayHello();

    // Load the native library "hello"
    static {
        // The library name "hello" will resolve to "hello.dll" on Windows,
        // "libhello.so" on Linux, or "libhello.dylib" on macOS
        System.loadLibrary("hello");
    }

    public static void main(String[] args) {
        // Call the native method
        new HelloJNI().sayHello();
    }
}
