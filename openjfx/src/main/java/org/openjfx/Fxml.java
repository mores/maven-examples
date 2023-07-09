package org.openjfx;

public class Fxml implements javafx.event.EventHandler<javafx.event.ActionEvent> {

	private Model model;

	public Fxml(Model model) {
		this.model = model;
	}

	@Override
	public void handle(javafx.event.ActionEvent event) {

		javafx.fxml.FXMLLoader loader = new javafx.fxml.FXMLLoader();
		java.net.URL xmlUrl = getClass().getResource("/scene.fxml");
		loader.setLocation(xmlUrl);
		loader.setControllerFactory(new javafx.util.Callback<Class<?>, Object>() {
			@Override
			public Object call(Class<?> aClass) {
				return new SceneController(model);
			}
		});

		javafx.stage.Stage newWindow = new javafx.stage.Stage();
		newWindow.setTitle("Loaded from scene.fxml");

		try {
			javafx.scene.Parent root = loader.load();
			newWindow.setScene(new javafx.scene.Scene(root));
		} catch (Exception e) {
			e.printStackTrace();
		}

		newWindow.initOwner(model.getStage());

		newWindow.setX(model.getStage().getX() + 200);
		newWindow.setY(model.getStage().getY() + 100);

		newWindow.show();

	}
}
