package wakken_game;

//Imports van benodigde classes
import java.util.Random;
import javafx.geometry.Pos;
import javafx.scene.canvas.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
//Imports van benodigde classes

public class Dobbelsteen extends StackPane {
	//Variable creatie
	private final Canvas canvas;
	private final GraphicsContext gc;
	private final HBox hbox;

	private int worp;
	private int zijdes = 6;
	int wak = 0;
	int ping = 0;
	int beer = 0;
	//Variable creatie
	public Dobbelsteen() {
		//random waarde tussen 1 en 6
		dobbel();
		//random waarde tussen 1 en 6
		//Canvas gedeelte openen
		hbox = new HBox();
		hbox.setAlignment(Pos.BASELINE_CENTER);
		hbox.getChildren().addAll();


		canvas = new Canvas(120,120);
		gc = canvas.getGraphicsContext2D();		
		getChildren().addAll(hbox,canvas);
		//Canvas gedeelte openen
		//Canvas schoonmaken
		gc.clearRect (0,0,
				canvas.getWidth(),canvas.getHeight());
		//Canvas schoonmaken
		//Canvas voorbereiden voor de dobbelsteen ogen
		gc.setFill(Color.BLACK);
		//Canvas voorbereiden voor de dobbelsteen ogen
		//dobbel vierkant afgerond
		gc.strokeRoundRect(10, 10, 100, 100, 10, 10);
		//dobbel vierkant afgerond
		//--------------------------------------------------------------------------------------------------------------------------\\
		if(worp == 1) {	
			//Dobbel 1

			gc.fillOval(50, 50, 20, 20);
			//System.out.println("worp is " + worp); //debug
			wak = 1;
			ping = 6;
			beer = 0;

			//Dobbel 1
		} else if (worp == 2){
			//Dobbel 2

			gc.fillOval(67, 32, 20, 20);
			gc.fillOval(32, 67, 20, 20);
			//System.out.println("worp is " + worp); //debug

			//Dobbel 2
		} else if (worp == 3){
			//Dobbel 3

			gc.fillOval(72,28, 20, 20);
			gc.fillOval(50,50, 20, 20);
			gc.fillOval(28,72, 20, 20);
			//System.out.println("worp is " + worp); //debug
			wak = 1;
			ping = 4;
			beer = 2;

			//Dobbel 3
		} else if (worp == 4) {
			//Dobbel 4

			gc.fillOval(30, 30, 20, 20);
			gc.fillOval(70, 30, 20, 20);
			gc.fillOval(30, 70, 20, 20);
			gc.fillOval(70, 70, 20, 20);
			//System.out.println("worp is " + worp); //debug

			//Dobbel 4
		} else if (worp == 5) {
			//Dobbel 5

			gc.fillOval(50, 50, 20, 20);
			gc.fillOval(30, 30, 20, 20);
			gc.fillOval(70, 30, 20, 20);
			gc.fillOval(30, 70, 20, 20);
			gc.fillOval(70, 70, 20, 20);	
			//System.out.println("worp is " + worp); //debug
			wak = 1;
			ping = 2;
			beer = 4;





			//Dobbel 5
		} else if (worp == 6) {
			//Dobbel 6

			gc.fillOval(30, 20, 20, 20);
			gc.fillOval(30, 50, 20, 20);
			gc.fillOval(30, 80, 20, 20);
			gc.fillOval(70, 20, 20, 20);
			gc.fillOval(70, 50, 20, 20);
			gc.fillOval(70, 80, 20, 20);
			//System.out.println("worp is " + worp); //debug

			//Dobbel 6
		}	
		gc.fill();
	};
	//--------------------------------------------------------------------------------------------------------------------------\\			

	//Dobbelen random waarde tussen 1 en 6
	public void dobbel() {
		Random rand = new Random();
		worp = rand.nextInt( zijdes ) + 1;
	}
	//Dobbelen random waarde tussen 1 en 6
	//Worp terug geven
	public int getWorp() {
		return worp;
	}
	//Worp terug geven
	//Wak terug geven
	public int getWak() {
		return wak;
	}
	//Wak terug geven
	//Beer terug geven
	public int getBeer(){
		return beer;
	}
	//Beer terug geven
	//Ping terug geven
	public int getPing(){
		return ping;
	}
	//Ping terug geven

}