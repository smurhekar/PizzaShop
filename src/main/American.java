package main;

public class American extends Pizza{

	public American() {
		super("American");
	}

	@Override
	public double getPrice() {
		return 5.0;
	}
	
	@Override
	public String toString(){
		return "American" + ": " + 5.0;
	}
	
}
