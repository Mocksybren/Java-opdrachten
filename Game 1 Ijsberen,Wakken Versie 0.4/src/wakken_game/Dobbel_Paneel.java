package wakken_game;

import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;

public class Dobbel_Paneel extends StackPane {

	Dobbelsteen dobbelsteen1 = new Dobbelsteen();
	Dobbelsteen dobbelsteen2 = new Dobbelsteen();
	Dobbelsteen dobbelsteen3 = new Dobbelsteen();
	Dobbelsteen dobbelsteen4 = new Dobbelsteen();
	Dobbelsteen dobbelsteen5 = new Dobbelsteen();
	Dobbelsteen dobbelsteen6 = new Dobbelsteen();
	Dobbelsteen dobbelsteen7 = new Dobbelsteen();
	Dobbelsteen dobbelsteen8 = new Dobbelsteen();
	
	
	//Dobbel paneel maken
	public Dobbel_Paneel() {
		Rectangle rechthoek = new Rectangle(600,360);
		rechthoek.setFill(Color.BLUE);
		
		
		getChildren().addAll(rechthoek,dobbelsteen1,dobbelsteen2,dobbelsteen3,dobbelsteen4,dobbelsteen5,dobbelsteen6,dobbelsteen7,dobbelsteen8);
		
		
		final int tussenstuk = 10;
		
		dobbelsteen1.setTranslateX((150 + tussenstuk) * -1 );
		dobbelsteen1.setTranslateY(0);
		
		dobbelsteen2.setTranslateX(-50);
		dobbelsteen2.setTranslateY(0);
		
		dobbelsteen3.setTranslateX(50 + tussenstuk);
		dobbelsteen3.setTranslateY(0);
		
		dobbelsteen4.setTranslateX(160 + tussenstuk);
		dobbelsteen4.setTranslateY(0);
		//boveste laag
		
		//onderste laag
		dobbelsteen5.setTranslateX((150 + tussenstuk) * -1 );
		dobbelsteen5.setTranslateY((100 + tussenstuk) * -1 );
		
		dobbelsteen6.setTranslateX(-50);
		dobbelsteen6.setTranslateY((100 + tussenstuk) * -1 );
		
		dobbelsteen7.setTranslateX(50 + tussenstuk);
		dobbelsteen7.setTranslateY((100 + tussenstuk) * -1 );
		
		dobbelsteen8.setTranslateX(160 + tussenstuk);
		dobbelsteen8.setTranslateY((100 + tussenstuk) * -1 );
		
	}
}
