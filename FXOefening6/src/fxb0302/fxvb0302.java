package fxb0302;

import javafx.scene.layout.Pane; 
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class fxvb0302 {
	private final int a, b, som, verschil, product, quotient, rest;
	private final Text tekstab, tekstsom, tekstverschil, tekstproduct, tekstquotient, tekstrest;
	
	
	public fxvb0302(Pane p) {
		a = 10;
		b = 8;
		som = a + b;
		verschil = a - b;
		product = a * b;
		quotient = a / b;
		rest = a % b;
		
		tekstab = new Text(50,20, "a = " + a + " en b = " + b);
		tekstsom = new Text(50,50, "De som is " + som);
		tekstverschil = new Text(50,70, "Het verschil is " + verschil);
		tekstproduct = new Text(50,90, "Het product is " + product);
		tekstquotient = new Text(50, 110, "Het quitient is " + quotient);
		tekstrest = new Text(50,130, "De rest is " + rest);
	
	p.getChildren().addAll(tekstab,tekstsom,tekstverschil,tekstproduct,tekstquotient,tekstrest);
}
	}
