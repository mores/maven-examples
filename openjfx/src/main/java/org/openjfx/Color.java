package org.openjfx;

public class Color implements javafx.event.EventHandler<javafx.event.ActionEvent> {

	private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(Color.class);

	private Model model;

	public Color(Model model) {
		this.model = model;
	}

	@Override
	public void handle(javafx.event.ActionEvent event) {

		log.debug("Color Selected: " + event);

		javafx.scene.control.ColorPicker source = (javafx.scene.control.ColorPicker) event.getSource();
		javafx.scene.control.ColorPicker target = (javafx.scene.control.ColorPicker) event.getTarget();

		javafx.scene.paint.Color color = source.getValue();
		model.addColor(color);
	}
}
