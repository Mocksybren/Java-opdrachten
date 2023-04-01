package wakken_game;

import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;


public class Dobbel_Paneel extends StackPane {

	private  Label label1;

	//Dobbel paneel maken
	public Dobbel_Paneel(StackPane p) {

		Rectangle rechthoek = new Rectangle(600,260);
		rechthoek.setFill(Color.LIGHTGRAY);
		//Uitleg spel
		label1 = new Label("Het is een denkspelletje dat gebaseerd is op enkele dobbelstenen. Aan de hand van de dobbelstenen is het de bedoeling dat de speler het totaal aantal wakken, ijsberen en pinguïns raadt met het aantal stippen die er op zitten.\n"
				+ "\n"
				+ "Je hebt de keuze om 3 tot 6 dobbelstenen te gooien. Een wak is het stip dat in het midden van de dobbelsteen zit. Het aantal ijsberen zijn de stippen dat rondom de wak zitten. De pinguïns zijn de overige stippen die voor de speler onzichtbaar zijn. Per dobbelsteen heeft in totaal 7 stippen (1 stip in het midden en 6 rondom het stip). ");
		label1.setWrapText(true);
		//Uitleg spel
		getChildren().addAll(rechthoek,label1);
	}

}
