package fxb0302;

import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public final class kassapaneel extends GridPane{
	private final Label bedragLabel, subtotaalLabel;
	private final TextField bedragVak, subtotaalVak;
	private final Kassa kassa;
	
	public kassapaneel() {
		this.setPadding(new Insets(10,10,10,10));
		this.setVgap(5);
		this.setHgap(5);
		//maak kassa
		kassa = new Kassa();
		
		//maak label
		bedragLabel = new Label("Voer bedrag is");
		subtotaalLabel = new Label("Subtotaal");
		
		//maak tekstvak
		bedragVak = new TextField();
		bedragVak.setAlignment(Pos.CENTER_RIGHT);
		
		subtotaalVak = new TextField();
		subtotaalVak.setAlignment(Pos.CENTER_RIGHT);
		
		//geen wijziging in subtotaal
		subtotaalVak.setEditable(false);
		
		//event handeling
		bedragVak.setOnAction(event -> {
			String invoer = bedragVak.getText();
			double invoerBedrag = Double.parseDouble(invoer);
			
		//bedrag aan kassa
			kassa.telOp(invoerBedrag);
			
		//vraag kassa op niew subtotaal en format
			double st = kassa.getSubtotaal();
			subtotaalVak.setText(String.format("%.2f", st));
			
		//invoervak leeg
			bedragVak.setText("");
			
		//add nodes
			this.add(bedragLabel, 0, 0);
			this.add(bedragVak, 0, 1);
			this.add(subtotaalLabel, 1, 0);
			this.add(subtotaalVak, 1, 1);
		});
	}
}
