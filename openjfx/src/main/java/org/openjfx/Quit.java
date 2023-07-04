package org.openjfx;

public class Quit
		implements
			javafx.event.EventHandler<javafx.event.ActionEvent> {

	@Override
	public void handle(javafx.event.ActionEvent event) {

		System.out.println("Quit Selected");
		System.exit(0);

	}
}
