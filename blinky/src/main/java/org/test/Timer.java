package org.test;

public class Timer implements Runnable
{
	private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( Timer.class );

        private MyModel model;
        private java.awt.Color color;
        private long sleep;

        public Timer( MyModel model, java.awt.Color color, long sleep )
        {
                this.model = model;
                this.color = color;
                this.sleep = sleep;
        }

        public void run()
        {
                while(model.keepRunning())
                {
                        try
                        {
                                log.trace( "Turn " + color + " on");
                                model.turnOn( color );
                                Thread.yield();
                                Thread.sleep( sleep );

                                log.trace( "Turn " + color + " off" );
                                model.turnOff( color );
                                Thread.yield();
                                Thread.sleep( sleep );
                        }
                        catch( Exception exception )
                        {
				java.io.StringWriter sw = new java.io.StringWriter();
				java.io.PrintWriter pw = new java.io.PrintWriter( sw );
				exception.printStackTrace( pw );
				log.error( "Error: " + sw.toString() );
                        }
                }
        }
}
