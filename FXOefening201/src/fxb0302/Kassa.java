package fxb0302;

public class Kassa {
	private double subtotaal;	
	
	public void telOp(double bedrag) {
		subtotaal += bedrag;
	};
	public double getSubtotaal() {
		return subtotaal;
	};
	}
