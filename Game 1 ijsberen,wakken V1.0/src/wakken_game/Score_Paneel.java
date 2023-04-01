package wakken_game;

import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;

public class Score_Paneel extends StackPane {
	//declaratie variabelen
	private final Label pogingG;
	private  Label label1;
	private final Label label2;
	private  Label label3;
	private final Label label4;

	public Score_Paneel() {
		//initialisering
		pogingG = new Label("Pogingen goed:");
		pogingG.setTranslateX(-180);
		pogingG.setTranslateY(-40);
		pogingG.setFont(Font.font("Arial",20));

		label1 = new scoreg("");

		label2 = new Label("Pogingen fout:");
		label2.setTranslateX(-186);
		label2.setTranslateY(-10);
		label2.setFont(Font.font("Arial",20));

		label3 = new scoref("");

		label4 = new poging("");
		//initialisering


		Rectangle rechthoek = new Rectangle(600,100);
		rechthoek.setFill(Color.GREY);

		this.getChildren().addAll(rechthoek,pogingG,label1,label2,label3,label4);
	}

	//update methodes
	public void updatescoregoed(int score) {
		label1.setText(Integer.toString(score));
	}
	public void updatescorefout(int score) {
		label3.setText(Integer.toString(score));
	}
	public void updtpoginging(int poging) {
		String text = "Poging: " + poging + " van de 5";
		label4.setText((text));
	}
	//update methodes
	//label setup
	private class scoreg extends Label {
		public scoreg (String label) {
			super(label);
			setTranslateX(-90);
			setTranslateY(-40);
			setFont(Font.font("Arial",20));
			setStyle("-fx-text-fill: green;");
		}
	}
	private class scoref extends Label {
		public scoref (String label) {
			super(label);
			setTranslateX(-90);
			setTranslateY(-10);
			setFont(Font.font("Arial",20));
			setStyle("-fx-text-fill: red;");
		}
	}
	private class poging extends Label {
		public poging (String label) {
			super(label);
			setTranslateX(-167);
			setTranslateY(20);
			setFont(Font.font("Arial",20));
		}
	}
	//label setup

}