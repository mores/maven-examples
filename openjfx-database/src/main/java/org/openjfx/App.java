package org.openjfx;

import java.sql.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.layout.*;

/**
 * JavaFX App
 */
public class App extends Application {

	private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(App.class);

	private JpaUtils jpaUtils;

	private static final String[] SAMPLE_NAME_DATA = {"John", "Jill", "Jack", "Jerry"};

	@Override
	public void start(Stage stage) {

		log.info("start");
		jpaUtils = new JpaUtils();

		final javafx.scene.control.ListView<String> nameView = new javafx.scene.control.ListView();

		final Button submitNames = new Button("Submit names to the database");
		submitNames.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				populateDatabase();
			}
		});

		final Button fetchNames = new Button("Fetch names from the database");
		fetchNames.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				fetchNamesFromDatabaseToListView(nameView);
			}
		});

		final Button clearNameList = new Button("Clear the name list");
		clearNameList.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				nameView.getItems().clear();
			}
		});

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

		javafx.scene.layout.VBox layout = new javafx.scene.layout.VBox(10);
		layout.setStyle("-fx-background-color: cornsilk; -fx-padding: 15;");

		javafx.scene.layout.HBox stuff = new javafx.scene.layout.HBox(10);
		stuff.getChildren().add(submitNames);
		stuff.getChildren().add(fetchNames);
		stuff.getChildren().add(clearNameList);

		layout.getChildren().setAll(stuff);

		layout.getChildren().add(nameView);
		borderPane.setCenter(layout);

		javafx.scene.control.Label label = new Label(
				"Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
		layout.getChildren().add(label);

		javafx.scene.Scene scene = new javafx.scene.Scene(borderPane, 640, 480);
		stage.setScene(scene);
		stage.setTitle("Hello World!!");
		stage.show();
	}

	public static void main(String[] args) {
		launch();
	}

	private void fetchNamesFromDatabaseToListView(ListView listView) {

		java.util.List<Employee> list = jpaUtils.getEmployees();
		log.info("Number of Employees: " + list.size());

		javafx.collections.ObservableList<String> names = javafx.collections.FXCollections.observableArrayList();
		for (Employee employee : list) {
			names.add(employee.getEname());
		}
		listView.setItems(names);
	}

	private void populateDatabase() {
		log.info("Populating database");

		Employee employee = new Employee();
		employee.setEname("Johnny");
		employee.setSalary(40000);
		employee.setDeg("Technical Manager");
		jpaUtils.saveOrUpdate(employee);
	}
}
