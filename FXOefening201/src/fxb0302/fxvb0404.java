package fxb0302;

import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class fxvb0404 {
private final Label bedragLabel,subtotaalLabel;
private final TextField bedragVak, subtotaalVak;
private final Kassa kassa;

public fxvb0404(GridPane p){
	p.setPadding(new Insets(10,10,10,10));
	p.setVgap(5);
	p.setHgap(5);
	p.setAlignment(Pos.CENTER);
	
	kassa = new Kassa();
	bedragLabel = new Label("Voer bedrag in");
	subtotaalLabel = new Label("Subtotaal");
	
	bedragVak = new TextField();
	bedragVak.setAlignment(Pos.CENTER_RIGHT);
	
	subtotaalVak = new TextField();
	
	subtotaalVak.setEditable(false);
	subtotaalVak.setAlignment(Pos.CENTER_RIGHT);
	
	bedragVak.setOnAction(event -> {
		String invoer = bedragVak.getText();
		double invoerBedrag = Double.parseDouble(invoer);
		
		kassa.telOp(invoerBedrag);
		double st = kassa.getSubtotaal();
		subtotaalVak.setText(String.format("%.2f", st));
		
		bedragVak.setText("");
	});
	
	p.add(bedragLabel, 0, 0);
	p.add(bedragVak, 0, 1);
	p.add(subtotaalLabel, 1, 0);
	p.add(subtotaalVak, 1, 1);
}
}
