package org.openjfx;

public class Fxml
		implements
			javafx.event.EventHandler<javafx.event.ActionEvent> {

	private javafx.stage.Stage primaryStage;

	public Fxml(javafx.stage.Stage primaryStage) {
		this.primaryStage = primaryStage;
	}

	@Override
	public void handle(javafx.event.ActionEvent event) {

		javafx.fxml.FXMLLoader loader = new javafx.fxml.FXMLLoader();
		java.net.URL xmlUrl = getClass().getResource("/scene.fxml");
		loader.setLocation(xmlUrl);

		javafx.stage.Stage newWindow = new javafx.stage.Stage();
		newWindow.setTitle("Loaded from scene.fxml");

		try {
			javafx.scene.Parent root = loader.load();
			newWindow.setScene(new javafx.scene.Scene(root));
		} catch (Exception e) {
			e.printStackTrace();
		}

		newWindow.initOwner(primaryStage);

		newWindow.setX(primaryStage.getX() + 200);
		newWindow.setY(primaryStage.getY() + 100);

		newWindow.show();

	}
}
