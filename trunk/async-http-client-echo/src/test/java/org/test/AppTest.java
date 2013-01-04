package org.test;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest extends TestCase
{
        public AppTest(String testName)
        {
                super(testName);
        }

        public static Test suite()
        {
                TestSuite testsToRun = new TestSuite();
                testsToRun.addTest( new AppTest( "echo" ) );

		return (testsToRun);
	}

	public void echo() throws Exception
	{
		com.ning.http.client.AsyncHttpClient c = new com.ning.http.client.AsyncHttpClient();

		com.ning.http.client.websocket.WebSocket websocket = c.prepareGet("ws://echo.websocket.org")
                .execute(
                  new com.ning.http.client.websocket.WebSocketUpgradeHandler.Builder().addWebSocketListener(
                     new com.ning.http.client.websocket.WebSocketByteListener() {

                    @Override
                    public void onOpen(com.ning.http.client.websocket.WebSocket websocket) {
			System.out.println("onOpen");
			websocket.sendTextMessage("ECHO");
                    }

                    @Override
                    public void onClose(com.ning.http.client.websocket.WebSocket websocket) {
			System.out.println("onClose");
                    }

                    @Override
                    public void onError(Throwable t) {
			t.printStackTrace();
                    }

                    @Override
                    public void onMessage(byte[] message) {
			System.out.println("onMessage: " + new String( message ));
                    }

                    @Override
                    public void onFragment(byte[] fragment, boolean last) {
                    }
                }).build()).get();
		System.out.println("after get");

		Thread.sleep(4000);
	}
}	
