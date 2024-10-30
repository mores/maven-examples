package org.test;

import org.greenrobot.eventbus.EventBus;

public class Server {

	private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(Server.class);

	public Server() {

		try
		{
			java.util.concurrent.ExecutorService executor = java.util.concurrent.Executors.newSingleThreadExecutor();

			Runnable task = () -> {

				try
				{
					int port = 1337;
					java.net.DatagramSocket socket = new java.net.DatagramSocket(port);

					while (true) {
						java.net.DatagramPacket request = new java.net.DatagramPacket(new byte[4], 4);
						socket.receive(request);

						log.info( "Got Request: " + request.getData() );
			 
						java.net.InetAddress clientAddress = request.getAddress();
						int clientPort = request.getPort();

						log.info( "From: " + clientAddress + "\t" + clientPort );
						EventBus.getDefault().post(new MotionEvent());
					}
				} catch (Exception e) {
					log.error( "Exception: " + e );
				}
			};

			executor.submit(task);

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
