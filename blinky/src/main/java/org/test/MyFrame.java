package org.test;

public class MyFrame extends javax.swing.JFrame implements java.awt.event.ActionListener, java.util.Observer, java.awt.event.WindowListener
{       
	private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( MyFrame.class );

        private MyCanvas canvas;
        private MyModel model;

        private java.awt.Button upButton = new java.awt.Button("stop");

        public MyFrame(MyModel model)
        {       
                super("Blinky");
                this.canvas = new MyCanvas( model );
                this.model = model;
                model.addObserver(this);

                add("Center", canvas);
		add("South", upButton);
                setSize(225, 350);
                setLocation(325,125);
                setVisible(true);

                upButton.addActionListener(this);
        }
        
        public void update(java.util.Observable obs, Object o) // Respond to changes
        {       
                repaint();
        }
                
        public void paint(java.awt.Graphics g)
        {       
                canvas.repaint();
                super.paint(g);
        }

        public void actionPerformed(java.awt.event.ActionEvent e) {
                log.info( "Stop" );
                model.stop();   
        }

        public void windowClosing(java.awt.event.WindowEvent e) {
                dispose();
                System.exit(0);
        }

        public void windowOpened(java.awt.event.WindowEvent e) {}
        public void windowActivated(java.awt.event.WindowEvent e) {}
        public void windowIconified(java.awt.event.WindowEvent e) {}
        public void windowDeiconified(java.awt.event.WindowEvent e) {}
        public void windowDeactivated(java.awt.event.WindowEvent e) {}
        public void windowClosed(java.awt.event.WindowEvent e) {}
}
