package fxb0302;
import fxb0302.FXVb0201;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
//base import application


public class FXVb0201 extends Application {
 @Override
	public void start(Stage primaryStage) {
	 Pane root = new Pane();
	 Scene scene = new Scene(root, 600, 300);
	 
	 new fxvb0302(root);
	 primaryStage.setScene(scene);
	 primaryStage.setTitle("VB0301");
	 primaryStage.show();
	 
 }
 	public static void main(String[] args) {
 		launch(args);
 	}
}
