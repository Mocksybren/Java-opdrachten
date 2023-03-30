package wakken_game;

import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;


public class Dobbel_Paneel extends StackPane {

	//Dobbel paneel maken
	public Dobbel_Paneel(StackPane p) {
		Rectangle rechthoek = new Rectangle(600,260);
		rechthoek.setFill(Color.BLUE);

		getChildren().add(rechthoek);
	}

}
