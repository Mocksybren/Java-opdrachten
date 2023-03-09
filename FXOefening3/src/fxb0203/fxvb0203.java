package fxb0203;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;

public class fxvb0203 {
	private final Button knop;
	private final TextField tekstvak;
	
	public fxvb0203(FlowPane p) {
		knop = new Button( "Klik");
		tekstvak = new TextField();
		
		knop.setOnAction(event -> {
			tekstvak.setText("Je hebt geklikt!");
		});
	p.getChildren().add( knop );
	p.getChildren().add (tekstvak );
}}