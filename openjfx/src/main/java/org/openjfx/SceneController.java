package org.openjfx;

import javafx.fxml.FXML;

public class SceneController implements javafx.fxml.Initializable {

	@FXML
	private javafx.scene.control.Button button;

	@FXML
	private javafx.scene.control.TextField field;

	@FXML
	private javafx.scene.control.Spinner<Number> spinner;

	private Model model;

	public SceneController(Model model) {
		this.model = model;
	}

	public void buttonClicked() {
		System.out.println("Button clicked!");

		System.out.println("Model: " + model.getText());

		button.setText("Click me again!");

		model.setText("Good-bye");
		int counter = model.getNumber();
		counter++;
		model.setNumber(counter);
	}

	@Override
	public void initialize(java.net.URL url,
			java.util.ResourceBundle resourceBundle) {

		field.textProperty().bindBidirectional(model.textProperty());
		spinner.getValueFactory().valueProperty()
				.bindBidirectional(model.numberProperty());
	}
}
