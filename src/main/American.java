package main;

public class American implements Pizza{

	@Override
	public double price() {
		return 5.0;
	}
	
	@Override
	public String toString(){
		return "American" + ": " + 5.0;
	}
	
}
