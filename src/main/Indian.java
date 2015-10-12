package main;

public class Indian extends Pizza {

	public Indian(Base base) {
		super(base);
	}

	@Override
	public double price() {
		return 4.0;
	}
	
	@Override
	public String toString(){
		return "Indian" + ": " + 4.0;
	}

}
