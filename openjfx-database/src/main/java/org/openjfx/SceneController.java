package org.openjfx;

import javafx.fxml.FXML;

public class SceneController implements javafx.fxml.Initializable {

	private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(SceneController.class);

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
		log.debug("Button clicked!");
		log.debug("Model: " + model.getText());

		button.setText("Click me again!");

		model.setText("Good-bye");
		int counter = model.getNumber();
		counter++;
		model.setNumber(counter);
	}

	@Override
	public void initialize(java.net.URL url, java.util.ResourceBundle resourceBundle) {

		field.textProperty().bindBidirectional(model.getTextProperty());
		spinner.getValueFactory().valueProperty().bindBidirectional(model.getNumberProperty());
	}
}
