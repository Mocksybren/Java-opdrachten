package wakken_game;

import java.util.ArrayList;

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
				knop.setOnAction( event -> {
				    Object object = dobbelaantal.getValue();
					Aantaldobbel = Integer.valueOf((String) object);
					System.out.println(Aantaldobbel);
					Setdobbelaantal(Aantaldobbel);
					Dobbelstenen();
				});
				
		getChildren().addAll(rechthoek,hbox);

			
		
}
public void Dobbelstenen() {
	ArrayList<String> dobbelarray = new ArrayList<String>();
		dobbelarray.add("dobbelsteen1");
		dobbelarray.add("dobbelsteen2");
		dobbelarray.add("dobbelsteen3");
		dobbelarray.add("dobbelsteen4");
		dobbelarray.add("dobbelsteen5");
		dobbelarray.add("dobbelsteen6");
		dobbelarray.add("dobbelsteen7");
		dobbelarray.add("dobbelsteen8");
	System.out.println(dobbelarray);
	//dobbelarray.forEach((n) -> Dobbelsteen n = new Dobbelsteen());
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
	//|
	//|
} else if(Aantaldobbel == 4) {
	parent.getChildren().addAll(dobbelsteen1,dobbelsteen2,dobbelsteen3,dobbelsteen4);
	//|
	//|
	//|
} else if(Aantaldobbel == 5) {
	parent.getChildren().addAll(dobbelsteen1,dobbelsteen2,dobbelsteen3,dobbelsteen4,dobbelsteen5);
	//|
	//|
	//|
	//|
} else if(Aantaldobbel == 6) {
	parent.getChildren().addAll(dobbelsteen1,dobbelsteen2,dobbelsteen3,dobbelsteen4,dobbelsteen5,dobbelsteen6);
	//|
	//|
	//|
	//|
	//|
} else if(Aantaldobbel == 7) {
	parent.getChildren().addAll(dobbelsteen1,dobbelsteen2,dobbelsteen3,dobbelsteen4,dobbelsteen5,dobbelsteen6,dobbelsteen7);
	//|
	//|
	//|
	//|
	//|
	//|
} else if(Aantaldobbel == 8) {
	parent.getChildren().addAll(dobbelsteen1,dobbelsteen2,dobbelsteen3,dobbelsteen4,dobbelsteen5,dobbelsteen6,dobbelsteen7,dobbelsteen8);
	//|
	//|
	//|
	//|
	//|
	//|
	//|
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

	
	}

public void Setdobbelaantal(int aantaldobbel) {
	this.aantaldobbelstenen = aantaldobbel;}
}
