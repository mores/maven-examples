package org.openjfx;

public class ColorPlus {

	private javafx.scene.paint.Color color;
	private javafx.beans.property.BooleanProperty completeProperty;

	public ColorPlus(javafx.scene.paint.Color color) {
		this.color = color;
		completeProperty = new javafx.beans.property.SimpleBooleanProperty(false);
	}

	public javafx.scene.paint.Color getColor() {
		return color;
	}

	public boolean getComplete() {
		return completeProperty.get();
	}

	public void setComplete(boolean complete) {
		this.completeProperty.set(complete);
	}

	public javafx.beans.property.BooleanProperty getCompleteProperty() {
		return completeProperty;
	}
}
