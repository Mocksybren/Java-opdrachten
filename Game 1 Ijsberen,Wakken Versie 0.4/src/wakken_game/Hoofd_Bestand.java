package wakken_game;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
//base import application


public class Hoofd_Bestand extends Application {
 @Override
 //App opstart
	public void start(Stage primaryStage) {
	 VBox VBox = new VBox();
	 Scene scene = new Scene(VBox, 1000, 1000);
	 
	 initLayout(VBox); //Layout verzorging
	 primaryStage.setScene(scene);
	 primaryStage.setTitle("Ijsberen, wakken & pinguins");
	 primaryStage.show();
	 
 }
 
 private void initLayout(VBox VBox) {
	 initselectiepaneel(VBox);
	 initscorepaneel(VBox);
	 initdobbelpaneel(VBox);
	 initinvulpaneel(VBox);
	 //aanroepen van layout
 }
private void initselectiepaneel(VBox VBox) {
	//selectie paneel ophalen
	 StackPane pane = new StackPane();
	 Rectangle rechthoek = new Rectangle(600,100);
	 rechthoek.setFill(Color.BLACK);
	 
	 pane.getChildren().add(rechthoek);
	 VBox.getChildren().add(pane);
 }
private void initscorepaneel(VBox VBox) {
	//score paneel ophalen
	 StackPane pane = new StackPane();
	 Rectangle rechthoek = new Rectangle(600,100);
	 rechthoek.setFill(Color.RED);
	 
	 pane.getChildren().add(rechthoek);
	 VBox.getChildren().add(pane);
}
private void initdobbelpaneel(VBox VBox) {
	//dobbelsteen paneel ophalen

	 VBox.getChildren().add(new Dobbel_Paneel());
}
private void initinvulpaneel(VBox VBox) {
	//invul paneel ophalen
	StackPane pane = new StackPane();
	 Rectangle rechthoek = new Rectangle(600,100);
	 rechthoek.setFill(Color.GREEN);
	 
	 pane.getChildren().add(rechthoek);
	 VBox.getChildren().add(pane);
}
 
 	public static void main(String[] args) {
 		launch(args); //app opstarten
 	}
}
