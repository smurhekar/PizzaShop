package main;

public class American extends Pizza{


	public American(Base base) {
		super(base);
	}

	@Override
	public double price() {
		return 5.0 + base.price();
	}
	
	@Override
	public String toString(){
		return "American" + ": " + (5.0 + base.price());
	}
	
}
