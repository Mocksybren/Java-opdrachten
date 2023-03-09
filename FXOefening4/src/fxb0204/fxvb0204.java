package fxb0204;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;

public class fxvb0204 {
	private final Button knop, herstelknop;
	private final TextField tekstvak;
	
	public fxvb0204(FlowPane p) {
		knop = new Button( "klik" );
		tekstvak = new TextField();
		herstelknop = new Button ( "Veeg uit" );
		
		
		knop.setOnAction(event -> {
		tekstvak.setText("Je hebt geklikt!");
		});
		
		herstelknop.setOnAction(event -> {
			tekstvak.setText("");
		});
		p.getChildren().add(knop);
		p.getChildren().add(tekstvak);
		p.getChildren().add(herstelknop);
	}
}
