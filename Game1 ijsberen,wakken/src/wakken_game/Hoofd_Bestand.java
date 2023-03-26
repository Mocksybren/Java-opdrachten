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
	 Scene scene = new Scene(VBox, 600, 600);
	 
	 initLayout(VBox); //Layout verzorging
	 primaryStage.setScene(scene);
	 primaryStage.setTitle("Ijsberen, wakken & pinguins");
	 primaryStage.show();
	 
 }
 
 private void initLayout(VBox VBox) {
	 initheader(VBox);
	 StackPane dobbel = initdobbelpaneel(VBox);
	 initselectiepaneel(VBox, dobbel);
	 
	 initscorepaneel(VBox);
	 initinvulpaneel(VBox);
	 //aanroepen van layout
 }
 
 private void initheader(VBox VBox) {
	//header paneel ophalen
		 VBox.getChildren().add(new Header_Paneel());
 }
private void initselectiepaneel(VBox VBox, StackPane dobbel) {
	//selectie paneel ophalen
	 VBox.getChildren().add(new Selectie_Paneel(dobbel));
 }
private void initscorepaneel(VBox VBox) {
	//score paneel ophalen
	 StackPane pane = new StackPane();
	 Rectangle rechthoek = new Rectangle(600,100);
	 rechthoek.setFill(Color.RED);
	 
	 pane.getChildren().add(rechthoek);
	 VBox.getChildren().add(pane);
}
private StackPane initdobbelpaneel(VBox VBox) {
	//dobbelsteen paneel ophalen
	StackPane dobbel = new Dobbel_Paneel(null);
	 VBox.getChildren().add(dobbel);
	 return dobbel;
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
