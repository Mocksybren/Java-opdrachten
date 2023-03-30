package wakken_game;

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
	private final Label label;
	final Button knop;
	private final HBox hbox;
	private int Aantaldobbel;
	@SuppressWarnings("unused")
	private int aantaldobbelstenen;	
	private StackPane parent;
	private int wak = 0;
	private int beer = 0;
	private int ping = 0;
	private int worp = 0;

	
public Selectie_Paneel(StackPane parent) {

	
	Rectangle rechthoek = new Rectangle(600,30);
	rechthoek.setFill(Color.DARKMAGENTA);
	
	//label & knop & koppeling Dobbel_Paneel
	label = new Label("Hoeveel Dobbelstenen? ");
	knop = new Button("Dobbel");
	this.parent = parent;
	
	//Drop down menu maken
	final ComboBox<String> dobbelaantal = new ComboBox<String>();
		dobbelaantal.getItems().addAll(
				"3","4","5","6","7","8"
				);
		
		hbox = new HBox();
		hbox.setAlignment(Pos.TOP_CENTER);
		hbox.getChildren().addAll(label,dobbelaantal,knop);
		
		//event
			/*	knop.setOnAction( event -> {
				    Object object = dobbelaantal.getValue();
					Aantaldobbel = Integer.valueOf((String) object);
					Dobbelstenen();
					wak = 0;
					beer = 0;
					ping = 0;
				});
			*/
		
		knop.setOnAction(opdobbelknopactie(dobbelaantal));
		
		getChildren().addAll(rechthoek,hbox);

			
		
}

private void spelstart() {
	Dobbelstenen();
	wak = 0;
	beer = 0;
	ping = 0;
}

private EventHandler<ActionEvent> opdobbelknopactie(final ComboBox<String> dobbelaantal) {
	return new EventHandler<ActionEvent>() {
	    @Override public void handle(ActionEvent e) {
	    	 Object object = dobbelaantal.getValue();
				Aantaldobbel = Integer.valueOf((String) object);
				spelstart();
	    }
	};
}

