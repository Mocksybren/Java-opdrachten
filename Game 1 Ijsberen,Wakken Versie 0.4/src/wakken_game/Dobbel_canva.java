package wakken_game;

import javafx.geometry.*;
import javafx.scene.canvas.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class Dobbel_canva extends StackPane {
	private final Canvas canvas;
	private final GraphicsContext gc;
	private final HBox hbox;
	private final Label label;
	private final Button knop;
	int Dobbel;
	
	
	@SuppressWarnings("unchecked")
	public Dobbel_canva(VBox p) {
		label = new Label("Hoeveel Dobbelstenen? ");
		knop = new Button("Dobbel");
		
		@SuppressWarnings("rawtypes")
		final ComboBox dobbelaantal = new ComboBox();
			dobbelaantal.getItems().addAll(
					"3","4","5","6","7","8"
					);
		
		hbox = new HBox();
		hbox.setAlignment(Pos.BASELINE_CENTER);
		hbox.getChildren().addAll(label,dobbelaantal,knop);
		
		canvas = new Canvas(250,250);
		gc = canvas.getGraphicsContext2D();		
		p.getChildren().addAll(hbox,canvas);
		
		//event
		knop.setOnAction( event -> {
		    Object object = dobbelaantal.getValue();
			Dobbel = Integer.valueOf((String) object);
			
			
				//Dobbelsteen dob1 = new Dobbelsteen(p);
				//Dobbelsteen dob2 = new Dobbelsteen(p);
				//Dobbelsteen dob3 = new Dobbelsteen(p);
				//Dobbelsteen dob4 = new Dobbelsteen(p);
				//Dobbelsteen dob5 = new Dobbelsteen(p);
				//Dobbelsteen dob6 = new Dobbelsteen(p);
				//Dobbelsteen dob7 = new Dobbelsteen(p);
				//Dobbelsteen dob8 = new Dobbelsteen(p);	
			
		
			
			
			
			
		});
		
		
		
}
	}
