package org.openjfx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

	private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(App.class);

	@Override
	public void start(Stage stage) {

		log.info("start");

		Model model = new Model(stage);

		var javaVersion = SystemInfo.javaVersion();
		var javafxVersion = SystemInfo.javafxVersion();

		javafx.scene.layout.BorderPane borderPane = new javafx.scene.layout.BorderPane();

		javafx.scene.control.MenuBar menuBar = new javafx.scene.control.MenuBar();
		borderPane.setTop(menuBar);

		javafx.scene.control.Menu file = new javafx.scene.control.Menu("File");
		menuBar.getMenus().add(file);

		javafx.scene.control.MenuItem about = new javafx.scene.control.MenuItem("About");
		file.getItems().add(about);
		about.setOnAction(new About(model));

		javafx.scene.control.MenuItem fxml = new javafx.scene.control.MenuItem("FXML");
		file.getItems().add(fxml);
		fxml.setOnAction(new Fxml(model));

		javafx.scene.control.MenuItem quit = new javafx.scene.control.MenuItem("Quit");
		file.getItems().add(quit);
		quit.setOnAction(new Quit());

		javafx.scene.layout.VBox vbox = new javafx.scene.layout.VBox();
		borderPane.setCenter(vbox);

		javafx.scene.control.Label label = new Label(
				"Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
		vbox.getChildren().add(label);

		javafx.scene.control.Button button = new javafx.scene.control.Button("Start Task");
		vbox.getChildren().add(button);

		javafx.scene.layout.VBox listOfColors = new javafx.scene.layout.VBox();
		vbox.getChildren().add(listOfColors);

		model.getColorsProperty().addListener(new javafx.collections.ListChangeListener<javafx.scene.paint.Color>() {

			@Override
			public void onChanged(
					javafx.collections.ListChangeListener.Change<? extends javafx.scene.paint.Color> change) {
				while (change.next()) {
					java.util.List<? extends javafx.scene.paint.Color> list = change.getAddedSubList();
					for (javafx.scene.paint.Color color : list) {
						javafx.scene.control.TextField one = new javafx.scene.control.TextField();
						one.setPrefWidth(100);
						one.setMaxWidth(100);
						one.setBackground(new javafx.scene.layout.Background(
								new javafx.scene.layout.BackgroundFill(color, null, null)));
						listOfColors.getChildren().add(one);
					}
				}
			}
		});

		javafx.scene.control.ColorPicker colorPicker = new javafx.scene.control.ColorPicker();
		borderPane.setLeft(new StackPane(colorPicker));
		colorPicker.setOnAction(new Color(model));

		javafx.scene.control.ProgressBar progressBar = new javafx.scene.control.ProgressBar();
		progressBar.setVisible(false);
		borderPane.setBottom(new StackPane(progressBar));

		TaskService service = new TaskService();
		service.setOnScheduled(e -> progressBar.setVisible(true));
		service.setOnSucceeded(e -> progressBar.setVisible(false));

		progressBar.progressProperty().bind(service.progressProperty());

		button.setOnAction(e -> service.restart());

		javafx.scene.Scene scene = new javafx.scene.Scene(borderPane, 640, 480);
		stage.setScene(scene);
		stage.setTitle("Hello World!!");
		stage.show();
	}
	public static void main(String[] args) {
		launch();
	}
}
