package wakken_game;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Invul_Paneel extends StackPane {
	private final GridPane gridpane;
	private int Gebrwakken;
	private int Gebrbeer;
	private int Gebrping;
	Button knop = new Button("Controleer");
	TextField Text1 = new TextField("");
	 TextField Text2 = new TextField("");
	 TextField Text3 = new TextField("");
	
	
public Invul_Paneel() {	
	Rectangle rechthoek = new Rectangle(600,100);
	 rechthoek.setFill(Color.GREEN);
	 //initialiseren
	 Label label1 = new Label("Hoeveel wakken?");
	 Label label2 = new Label("Hoeveel ijsberen?");
	 Label label3 = new Label("Hoeveel pinguins?");
	 
	 
	//initialiseren
	 
	 //controleer event
	 
	 knop.setOnAction(controlerenvakken(Text1, Text2, Text3));
		   
		
	 	
	 //Styling
	gridpane = new GridPane();
	
		gridpane.add(label1, 0, 0);
		gridpane.add(label2, 0, 1);
		gridpane.add(label3, 0, 2);
		gridpane.add(Text1, 1, 0);
		gridpane.add(Text2, 1, 1);
		gridpane.add(Text3, 1, 2);
		gridpane.add(knop, 2, 2);
	//Styling
	
	 
	 
	 
	 
	 getChildren().addAll(rechthoek,gridpane);
}

public void Controleervak(EventHandler<ActionEvent> controlerenvakken) {
	knop.setOnAction(controlerenvakken(Text1, Text2, Text3));
}


private EventHandler<ActionEvent> controlerenvakken(TextField Text1, TextField Text2, TextField Text3) {
	return new EventHandler<ActionEvent>() {
		    @Override public void handle(ActionEvent e) {
		    	controleer(Text1, Text2, Text3);
		    }
		};
}

private void controleer(TextField Text1, TextField Text2, TextField Text3) {
	Gebrwakken = Integer.parseInt(Text1.getText());
	 Gebrbeer = Integer.parseInt(Text2.getText());
	 Gebrping = Integer.parseInt(Text3.getText());
	 //debug
		 System.out.println("Wak totaal is:"+ Gebrwakken);
		 System.out.println("Beer totaal is:"+ Gebrbeer);
		 System.out.println("Ping totaal is:"+ Gebrping);
	//debug	 
}

public int getGebrwakken(){
	return Gebrwakken;
}
public int getGebrbeer(){
	return Gebrbeer;
}
public int getGebrping(){
	return Gebrping;
}

	
}
