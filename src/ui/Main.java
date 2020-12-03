package ui;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Mining;

public class Main extends Application {
	
	private Mining mining;
	private MainGUI mainGUI;
	
	public Main() throws IOException {
		mining = new Mining();
		mainGUI = new MainGUI(mining);
	}
	
	public static void main(String[] args) throws IOException {
		Main main = new Main();
		launch();
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MainMenu.fxml"));
		fxmlLoader.setController(mainGUI);
		
		Parent root = fxmlLoader.load();
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);

		primaryStage.show();
	}
}
