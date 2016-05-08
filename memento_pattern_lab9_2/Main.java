package memento_pattern_lab9_2;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	private Stage primaryStage;

	@Override
	public void start(Stage primaryStage) {
		try {
			this.primaryStage = primaryStage;
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("./views/Profile.fxml"));
			// scene.getStylesheets().add(getClass().getResource("../css/application.css").toExternalForm());
			Parent root = (Parent) loader.load();
			Scene scene = new Scene(root);

			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		saveDefaultInstance();
		launch(args);
	}
	
	private static void saveDefaultInstance() {
		File file = new File(SerializeUtil.FILE_PATH);
		try {
			if (!file.exists()) {
				file.createNewFile();
				ProfileOrigator p = new ProfileOrigator("default", "default", "default");
				SerializeUtil.serialize(p);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void hide() {
		primaryStage.close();
	}
}