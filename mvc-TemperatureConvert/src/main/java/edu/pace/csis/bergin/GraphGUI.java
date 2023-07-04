package edu.pace.csis.bergin;

import java.awt.*;
import java.util.*;

public class GraphGUI extends Frame implements java.beans.PropertyChangeListener
{	
	public GraphGUI(TemperatureModel model, int h, int v)
	{ 	
		super("Temperature Gauge");
		this.model = model;
		_farenheit = new TemperatureGauge(-200, 300);
		_farenheit.set( (int)model.getF() );
		Panel Top = new Panel();
		add("North", Top);
		gauges = new TemperatureCanvas(_farenheit);
		gauges.setSize(500,280);
		add("Center", gauges);
		setSize(225, 350);
		setLocation(h,v);
		setVisible(true);

		model.addPropertyChangeListener( this );
	}
	
	@Override
	public void propertyChange( java.beans.PropertyChangeEvent propertyChangeEvent )
	{	
		repaint();
	}
		
	public void paint(Graphics g)
	{	
		int farenheit = (int)model.getF(); // Use the current data to paint
		_farenheit.set(farenheit);
		gauges.repaint();
		super.paint(g);
	}
	
	private TemperatureModel model;
	private Canvas gauges;
	private TemperatureGauge _farenheit;
}
