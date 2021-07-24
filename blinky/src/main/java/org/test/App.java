package org.test;

public class App
{
        private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( App.class );

	private final String[] args;

	public static void main( String[] args ) throws Exception
        {
                new App( args ).run();
        }

        public App( String[] args )
        {
                this.args = args;
        }

        public void run() throws Exception
        {
		MyModel model = new MyModel();

                new MyFrame( model );

                Timer red = new Timer( model, java.awt.Color.red, 1000L );
                Thread redThread = new Thread(red);
                redThread.start();

                Timer blue = new Timer( model, java.awt.Color.blue, 1200L );
                Thread blueThread = new Thread(blue);
                blueThread.start();

                Timer magenta = new Timer( model, java.awt.Color.magenta, 850L );
                Thread magentaThread = new Thread(magenta);
                magentaThread.start();

		Timer yellow = new Timer( model, java.awt.Color.yellow, 650L );
                Thread yellowThread = new Thread(yellow);
                yellowThread.start();

		Timer cyan = new Timer( model, java.awt.Color.cyan, 1102L );
		Thread cyanThread = new Thread(cyan);
		cyanThread.start();
        }
}
