package org.test;

import org.robovm.cocoatouch.foundation.NSObject;
import org.robovm.objc.ObjCClass;
import org.robovm.objc.ObjCRuntime;
import org.robovm.objc.Selector;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.rt.bro.annotation.Bridge;
import org.robovm.rt.bro.annotation.Library;

@Library(Library.INTERNAL)
@NativeClass
public class robovm_native extends NSObject {

    static {
        ObjCRuntime.bind(robovm_native.class);
    }

    // No parameters so no colon
    private static final Selector displayAlert = Selector.register("displayAlert");
    @Bridge
    private native static void objc_displayAlert(robovm_native __self__, Selector __cmd__);
    public void displayAlert() {
        objc_displayAlert(this, displayAlert);
    }

    // Only 1 parameter so just 1 colon
    private static final Selector doubleUp = Selector.register("doubleUp:");
    @Bridge
    private native static int objc_doubleUp(robovm_native __self__, Selector __cmd__, int a );

    public int doubleUp(int a) {
        return objc_doubleUp(this, doubleUp, a );
    }

    // Two parameters so add another :
    private static final Selector add = Selector.register("add::");
    @Bridge
    private native static int objc_add(robovm_native __self__, Selector __cmd__, int a, int b);

    public int add(int a, int b) {
        return objc_add(this, add, a, b);
    }
}
