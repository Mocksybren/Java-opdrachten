package wakken_game;

import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.layout.HBox;

public class Selectie_Paneel extends StackPane {
	//declaratie variabelen
	private final Label label;
	final Button knop1;
	final Button knop;
	private final HBox hbox;
	int Aantaldobbel;
	StackPane parent;
	int wak;
	int beer;
	int ping;
	ComboBox<String> dobbelaantal = new ComboBox<String>();


	public Selectie_Paneel(StackPane parent) {


		Rectangle rechthoek = new Rectangle(600,30);
		rechthoek.setFill(Color.LIGHTGRAY);

		//label & knop & koppeling Dobbel_Paneel
		label = new Label("Hoeveel Dobbelstenen? ");
		knop = new Button("Dobbel");
		knop1 = new Button("Starten");

		this.parent = parent;

		//Drop down menu maken

		dobbelaantal.getItems().addAll(
				"3","4","5","6","7","8"
				);


		dobbelaantal.getSelectionModel().selectFirst();


		hbox = new HBox();
		hbox.setAlignment(Pos.TOP_CENTER);
		hbox.getChildren().addAll(label,dobbelaantal,knop, knop1);


		getChildren().addAll(rechthoek,hbox);

	}

	void spelstart() {
		Dobbelstenen();
	}
	//actie koppeling
	public void setopstartactie(EventHandler<ActionEvent> opstartknopactie) {
		knop1.setOnAction(opstartknopactie);
	}

	public void setopdobbelactie(EventHandler<ActionEvent> opdobbelknopactie) {
		knop.setOnAction(opdobbelknopactie);
	}
	//actie koppeling
	//in/uit schakelen methodes
	public void schakeldobbelknopuit(boolean isDisabled) {
		knop.setDisable(isDisabled);
	}
	public void schakelherstartknopuit(boolean isDisabled) {
		knop1.setDisable(isDisabled);
	}
	public void schakeldropdownmenu(boolean isDisabled) {
		dobbelaantal.setDisable(isDisabled);
	}
	//in/uit schakelen methodes
	//------------------------------------------------------------------\\
	//dobbelstenen methode
	public void Dobbelstenen() {
		reset();//reset van wak,beer,ping data

		ArrayList<Dobbelsteen>Obbelstenen; //dobbelsteen array
		Dobbelsteen dobbelsteen = null;

		Obbelstenen = new ArrayList<Dobbelsteen>(Aantaldobbel); //dobbelsteen * aantal gekozen

		//positie vast zetten
		for (int i = 0; i< Aantaldobbel; i++){
			//variable tussenstuk declareren
			final int tussenstuk = 20;
			dobbelsteen = new Dobbelsteen();
			//Dobbelsteen offset	
			if( i == 0) {   
				dobbelsteen.setTranslateX((150 + tussenstuk) * -1 );
				dobbelsteen.setTranslateY(65);
			} else if (i == 1) {
				dobbelsteen.setTranslateX(-50);
				dobbelsteen.setTranslateY(65);
			} else if (i == 2) {
				dobbelsteen.setTranslateX(50 + tussenstuk);
				dobbelsteen.setTranslateY(65);
			} else if (i == 3) {
				dobbelsteen.setTranslateX(170 + tussenstuk);
				dobbelsteen.setTranslateY(65);
			} else if (i == 4) {
				dobbelsteen.setTranslateX((150 + tussenstuk) * -1 );
				dobbelsteen.setTranslateY((35 + tussenstuk) * -1 );
			} else if (i == 5) {
				dobbelsteen.setTranslateX(-50);
				dobbelsteen.setTranslateY((35 + tussenstuk) * -1 );
			} else if (i == 6) {
				dobbelsteen.setTranslateX(50 + tussenstuk);
				dobbelsteen.setTranslateY((35 + tussenstuk) * -1 );
			} else if (i == 7) {
				dobbelsteen.setTranslateX(170 + tussenstuk);
				dobbelsteen.setTranslateY((35 + tussenstuk) * -1 );
			} 	
			//positie vast zetten
			//Dobbelsteen offset	
			Obbelstenen.add(dobbelsteen); //dobbelsteen toevoegen aan de ArrayList
		}
		//maak paneel schoon
		parent.getChildren().clear();
		Rectangle rechthoek = new Rectangle(600,260);
		rechthoek.setFill(Color.LIGHTGREY);
		parent.getChildren().addAll(rechthoek);

		//maak paneel licht grijs

		for (Dobbelsteen dobbelsteen1: Obbelstenen){
			dobbelsteen1.dobbel();
		} //tekent de dobbelsteen

		for (Dobbelsteen dobbelsteen1: Obbelstenen){
			wak = wak + dobbelsteen1.getWak();//aantal wakken vaststellen
			beer = beer + dobbelsteen1.getBeer();//aantal beren vaststellen
			ping = ping + dobbelsteen1.getPing();//aantal pinguins vaststellen

		}

		//debug
		//System.out.println("(S)Wak totaal is:"+ wak);
		//System.out.println("(S)Beer totaal is:"+ beer);
		//System.out.println("(S)Ping totaal is:"+ ping);
		//debug


		for(Dobbelsteen dobbelsteen1: Obbelstenen){
			parent.getChildren().add(dobbelsteen1);
		} //voegt de dobbelsteen toe aan dobbel paneel

		//preventie van alle dobbelstenen leeg
		if(wak == 0 & beer == 0 & ping == 0) {
			//System.out.println("(TTTTTT)Wak totaal is:"+ wak);
			//System.out.println("(TTTTTT)Beer totaal is:"+ beer);
			//System.out.println("(TTTTTT)Ping totaal is:"+ ping);
			parent.getChildren().clear();
			spelstart();
		}
		//preventie van alle dobbelstenen leeg
	}

	//reset wak,beer,ping data
	public void reset() {
		wak = 0;
		beer = 0;
		ping = 0;
	}

	//terug krijgen wak data
	public int getWak(){
		return wak;
	}
	//terug krijgen wak data
	//terug krijgen beer data
	public int getBeer(){
		return beer;
	}
	//terug krijgen beer data
	//terug krijgen ping data
	public int getPing(){
		return ping;
	}
	//terug krijgen ping data

}