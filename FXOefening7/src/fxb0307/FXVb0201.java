package fxb0307;
import fxb0307.FXVb0201;
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
	 
	 new fxvb0307(root);
	 primaryStage.setScene(scene);
	 primaryStage.setTitle("VB0307");
	 primaryStage.show();
	 
 }
 	public static void main(String[] args) {
 		launch(args);
 	}
}
