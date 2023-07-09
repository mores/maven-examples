package org.openjfx;

public class Quit implements javafx.event.EventHandler<javafx.event.ActionEvent> {

	private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(Quit.class);

	@Override
	public void handle(javafx.event.ActionEvent event) {

		log.warn("Quit Selected");
		System.exit(0);

	}
}
