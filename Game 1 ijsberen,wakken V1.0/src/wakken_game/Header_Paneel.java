package wakken_game;

import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;

public class Header_Paneel extends StackPane{


	public Header_Paneel() {
		//maak titel van de game duidelijk

		Label header = new Label();
		Rectangle rechthoek = new Rectangle(600,50);
		rechthoek.setFill(Color.LIGHTGREY);

		header.setText("ijsberen, wakken & pinguins");
		header.setFont(Font.font("Arial",30));

		this.getChildren().addAll(rechthoek,header);

	}
}
