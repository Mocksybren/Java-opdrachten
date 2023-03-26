package ijsberen_wakken;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
//base import application


public class BasePlate extends Application {
 @Override
	public void start(Stage primaryStage) {
	  root = new ();
	 Scene scene = new Scene(root, 600, 300);
	 primaryStage.setScene(scene);
	 primaryStage.setTitle("Ijsberen, wakken & Pingiungs");
	 primaryStage.show();
	 
 }
 	public static void main(String[] args) {
 		launch(args);
 	}
}