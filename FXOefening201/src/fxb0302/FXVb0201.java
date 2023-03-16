package fxb0302;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
//base import application


public class FXVb0201 extends Application {
 @Override
	public void start(Stage primaryStage) {
	 GridPane p = new GridPane();
	 Scene scene = new Scene(p, 600, 300);
	 
	 new fxvb0404(p);
	 primaryStage.setScene(scene);
	 primaryStage.setTitle("VB0301");
	 primaryStage.show();
	 
 }
 	public static void main(String[] args) {
 		launch(args);
 	}
}
