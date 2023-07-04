package org.openjfx;

import javafx.fxml.FXML;

public class SceneController {

	@FXML
	private javafx.scene.control.Button button;

	public void buttonClicked() {
		System.out.println("Button clicked!");
		button.setText("Click me again!");
	}
}
