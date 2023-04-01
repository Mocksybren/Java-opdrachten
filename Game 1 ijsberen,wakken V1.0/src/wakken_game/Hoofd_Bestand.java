package wakken_game;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
//basis import van benodigede classes

public class Hoofd_Bestand extends Application {
	//variabelen declareren
	private Score_Paneel score_paneel;
	private Invul_Paneel invul_paneel;
	private Selectie_Paneel selectie_paneel;
	int poging = 1;
	int scoreg = 0;
	int scoref = 0;
	int wak = 0;
	int beer = 0;
	int ping = 0;
	private int wakgoed;
	private int beergoed;
	private int pinggoed;
	//variabelen declareren

	//App opstart
	public void start(Stage primaryStage) {
		VBox VBox = new VBox();
		Scene scene = new Scene(VBox, 600, 600);

		initLayout(VBox); //Layout verzorging
		primaryStage.setScene(scene);
		primaryStage.setMaxHeight(600);//vaste hoogte
		primaryStage.setMaxWidth(600);//vaste dikte
		primaryStage.setTitle("Ijsberen, wakken & pinguins");
		primaryStage.show();

	}

	private void initLayout(VBox VBox) {
		initheader(VBox); //header paneel
		inittussenpaneel(VBox);//Tussen "lijn"
		StackPane dobbel = initdobbelpaneel(VBox); //koppeling dobbel paneel aan selectie paneel
		initselectiepaneel(VBox, dobbel);			//koppeling dobbel paneel aan selectie paneel
		inittussenpaneel(VBox);//Tussen "lijn"
		initscorepaneel(VBox); //score paneel
		inittussenpaneel(VBox);//Tussen "lijn"
		initinvulpaneel(VBox); //invul paneel
		inittussenpaneel(VBox);//Tussen "lijn"
		//aanroepen van layout
	}

	private void initheader(VBox VBox) {
		//header paneel ophalen
		VBox.getChildren().add(new Header_Paneel());
	}
	private void inittussenpaneel(VBox VBox) {
		//header paneel ophalen
		VBox.getChildren().add(new Tussen_Paneel());
	}
	private void initselectiepaneel(VBox VBox, StackPane dobbel) {
		//selectie paneel ophalen
		selectie_paneel = new Selectie_Paneel(dobbel);
		selectie_paneel.schakeldobbelknopuit(true); //schakel dobbel knop uit
		selectie_paneel.schakeldropdownmenu(true); //schakel dropdown menu uit
		selectie_paneel.setopstartactie(opstartknopactie()); //actie koppelen
		selectie_paneel.setopdobbelactie(opdobbelknopactie()); //actie koppelen
		VBox.getChildren().add(selectie_paneel);
	}
	private void initscorepaneel(VBox VBox) {
		//score paneel ophalen
		score_paneel = new Score_Paneel();
		score_paneel.updatescoregoed(0); //basis declaratie score goed
		score_paneel.updatescorefout(0); //basis declaratie score fout
		score_paneel.updtpoginging(1); //basis declaratie pogingen
		VBox.getChildren().add(score_paneel);
	}
	private StackPane initdobbelpaneel(VBox VBox) {
		//dobbelsteen paneel ophalen
		StackPane dobbel = new Dobbel_Paneel(null);
		VBox.getChildren().add(dobbel);
		return dobbel; //koppeling variabel voor selectie paneel
	}
	private void initinvulpaneel(VBox VBox) {
		//invul paneel ophalen
		invul_paneel = new Invul_Paneel();
		invul_paneel.schakeluitwakveld(true); //schakel invulveld 1 uit
		invul_paneel.schakeluitbeerveld(true); //schakel invulveld 2 uit
		invul_paneel.schakeluitpingveld(true); //schakel invulveld 3 uit
		invul_paneel.schakeluitcontroleerknop(true); //schakel controleer knop uit
		invul_paneel.Controleervak(controlerenvakken()); //Actie koppelen
		VBox.getChildren().add(invul_paneel);
	}

	public void spelen() {
		invul_paneel.schakeluitwakveld(false); //schakel invul veld 1 in
		invul_paneel.schakeluitbeerveld(false); //schakel invul veld 2 in
		invul_paneel.schakeluitpingveld(false); //schakel invul veld 3 in
		invul_paneel.schakeluitcontroleerknop(false); //schakel controleer knop in
	}

