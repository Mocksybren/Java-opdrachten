package ijsberen_wakken;

import java.util.Random;

public class Dobbelsteen {

	private int worp;
	private int zijdes = 6;
	
	public Dobbelsteen() {
		
	}
	
	public void dobbel() {
		Random rand = new Random();
		worp = rand.nextInt( zijdes ) + 1;
	}
	public int getWorp() {
		return worp;
	}
}