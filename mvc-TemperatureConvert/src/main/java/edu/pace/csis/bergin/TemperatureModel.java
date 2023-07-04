package edu.pace.csis.bergin;

public class TemperatureModel
{	
	public double getF(){return temperatureF;}
	
	public double getC(){return (temperatureF - 32.0) * 5.0 / 9.0;}
	
	public void setF(double tempF)
	{	
		double oldTemperatureF = temperatureF;
		temperatureF = tempF;
		pcs.firePropertyChange( "value", oldTemperatureF, temperatureF );
	}
	
	public void setC(double tempC)
	{	
		double oldTemperatureF = temperatureF;
		temperatureF = tempC*9.0/5.0 + 32.0;
		pcs.firePropertyChange( "value", oldTemperatureF, temperatureF ); 
	}

	public void addPropertyChangeListener( java.beans.PropertyChangeListener listener) {
		this.pcs.addPropertyChangeListener(listener);
	}

	private java.beans.PropertyChangeSupport pcs = new java.beans.PropertyChangeSupport(this);
	private double temperatureF = 32.0;
}