	public EventHandler<ActionEvent> opstartknopactie() { 							//start actie opzetten
		return new EventHandler<ActionEvent>() {
			@Override public void handle(ActionEvent e) {
				selectie_paneel.schakeldobbelknopuit(false); 						//dobbel knop uit
				selectie_paneel.schakeldropdownmenu(false);							//drop down menu uit
				spelen(); 															//zie methode spelen
				selectie_paneel.knop1.setText("Herstarten");					//hernomen start knop naar herstarten
				selectie_paneel.parent.getChildren().clear();					//paneel resetten
				Rectangle rechthoek = new Rectangle(600,260);				//paneel resetten
				rechthoek.setFill(Color.LIGHTGREY);							//paneel resetten
				selectie_paneel.parent.getChildren().addAll(rechthoek); //paneel resetten
				selectie_paneel.schakelherstartknopuit(true);			//schakel start/herstart knop uit
				invul_paneel.Text1.setText("");							//maak veld1 schoon
				invul_paneel.Text2.setText("");							//maak veld2 schoon
				invul_paneel.Text3.setText("");							//maak veld3 schoon
				invul_paneel.schakeluitwakveld(true);					//schakel veld 1 uit
				invul_paneel.schakeluitbeerveld(true);					//schakel veld 2 uit
				invul_paneel.schakeluitpingveld(true);					//schakel veld 3 uit
				invul_paneel.schakeluitcontroleerknop(true);			//schakel controleer knop uit
			}
		};
	}

	private EventHandler<ActionEvent> controlerenvakken() {							//controleer actie opzetten
		return new EventHandler<ActionEvent>() {
			@Override public void handle(ActionEvent e) {
				if(invul_paneel.Text1 == null || invul_paneel.Text2 == null || invul_paneel.Text3 == null ||invul_paneel.Text1.getLength() == 0|| invul_paneel.Text2.getLength() == 0||invul_paneel.Text3.getLength() == 0) {
					WaarschuwingTekstvakken(); //waarschuwing bij tekstvakken leeg
				} else {
					invul_paneel.controleer();	//controleer methode
					selectie_paneel.getWak(); //totaal wakken terug
					selectie_paneel.getBeer(); //totaal beren terug
					selectie_paneel.getPing(); //totaal pinguins terug
					wakken(); //controle wak
					beren(); //controle beer
					pingiuns(); //controle ping
					if(wakgoed == 1 & beergoed == 1 & pinggoed == 1) { //punt toe kennen en resetten van dobbel_paneel
						selectie_paneel.schakeldobbelknopuit(false);
						selectie_paneel.schakeldropdownmenu(false);
						spelen();
						selectie_paneel.knop1.setText("Herstarten");
						selectie_paneel.parent.getChildren().clear();
						Rectangle rechthoek = new Rectangle(600,260);
						rechthoek.setFill(Color.LIGHTGREY);
						selectie_paneel.parent.getChildren().addAll(rechthoek);
						selectie_paneel.schakelherstartknopuit(true);
						invul_paneel.Text1.setText("");
						invul_paneel.Text2.setText("");
						invul_paneel.Text3.setText("");
						score_paneel.updatescoregoed(scoreg = scoreg + 1);
						score_paneel.updtpoginging(poging = 1);
						invul_paneel.schakeluitcontroleerknop(true);
						invul_paneel.schakeluitwakveld(true);
						invul_paneel.schakeluitbeerveld(true);
						invul_paneel.schakeluitpingveld(true);
						invul_paneel.Textvakreset();
						resetdata();
					} else {
						score_paneel.updtpoginging(poging = poging + 1); //poging update
						if (poging == 5) { //na 5 pogingen punt fout toekennen
							score_paneel.updtpoginging(poging = 1);
							score_paneel.updatescorefout(scoref = scoref + 1);
							selectie_paneel.schakeldobbelknopuit(true);
							selectie_paneel.schakeldropdownmenu(true);
							selectie_paneel.schakelherstartknopuit(false);
							invul_paneel.schakeluitcontroleerknop(true);
							invul_paneel.schakeluitwakveld(true);
							invul_paneel.schakeluitbeerveld(true);
							invul_paneel.schakeluitpingveld(true);
							invul_paneel.Textvakreset();
							resetdata();
						}
						if (poging == 3 | poging == 4) { //na 3e en 4e poging een hint laten zien
							laathintzien();
						}
					}
				}
			}
		};
	}



