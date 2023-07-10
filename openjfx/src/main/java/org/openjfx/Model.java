package org.openjfx;

public class Model {

	private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(Model.class);

	private javafx.stage.Stage stage;

	private javafx.collections.ObservableList<ColorPlus> colorsProperty;
	private javafx.beans.property.IntegerProperty numberProperty;
	private javafx.beans.property.StringProperty textProperty;

	public Model(javafx.stage.Stage stage) {

		this.stage = stage;

		javafx.util.Callback callback = new javafx.util.Callback<ColorPlus, javafx.beans.Observable[]>() {
			@Override
			public javafx.beans.Observable[] call(ColorPlus colorPlus) {
				return new javafx.beans.Observable[]{colorPlus.getCompleteProperty()};
			}
		};

		colorsProperty = javafx.collections.FXCollections.observableArrayList(callback);

		numberProperty = new javafx.beans.property.SimpleIntegerProperty(0);
		numberProperty.addListener(new javafx.beans.value.ChangeListener<Number>() {
			@Override
			public void changed(javafx.beans.value.ObservableValue<? extends Number> observableValue, Number before,
					Number after) {
				log.debug("changed: " + observableValue);
				log.debug("before: " + before);
				log.debug("after: " + after);
			}
		});

		textProperty = new javafx.beans.property.SimpleStringProperty("Oh, hello There !");
		textProperty.addListener(new javafx.beans.value.ChangeListener<String>() {
			@Override
			public void changed(javafx.beans.value.ObservableValue<? extends String> observableValue, String before,
					String after) {
				log.debug("changed: " + observableValue);
				log.debug("before: " + before);
				log.debug("after: " + after);
			}
		});
	}

	public void addColor(ColorPlus color) {
		colorsProperty.add(color);
	}

	public javafx.stage.Stage getStage() {
		return stage;
	}

	public javafx.collections.ObservableList<ColorPlus> getColorsProperty() {
		return colorsProperty;
	}

	public Integer getNumber() {
		return numberProperty.get();
	}

	public void setNumber(Integer number) {
		this.numberProperty.set(number);
	}

	public javafx.beans.property.IntegerProperty getNumberProperty() {
		return numberProperty;
	}

	public String getText() {
		return textProperty.get();
	}

	public void setText(String text) {
		this.textProperty.set(text);
	}

	public javafx.beans.property.StringProperty getTextProperty() {
		return textProperty;
	}
}
