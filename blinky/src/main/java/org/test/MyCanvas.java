package org.test;

public class MyCanvas extends java.awt.Canvas
{       
        private MyModel model;

        private static final int width = 20;
        private static final int left = 100;

        private java.util.Map<java.awt.Color, Integer> position = new java.util.HashMap<>(); 

        public MyCanvas( MyModel model )
        {
                this.model = model;
		position.put( java.awt.Color.cyan, 0 );
                position.put( java.awt.Color.red, 60 );
		position.put( java.awt.Color.yellow, 120 );
                position.put( java.awt.Color.blue, 180 );
                position.put( java.awt.Color.magenta, 240 );
        }
        
        public void paint(java.awt.Graphics g)
        {       
                java.util.Map<java.awt.Color, Boolean> lookup = model.getLookup();
                for( java.util.Map.Entry<java.awt.Color, Boolean> entry : lookup.entrySet() )
                {
                        java.awt.Color color = entry.getKey();
                        boolean on = entry.getValue();
                        int po = position.get( color );

                        if( on )
                        {
                                drawCircle( g, po, color );
                        }
                        else
                        {
                                drawCircle( g, po, java.awt.Color.black );
                        }
                }
        }

        private void drawCircle( java.awt.Graphics g, int y, java.awt.Color color )
        {
                g.setColor( color );
                g.fillOval(left-width/2, y, width*2, width*2);
                g.setColor( java.awt.Color.black); 
                g.drawOval(left-width/2, y, width*2, width*2);
        }
}
