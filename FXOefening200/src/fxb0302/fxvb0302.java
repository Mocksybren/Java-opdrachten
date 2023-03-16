package fxb0302;

import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.geometry.*;

public class fxvb0302 {
	private final Label tekstZonder, TekstMet;
	private final TextField invoervak, uitvoervak;
	private final Button knop;
	private final double percentageBTW;
	
	public fxvb0302(GridPane p) {
		percentageBTW = 21.0;
		p.setVgap(5);
		p.setHgap(5);
		p.setPadding(new Insets(10,10,10,10));
		
		tekstZonder = new Label("Prijs zonder BTW");
		invoervak = new TextField();
		invoervak.setAlignment(Pos.CENTER_RIGHT);
		
		TekstMet = new Label("Prijs met BTW");
		uitvoervak = new TextField();
		uitvoervak.setAlignment(Pos.CENTER_RIGHT);
		uitvoervak.setEditable(false);
		
		knop = new Button("Opnieuw");
		
		//Event handling
		invoervak.setOnAction(event -> {
			String invoer = invoervak.getText();
			double invoerGetal = Double.parseDouble(invoer);
			// Format in
			invoervak.setText(String.format("%.2f", invoerGetal));
			
			double uitvoerGetal = (1 + percentageBTW/100 ) * invoerGetal;
		//format uit
		uitvoervak.setText(String.format("%.2f", uitvoerGetal));
		});
		knop.setOnAction(event -> {
			invoervak.clear();
			uitvoervak.clear();
		});
		p.add(tekstZonder, 0, 0);
		p.add(invoervak, 1, 0);
		p.add(TekstMet, 0, 1);
		p.add(uitvoervak, 1, 1);
		p.add(knop, 1, 2);
		}
	}
