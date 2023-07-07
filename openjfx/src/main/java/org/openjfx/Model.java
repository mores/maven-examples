package org.openjfx;

public class Model {

	private static org.slf4j.Logger log = org.slf4j.LoggerFactory
			.getLogger(Model.class);

	private javafx.stage.Stage stage;

	private javafx.beans.property.IntegerProperty number;
	private javafx.beans.property.StringProperty text;

	public Model(javafx.stage.Stage stage) {

		this.stage = stage;

		number = new javafx.beans.property.SimpleIntegerProperty(0);
		number.addListener(new javafx.beans.value.ChangeListener<Number>() {
			@Override
			public void changed(
					javafx.beans.value.ObservableValue<? extends Number> observableValue,
					Number before, Number after) {
				log.debug("changed: " + observableValue);
				log.debug("before: " + before);
				log.debug("after: " + after);
			}
		});

		text = new javafx.beans.property.SimpleStringProperty(
				"Oh, hello There !");
		text.addListener(new javafx.beans.value.ChangeListener<String>() {
			@Override
			public void changed(
					javafx.beans.value.ObservableValue<? extends String> observableValue,
					String before, String after) {
				log.debug("changed: " + observableValue);
				log.debug("before: " + before);
				log.debug("after: " + after);
			}
		});
	}

	public javafx.stage.Stage getStage() {
		return stage;
	}

	public Integer getNumber() {
		return number.get();
	}

	public void setNumber(Integer number) {
		this.number.set(number);
	}

	public javafx.beans.property.IntegerProperty numberProperty() {
		return number;
	}

	public String getText() {
		return text.get();
	}

	public void setText(String text) {
		this.text.set(text);
	}

	public javafx.beans.property.StringProperty textProperty() {
		return text;
	}
}
