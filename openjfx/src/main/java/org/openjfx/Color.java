package org.openjfx;

public class Color
		implements
			javafx.event.EventHandler<javafx.event.ActionEvent> {

	private static org.slf4j.Logger log = org.slf4j.LoggerFactory
			.getLogger(Color.class);

	private Model model;

	public Color(Model model) {
		this.model = model;
	}

	@Override
	public void handle(javafx.event.ActionEvent event) {

		log.debug("Color Selected: " + event);

		javafx.scene.control.ColorPicker source = (javafx.scene.control.ColorPicker) event
				.getSource();
		javafx.scene.control.ColorPicker target = (javafx.scene.control.ColorPicker) event
				.getTarget();

		javafx.scene.paint.Color color = source.getValue();

		int red = (int) (color.getRed() * 255);
		int green = (int) (color.getGreen() * 255);
		int blue = (int) (color.getBlue() * 255);
		log.debug(red + " " + green + " " + blue);

		model.setText(red + " " + green + " " + blue);
	}
}
