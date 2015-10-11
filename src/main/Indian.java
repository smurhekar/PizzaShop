package main;

public class Indian implements Pizza {

	@Override
	public double price() {
		return 4.0;
	}
	
	@Override
	public String toString(){
		return "Indian" + ": " + 4.0;
	}

}
