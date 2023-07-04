package edu.pace.csis.bergin;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class SliderGUI implements java.beans.PropertyChangeListener
{	
	public SliderGUI(TemperatureModel m, int h, int v)
	{	
		model = m;
		sliderFrame.add(tempControl);
		tempControl.addAdjustmentListener(new SlideListener());
		sliderFrame.setSize(200,100);
		sliderFrame.setLocation(h, v);
		sliderFrame.setVisible(true);
		sliderFrame.addWindowListener(new TemperatureGUI.CloseListener());		

		model.addPropertyChangeListener( this );
	}
	
	@Override
	public void propertyChange( java.beans.PropertyChangeEvent propertyChangeEvent )
	{	
		double temp = model.getC();
		tempControl.setValue((int)temp); // Move the slider thumb
	}
	
	class SlideListener implements AdjustmentListener
	{	
		public void adjustmentValueChanged(AdjustmentEvent e)
		{	model.setC(tempControl.getValue());
		}
	}
	
	private Scrollbar tempControl = new Scrollbar(Scrollbar.HORIZONTAL, 0, 10, -50, 160);
	private TemperatureModel model = null;
	private Frame sliderFrame = new Frame("Celsius");
}
