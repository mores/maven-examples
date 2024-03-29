package edu.pace.csis.bergin;

import java.awt.event.*;
import java.util.*;

class CelsiusGUI extends TemperatureGUI implements java.beans.PropertyChangeListener
{	
	public CelsiusGUI(TemperatureModel model, int h, int v)
	{	
		super("Celsius Temperature", model, h, v);
		setDisplay(""+model.getC());
		addUpListener(new UpListener());
		addDownListener(new DownListener());
		addDisplayListener(new DisplayListener());

		model.addPropertyChangeListener( this );
	}
	
	@Override
	public void propertyChange( java.beans.PropertyChangeEvent propertyChangeEvent )
	{	
		setDisplay("" + model().getC());
	}
	
	class UpListener implements ActionListener
	{	
		public void actionPerformed(ActionEvent e)
		{	model().setC(model().getC() + 1.0);
		}
	}
	
	class DownListener implements ActionListener
	{	
		public void actionPerformed(ActionEvent e)
		{	model().setC(model().getC() - 1.0);
		}
	}
	
	class DisplayListener implements ActionListener
	{	
		public void actionPerformed(ActionEvent e)
		{	double value = getDisplay();
			model().setC(value);
		}
	}
}
