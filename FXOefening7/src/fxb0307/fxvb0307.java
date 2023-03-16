package fxb0307;

import javafx.scene.layout.Pane; 
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import fxb0307.Dobbelsteen;

public class fxvb0307 {
private final Rectangle v;
private final Circle c1,c2,c3;

public fxvb0307(Pane p) {	 
	

				v = new Rectangle(10,10,120,120);
				v.setFill(Color.WHITE);
				v.setStroke(Color.BLACK);
				v.setArcHeight(20);
				v.setArcWidth(20);
	
				c1 = new Circle(70,70,12);
				c1.setFill(Color.BLACK);
				c2 = new Circle(35,35,12);
				c2.setFill(Color.BLACK);
				c3 = new Circle(105,105,12);
				c3.setFill(Color.BLACK);

	p.getChildren().addAll(v,c1,c2,c3);
	}
}


