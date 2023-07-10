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
		about.setOnAction(new AboutEvent(model));

		javafx.scene.control.MenuItem fxml = new javafx.scene.control.MenuItem("FXML");
		file.getItems().add(fxml);
		fxml.setOnAction(new FxmlEvent(model));

		javafx.scene.control.MenuItem quit = new javafx.scene.control.MenuItem("Quit");
		file.getItems().add(quit);
		quit.setOnAction(new QuitEvent());

		javafx.scene.layout.VBox vbox = new javafx.scene.layout.VBox();
		borderPane.setCenter(vbox);

		javafx.scene.control.Label label = new Label(
				"Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
		vbox.getChildren().add(label);

		javafx.scene.layout.HBox hbox = new javafx.scene.layout.HBox();

		javafx.scene.control.Button start = new javafx.scene.control.Button("Start Task");
		hbox.setMargin(start, new javafx.geometry.Insets(2, 5, 2, 5));
		hbox.getChildren().add(start);

		javafx.scene.control.Button clear = new javafx.scene.control.Button("Clear");
		hbox.setMargin(clear, new javafx.geometry.Insets(2, 5, 2, 5));
		hbox.getChildren().add(clear);

		javafx.event.EventHandler<javafx.event.ActionEvent> clearEvent = new javafx.event.EventHandler<>() {
			public void handle(javafx.event.ActionEvent e) {
				model.getColorsProperty().clear();
			}
		};
		clear.setOnAction(clearEvent);

		vbox.getChildren().add(hbox);

		javafx.scene.layout.VBox listOfColors = new javafx.scene.layout.VBox();
		vbox.getChildren().add(listOfColors);

		model.getColorsProperty().addListener(new javafx.collections.ListChangeListener<ColorPlus>() {

			@Override
			public void onChanged(javafx.collections.ListChangeListener.Change<? extends ColorPlus> change) {
				while (change.next()) {

					log.info("Change: " + change);

					if (change.wasAdded()) {
						java.util.List<? extends ColorPlus> list = change.getAddedSubList();
						for (ColorPlus colorPlus : list) {
							javafx.scene.paint.Color color = colorPlus.getColor();
							javafx.scene.control.TextField one = new javafx.scene.control.TextField();
							one.setEditable(false);
							one.setId(colorPlus.getId());
							one.setPrefWidth(100);
							one.setMaxWidth(100);
							one.setBackground(new javafx.scene.layout.Background(
									new javafx.scene.layout.BackgroundFill(color, null, null)));
							listOfColors.getChildren().add(one);
						}
					}

					if (change.wasUpdated()) {
						ColorPlus colorPlus = change.getList().get(change.getFrom());
						log.info("Completed: " + colorPlus.getComplete());

						javafx.scene.control.TextField one = (javafx.scene.control.TextField) listOfColors.getChildren()
								.get(change.getFrom());
						if (colorPlus.isDark()) {
							one.setStyle("-fx-text-fill: white;");
						}
						one.setText("Complete");
					}

					if (change.wasRemoved()) {

						final java.util.List<javafx.scene.Node> removalCandidates = new java.util.ArrayList<>();

						java.util.List<? extends ColorPlus> list = change.getRemoved();
						for (ColorPlus colorPlus : list) {

							log.info("Removed: " + colorPlus.getId());

							javafx.collections.ObservableList<javafx.scene.Node> children = listOfColors.getChildren();
							for (javafx.scene.Node child : children) {
								if (colorPlus.getId().equals(child.getId())) {
									removalCandidates.add(child);
								}
							}
						}

						listOfColors.getChildren().removeAll(removalCandidates);
					}
				}
			}
		});

		javafx.scene.control.ColorPicker colorPicker = new javafx.scene.control.ColorPicker();
		borderPane.setLeft(new StackPane(colorPicker));
		colorPicker.setOnAction(new ColorEvent(model));

		javafx.scene.control.ProgressBar progressBar = new javafx.scene.control.ProgressBar();
		progressBar.setVisible(false);
		borderPane.setBottom(new StackPane(progressBar));

		TaskService service = new TaskService(model);
		service.setOnScheduled(new javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent>() {
			@Override
			public void handle(javafx.concurrent.WorkerStateEvent t) {
				progressBar.setVisible(true);
			}
		});
		service.setOnSucceeded(new javafx.event.EventHandler<javafx.concurrent.WorkerStateEvent>() {

			@Override
			public void handle(javafx.concurrent.WorkerStateEvent t) {
				progressBar.setVisible(false);
			}
		});

		progressBar.progressProperty().bind(service.progressProperty());

		javafx.event.EventHandler<javafx.event.ActionEvent> event = new javafx.event.EventHandler<>() {
			public void handle(javafx.event.ActionEvent e) {
				service.restart();
			}
		};
		start.setOnAction(event);

		javafx.scene.Scene scene = new javafx.scene.Scene(borderPane, 640, 480);
		stage.setScene(scene);
		stage.setTitle("Hello World!!");
		stage.show();
	}
	public static void main(String[] args) {
		launch();
	}
}
