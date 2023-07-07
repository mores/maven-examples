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

	@Override
	public void start(Stage stage) {

		var javaVersion = SystemInfo.javaVersion();
		var javafxVersion = SystemInfo.javafxVersion();

		javafx.scene.layout.BorderPane borderPane = new javafx.scene.layout.BorderPane();

		javafx.scene.control.MenuBar menuBar = new javafx.scene.control.MenuBar();
		borderPane.setTop(menuBar);

		javafx.scene.control.Menu file = new javafx.scene.control.Menu("File");
		menuBar.getMenus().add(file);

		javafx.scene.control.MenuItem quit = new javafx.scene.control.MenuItem(
				"Quit");
		file.getItems().add(quit);
		quit.setOnAction(new Quit());

		javafx.scene.control.MenuItem fxml = new javafx.scene.control.MenuItem(
				"FXML");
		file.getItems().add(fxml);
		fxml.setOnAction(new Fxml(stage));

		javafx.scene.control.MenuItem about = new javafx.scene.control.MenuItem(
				"About");
		file.getItems().add(about);
		about.setOnAction(new About(stage));

		javafx.scene.control.Label label = new Label("Hello, JavaFX "
				+ javafxVersion + ", running on Java " + javaVersion + ".");
		borderPane.setCenter(new StackPane(label));

		javafx.scene.control.ColorPicker colorPicker = new javafx.scene.control.ColorPicker();
		borderPane.setLeft(new StackPane(colorPicker));

		colorPicker.setOnAction(new javafx.event.EventHandler() {
			public void handle(javafx.event.Event t) {
				javafx.scene.paint.Color color = colorPicker.getValue();

				int red = (int) (color.getRed() * 255);
				int green = (int) (color.getGreen() * 255);
				int blue = (int) (color.getBlue() * 255);
				System.out.println(red + " " + green + " " + blue);
			}
		});

		javafx.scene.Scene scene = new javafx.scene.Scene(borderPane, 640, 480);
		stage.setScene(scene);
		stage.setTitle("Hello World!!");
		stage.show();
	}

	public static void main(String[] args) {
		launch();
	}
}
