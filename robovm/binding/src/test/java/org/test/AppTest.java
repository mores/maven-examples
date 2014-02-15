package org.test;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest extends TestCase {

    public AppTest(String testName) {
        super(testName);
    }

    public static Test suite() {

        TestSuite testsToRun = new TestSuite();
        testsToRun.addTest( new AppTest( "add" ) );

        return (testsToRun);
    }

    public void echo() throws Exception {
        org.test.robovm_native calc = new org.test.robovm_native();
        int three = calc.add( 1, 2 );
        assertEquals(3, three);
    }
}
