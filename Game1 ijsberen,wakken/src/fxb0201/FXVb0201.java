package fxb0201;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
//base import application


public class FXVb0201 extends Application {
 @Override
	public void start(Stage primaryStage) {
	 FlowPane root = new FlowPane();
	 Scene scene = new Scene(root, 600, 300);
	 primaryStage.setScene(scene);
	 primaryStage.setTitle("Base Application");
	 primaryStage.show();
	 
 }
 	public static void main(String[] args) {
 		launch(args);
 	}
}
