package org.openjfx;

public class ColorPlus {

	private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(ColorPlus.class);

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

	public boolean isDark() {

		log.info(color.getRed() + "\t" + color.getGreen() + "\t" + color.getBlue());

		double luma = 0.2126 * color.getRed() + 0.7152 * color.getGreen() + 0.0722 * color.getBlue(); // per ITU-R BT.709
		log.info("Luma: " + luma);
		if (luma < 0.50) {
			return true;
		} else {
			return false;
		}
	}
}
