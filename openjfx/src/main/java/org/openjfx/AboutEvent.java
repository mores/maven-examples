package org.openjfx;

public class AboutEvent implements javafx.event.EventHandler<javafx.event.ActionEvent> {

	private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(AboutEvent.class);

	private Model model;

	public AboutEvent(Model model) {
		this.model = model;
	}

	@Override
	public void handle(javafx.event.ActionEvent event) {
		log.debug("About Selected");

		javafx.scene.control.Label secondLabel = new javafx.scene.control.Label("I'm a Label on new Modal Window");

		javafx.scene.layout.StackPane secondaryLayout = new javafx.scene.layout.StackPane();
		secondaryLayout.getChildren().add(secondLabel);

		javafx.scene.Scene secondScene = new javafx.scene.Scene(secondaryLayout, 230, 100);

		// New window (Stage)
		javafx.stage.Stage newWindow = new javafx.stage.Stage();
		newWindow.setTitle("Second Stage");
		newWindow.setScene(secondScene);

		// Specifies the modality for new window.
		newWindow.initModality(javafx.stage.Modality.WINDOW_MODAL);

		// Specifies the owner Window (parent) for new window
		newWindow.initOwner(model.getStage());

		// Set position of second window, related to primary window.
		newWindow.setX(model.getStage().getX() + 200);
		newWindow.setY(model.getStage().getY() + 100);

		newWindow.show();
	}
}
