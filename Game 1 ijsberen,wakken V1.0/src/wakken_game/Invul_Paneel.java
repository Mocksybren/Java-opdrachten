package wakken_game;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Invul_Paneel extends StackPane {
	//variable declaratie
	private final GridPane gridpane;
	int Gebrwakken;
	int Gebrbeer;
	int Gebrping;
	Button knop = new Button("Controleer");
	TextField Text1 = new TextField("");
	TextField Text2 = new TextField("");
	TextField Text3 = new TextField("");
	//variable declaratie

	public Invul_Paneel() {	
		Rectangle rechthoek = new Rectangle(600,100);
		rechthoek.setFill(Color.GREY);
		//initialiseren
		Label label1 = new Label("Hoeveel wakken?");
		Label label2 = new Label("Hoeveel ijsberen?");
		Label label3 = new Label("Hoeveel pinguins?");


		//initialiseren

		//Styling
		gridpane = new GridPane();

		gridpane.add(label1, 0, 0);
		gridpane.add(label2, 0, 1);
		gridpane.add(label3, 0, 2);
		gridpane.add(Text1, 1, 0);
		gridpane.add(Text2, 1, 1);
		gridpane.add(Text3, 1, 2);
		gridpane.add(knop, 2, 2);
		//Styling

		getChildren().addAll(rechthoek,gridpane); //voegt rechthoek en gridpane toe aan Invul_paneel
	}
	//actie koppeling
	public void Controleervak(EventHandler<ActionEvent> controlerenvakken) {
		knop.setOnAction(controlerenvakken);
	}
	//actie koppeling


	//controleer methode
	void controleer() {
		Gebrwakken(Text1);
		Gebrbeer(Text2);
		Gebrping(Text3); 
	}
	//controleer methode
	public void Gebrwakken (TextField Text1) {
		Gebrwakken = Integer.parseInt(Text1.getText()); //vertaling naar integer
		//System.out.println("(P)Wak totaal is:"+ Gebrwakken); // debug
	}
	public void Gebrbeer (TextField Text2) {
		Gebrbeer = Integer.parseInt(Text2.getText()); //vertaling naar integer
		//System.out.println("(P)Beer totaal is:"+ Gebrbeer); // debug
	}
	public void Gebrping (TextField Text3) {
		Gebrping = Integer.parseInt(Text3.getText()); //vertaling naar integer
		//System.out.println("(P)Wak totaal is:"+ Gebrping); // debug
	}

	public int getGebrwakken(){
		return Gebrwakken; //geeft gebrwak terug
	}
	public int getGebrbeer(){
		return Gebrbeer; // geeft gebrbeer terug
	}
	public int getGebrping(){
		return Gebrping; // geeft gebrping terug
	}

	public void schakeluitwakveld(boolean isDisabled) {
		Text1.setDisable(isDisabled); //veld in/uit zetten
	}
	public void schakeluitbeerveld(boolean isDisabled) {
		Text2.setDisable(isDisabled); //veld in/uit zetten
	}
	public void schakeluitpingveld(boolean isDisabled) {
		Text3.setDisable(isDisabled); //veld in/uit zetten
	}
	public void schakeluitcontroleerknop(boolean isDisabled) {
		knop.setDisable(isDisabled); //veld in/uit zetten
	}
	public void wakfout() {
		Text1.setStyle("-fx-text-fill: red;"); //indicatie fout
	}
	public void beerfout() {
		Text2.setStyle("-fx-text-fill: red;"); //indicatie fout
	}
	public void pingfout() {
		Text3.setStyle("-fx-text-fill: red;"); //indicatie fout
	}
	public void wakgoed() {
		Text1.setStyle("-fx-text-fill: black;"); //text1 kleur reset
	}
	public void beergoed() {
		Text2.setStyle("-fx-text-fill: black;"); //text2 kleur reset
	}
	public void pinggoed() {
		Text3.setStyle("-fx-text-fill: black;"); //text3 kleur reset
	}
	public void Textvakreset() {
		Text1.setStyle("-fx-text-fill: black;"); //gehele kleur reset
		Text2.setStyle("-fx-text-fill: black;");
		Text3.setStyle("-fx-text-fill: black;");
	}
}