public void Dobbelstenen() {

	//individuele dobbelstenen maken

		Dobbelsteen dobbelsteen1 = new Dobbelsteen();
		Dobbelsteen dobbelsteen2 = new Dobbelsteen();
		Dobbelsteen dobbelsteen3 = new Dobbelsteen();
		Dobbelsteen dobbelsteen4 = new Dobbelsteen();
		Dobbelsteen dobbelsteen5 = new Dobbelsteen();
		Dobbelsteen dobbelsteen6 = new Dobbelsteen();
		Dobbelsteen dobbelsteen7 = new Dobbelsteen();
		Dobbelsteen dobbelsteen8 = new Dobbelsteen();
	

//inviduele dobbelstenen maken
			//maak paneel schoon
			parent.getChildren().clear();
			Rectangle rechthoek = new Rectangle(600,260);
			rechthoek.setFill(Color.BLUE);
			parent.getChildren().addAll(rechthoek);
			
			//maak paneel blauw
	//aantal dobbelstenen
		
if(Aantaldobbel == 3) {
		parent.getChildren().addAll(dobbelsteen1,dobbelsteen2,dobbelsteen3);
} else if(Aantaldobbel == 4) {
	parent.getChildren().addAll(dobbelsteen1,dobbelsteen2,dobbelsteen3,dobbelsteen4);
} else if(Aantaldobbel == 5) {
	parent.getChildren().addAll(dobbelsteen1,dobbelsteen2,dobbelsteen3,dobbelsteen4,dobbelsteen5);
} else if(Aantaldobbel == 6) {
	parent.getChildren().addAll(dobbelsteen1,dobbelsteen2,dobbelsteen3,dobbelsteen4,dobbelsteen5,dobbelsteen6);
} else if(Aantaldobbel == 7) {
	parent.getChildren().addAll(dobbelsteen1,dobbelsteen2,dobbelsteen3,dobbelsteen4,dobbelsteen5,dobbelsteen6,dobbelsteen7);
} else if(Aantaldobbel == 8) {
	parent.getChildren().addAll(dobbelsteen1,dobbelsteen2,dobbelsteen3,dobbelsteen4,dobbelsteen5,dobbelsteen6,dobbelsteen7,dobbelsteen8);
} else {
	System.out.println("Error");
}
		
		
		
		
		//variable tussenstuk declareren
		final int tussenstuk = 20;

//Dobbelsteen offset		
		
		//Dobbelsteen 1
		dobbelsteen1.setTranslateX((150 + tussenstuk) * -1 );
		dobbelsteen1.setTranslateY(65);
		
		//Dobbelsteen 2
		dobbelsteen2.setTranslateX(-50);
		dobbelsteen2.setTranslateY(65);
		
		//Dobbelsteen 3
		dobbelsteen3.setTranslateX(50 + tussenstuk);
		dobbelsteen3.setTranslateY(65);
		
		//Dobbelsteen 4
		dobbelsteen4.setTranslateX(170 + tussenstuk);
		dobbelsteen4.setTranslateY(65);
		//boveste laag
		
		//onderste laag
		//Dobbelsteen 5
		dobbelsteen5.setTranslateX((150 + tussenstuk) * -1 );
		dobbelsteen5.setTranslateY((35 + tussenstuk) * -1 );
		
		//Dobbelsteen 6
		dobbelsteen6.setTranslateX(-50);
		dobbelsteen6.setTranslateY((35 + tussenstuk) * -1 );
		
		//Dobbelsteen 7
		dobbelsteen7.setTranslateX(50 + tussenstuk);
		dobbelsteen7.setTranslateY((35 + tussenstuk) * -1 );
		
		//Dobbelsteen 8
		dobbelsteen8.setTranslateX(170 + tussenstuk);
		dobbelsteen8.setTranslateY((35 + tussenstuk) * -1 );
		
//Dobbelsteen offset	

		
												int worp1 = dobbelsteen1.getWorp();
												int worp2 = dobbelsteen2.getWorp();
												int worp3 = dobbelsteen3.getWorp();
												int worp4 = dobbelsteen4.getWorp();
												int worp5 = dobbelsteen5.getWorp();
												int worp6 = dobbelsteen6.getWorp();
												int worp7 = dobbelsteen7.getWorp();
												int worp8 = dobbelsteen8.getWorp();
												
	for(int i= 0;i < Aantaldobbel; i ++ ) {
		System.out.println("I is:"+ i);
		if(i == 0) {worp = worp1;} else 
			if(i == 1) {worp = worp2;} else 
				if(i == 2) {worp = worp3;} else 
					if(i == 3) {worp = worp4;} else 
						if(i == 4) {worp = worp5;} else 
							if(i == 5) {worp = worp6;} else 
								if(i == 6) {worp = worp7;} else 
									if(i == 7) {worp = worp8;}
																		if(worp == 1) {
																			wak  += 1;
																			ping += 6;
																			beer += 0;
																		} else if(worp == 3) {
																			wak += 1;
																			ping += 4;
																			beer += 2;
																		} else if((worp == 5)) {
																			wak += 1;
																			ping += 2;
																			beer += 4;
																		} else {
																			wak += 0;
																			ping += 0;
																			beer += 0;
																		}
																		}
	setWak(wak);
	setBeer(beer);
	setPing(ping);
																	
																		System.out.println("Wak totaal is:"+ wak);
																		System.out.println("Beer totaal is:"+ beer);
																		System.out.println("Ping totaal is:"+ ping);
		
	}
public int getWak(){
		return wak;
	}
public int getBeer(){
		return beer;
}
public int getPing(){
		return ping;
}
public void setWak(int wak) {
	this.wak = wak;
}
public void setBeer(int beer) {
	this.beer = beer;
}
public void setPing(int ping) {
	this.ping = ping;
}

}





