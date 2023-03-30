package wakken_game;

import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;

public class Score_Paneel extends StackPane {
	private final Label label;
	private final Label label1;
	private final Label label2;
	private final Label label3;
	
public Score_Paneel() {
	
	 this.label = new Label("Pogingen goed:");
	 this.label.setTranslateX(-180);
	 this.label.setTranslateY(-40);
	 label.setFont(Font.font("Arial",20));
	 
	 this.label1 = new Label();
	 label1.setText("");
	 
	 this.label2 = new Label("Pogingen fout:");
	 this.label2.setTranslateX(-186);
	 this.label2.setTranslateY(-20);
	 label2.setFont(Font.font("Arial",20));
	 
	 
	 this.label3 = new Label();
	 label3.setText("");
	 
	Rectangle rechthoek = new Rectangle(600,100);
	 rechthoek.setFill(Color.RED);
	 
	 this.getChildren().addAll(rechthoek,label,label1,label2,label3);
}
}