package org.openjfx;

public class About
		implements
			javafx.event.EventHandler<javafx.event.ActionEvent> {
	private javafx.stage.Stage primaryStage;

	public About(javafx.stage.Stage primaryStage) {
		this.primaryStage = primaryStage;
	}

	@Override
	public void handle(javafx.event.ActionEvent event) {
		System.out.println("About Selected");

		javafx.scene.control.Label secondLabel = new javafx.scene.control.Label(
				"I'm a Label on new Window");

		javafx.scene.layout.StackPane secondaryLayout = new javafx.scene.layout.StackPane();
		secondaryLayout.getChildren().add(secondLabel);

		javafx.scene.Scene secondScene = new javafx.scene.Scene(
				secondaryLayout, 230, 100);

		// New window (Stage)
		javafx.stage.Stage newWindow = new javafx.stage.Stage();
		newWindow.setTitle("Second Stage");
		newWindow.setScene(secondScene);

		// Specifies the modality for new window.
		newWindow.initModality(javafx.stage.Modality.WINDOW_MODAL);

		// Specifies the owner Window (parent) for new window
		newWindow.initOwner(primaryStage);

		// Set position of second window, related to primary window.
		newWindow.setX(primaryStage.getX() + 200);
		newWindow.setY(primaryStage.getY() + 100);

		newWindow.show();
	}
}
