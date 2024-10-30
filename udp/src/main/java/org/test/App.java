package org.test;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

public class App {

	private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(App.class);

	private String[] args;

	public static void main(String[] args) throws Exception {

		new App(args).run();
	}

	public App(String[] args) {
		this.args = args;

		EventBus.getDefault().register(this);
	}

	public void run() throws Exception {
		log.info("Running");

		Server server = new Server();
		log.info("Start Server" );
	}

	@Subscribe(threadMode = ThreadMode.MAIN)
	public void onMotion( MotionEvent event )
	{
		log.info( "onMotion" );
	}
}