	public EventHandler<ActionEvent> opdobbelknopactie() { //dobbel actie koppeling
		return new EventHandler<ActionEvent>() {
			@Override public void handle(ActionEvent e) {
				Object object = selectie_paneel.dobbelaantal.getValue();
				selectie_paneel.Aantaldobbel = Integer.valueOf((String) object);
				selectie_paneel.spelstart();
				selectie_paneel.schakeldobbelknopuit(true); //schakel dobbel knop uit
				selectie_paneel.schakeldropdownmenu(true); //schakel dorp down menu uit
				selectie_paneel.schakelherstartknopuit(false); //schakel herstart knop in
				invul_paneel.schakeluitcontroleerknop(false); //schakel controleer knop in
				invul_paneel.schakeluitwakveld(false); //schakel veld 1 in
				invul_paneel.schakeluitbeerveld(false); //schakel veld 2 in
				invul_paneel.schakeluitpingveld(false); //schakel veld 3 in
			}
		};
	}

	private void wakken() { //kijken of het gelijk is
		if(selectie_paneel.getWak() == invul_paneel.getGebrwakken()) {
			wakgoed = 1;
			//System.out.println("(W)Wak veld is :"+ selectie_paneel.wak);
			//System.out.println("(WP)Wak veld is :"+ invul_paneel.Gebrwakken);
			//System.out.println("Wak veld is goed:"+ wakgoed);
			invul_paneel.schakeluitwakveld(true);
			invul_paneel.wakgoed();
		} else {
			//System.out.println("(W)Wak veld is :"+ selectie_paneel.wak);
			//System.out.println("(WP)Wak veld is :"+ invul_paneel.Gebrwakken);
			//System.out.println("Wak veld is fout");
			invul_paneel.wakfout();
		}
	}

	private void beren() { //kijken of het gelijk is
		if(selectie_paneel.getBeer() == invul_paneel.getGebrbeer()) {
			beergoed = 1;
			//System.out.println("(B)Beer veld is :"+ selectie_paneel.beer);
			//System.out.println("(BP)Beer veld is :"+ invul_paneel.Gebrbeer);
			//System.out.println("Beer veld is goed:"+ beergoed);
			invul_paneel.schakeluitbeerveld(true);
			invul_paneel.beergoed();
		} else {
			//System.out.println("(B)Beer veld is :"+ selectie_paneel.beer);
			//System.out.println("(BP)Beer veld is :"+ invul_paneel.Gebrbeer);
			//System.out.println("Beer veld is fout");
			invul_paneel.beerfout();
		}
	}
	private void pingiuns() { //kijken of het gelijk is
		if(selectie_paneel.getPing() == invul_paneel.getGebrping()) {
			pinggoed = 1;
			//System.out.println("(P)Ping veld is :"+ selectie_paneel.ping);
			//System.out.println("(PP)Ping veld is :"+ invul_paneel.Gebrping);
			//System.out.println("Ping veld is goed:"+ pinggoed);
			invul_paneel.schakeluitpingveld(true);
			invul_paneel.pinggoed();
		} else {
			/*debug// System.out.println("(P)Ping veld is :"+ selectie_paneel.ping);
		System.out.println("(PP)Ping veld is :"+ invul_paneel.Gebrping);
		System.out.println("Ping veld is fout"); //debug */
			invul_paneel.pingfout();
		}
	}

	private void laathintzien() { //hint opzet en kijken welke hint waar naar toe moet
		ArrayList<String> hints = new ArrayList<String>();
		hints.add("Een wak is het stip dat in het midden van de dobbelsteen zit.");
		hints.add("Het aantal ijsberen zijn de stippen dat rondom de wak zitten.");
		hints.add("De pinguïns zijn de overige stippen die voor de speler onzichtbaar zijn.");
		hints.add("Een dobbelsteen met het getal 5: heeft 1 wak 4 ijsberen en 2 pinguins.");
		Alert a = new Alert(AlertType.INFORMATION);
		a.setTitle("Hint");
		if(wakgoed == 0 & beergoed == 0 & pinggoed == 0) {
			a.setHeaderText((hints.get(3)));
		} else if(wakgoed == 0) {
			a.setHeaderText((hints.get(0)));
		} else if(beergoed == 0) {
			a.setHeaderText((hints.get(1)));
		} else if(pinggoed == 0) {
			a.setHeaderText((hints.get(2)));
		}
		a.show();
	}

	private void WaarschuwingTekstvakken() { //generale waarschuwing voor lege invulvelden
		Alert a = new Alert(AlertType.WARNING);
		a.setTitle("Waarschuwing");
		a.setHeaderText("Zorg er voor dat je alle tekstvakken hebt ingevuld");
		a.show();
	}

	//reset
	private void resetdata() { 
		wakgoed = 0;
		beergoed = 0;
		pinggoed = 0;
	}
	//reset

	public static void main(String[] args) {
		launch(args); //app opstarten
	}
}
