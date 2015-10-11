package main;

public class Indian extends Pizza {

	public Indian() {
		super("Indian");
	}

	@Override
	public double getPrice() {
		return 4.0;
	}
	
	@Override
	public String toString(){
		return "Indian" + ": " + 4.0;
	}

}
