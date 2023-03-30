package wakken_game;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.stage.Stage;
//base import application


public class Hoofd_Bestand extends Application {
 
 
 private Score_Paneel score_paneel;
 private Invul_Paneel invul_paneel;
 private Selectie_Paneel selectie_paneel;
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
	selectie_paneel = new Selectie_Paneel(dobbel);
	 VBox.getChildren().add(selectie_paneel);
 }
private void initscorepaneel(VBox VBox) {
	//score paneel ophalen
	score_paneel = new Score_Paneel();
	 VBox.getChildren().add(score_paneel);
}
private StackPane initdobbelpaneel(VBox VBox) {
	//dobbelsteen paneel ophalen
	StackPane dobbel = new Dobbel_Paneel(null);
	 VBox.getChildren().add(dobbel);
	 return dobbel;
}
private void initinvulpaneel(VBox VBox) {
	//invul paneel ophalen
	invul_paneel = new Invul_Paneel();
	 VBox.getChildren().add(invul_paneel);
}
 
public void getWak() {
	selectie_paneel.getWak();
}
public void getBeer() {
	selectie_paneel.getBeer();
}
public void getPing() {
	selectie_paneel.getPing();
}
public void getGebrwakken(){
	invul_paneel.getGebrwakken();
}
public void getGebrbeer(){
	invul_paneel.getGebrbeer();
}
public void getGebrping(){
	invul_paneel.getGebrping();
}

private void wakken() {
	if(selectie_paneel.getWak() == invul_paneel.getGebrwakken()) {
		int wakgoed = 1;
		System.out.println("Wak veld is goed:"+ wakgoed);
	}
}

 	public static void main(String[] args) {
 		launch(args); //app opstarten
 	}
}
