package fxvb0202;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;

public class FXVb0202 {
	private final Button knop;
	private final TextField tekstvak;
	private final TextField tekstvak2;
	
	public FXVb0202(FlowPane p) {
		knop = new Button( "Klik" );
		tekstvak = new TextField();
		tekstvak2 = new TextField();
		
		p.getChildren().add(knop);
		p.getChildren().add(tekstvak);
		p.getChildren().add(tekstvak2);
	}

}
