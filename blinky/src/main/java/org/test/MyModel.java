package org.test;

public class MyModel extends java.util.Observable
{       
        private java.util.Map<java.awt.Color, Boolean> lookup = new java.util.HashMap<>(); 

        private boolean doStop = false;

        public MyModel()
        {
                lookup.put( java.awt.Color.red, false );
                lookup.put( java.awt.Color.blue, false );
                lookup.put( java.awt.Color.magenta, false );
        }

        public java.util.Map<java.awt.Color, Boolean> getLookup()
        {
                return lookup;
        }
        
        public void turnOn( java.awt.Color color )
        {
                lookup.put( color, true );
                setChanged();
                notifyObservers();
        }

        public void turnOff( java.awt.Color color )
        {
                lookup.put( color, false );
                setChanged();
                notifyObservers();
        }

        public void stop()
        {
                doStop = true;
        }

        public synchronized boolean keepRunning() {
                return this.doStop == false;
        }
}
