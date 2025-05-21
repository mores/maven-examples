package org.openjfx;

public class FxmlEvent implements javafx.event.EventHandler<javafx.event.ActionEvent> {

	private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(FxmlEvent.class);

	private Model model;

	public FxmlEvent(Model model) {
		this.model = model;
	}

	@Override
	public void handle(javafx.event.ActionEvent event) {

		javafx.fxml.FXMLLoader loader = new javafx.fxml.FXMLLoader();
		java.net.URL xmlUrl = getClass().getResource("/scene.fxml");
		log.info("URL: " + xmlUrl);
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
		} catch (Exception exception) {
			java.io.StringWriter sw = new java.io.StringWriter();
			java.io.PrintWriter pw = new java.io.PrintWriter(sw);
			exception.printStackTrace(pw);
			log.error(exception.getMessage() + " " + sw.toString());
		}

		newWindow.initOwner(model.getStage());

		newWindow.setX(model.getStage().getX() + 200);
		newWindow.setY(model.getStage().getY() + 100);

		newWindow.show();

	}
}
