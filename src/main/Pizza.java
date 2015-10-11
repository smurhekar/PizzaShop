package main;

public enum Pizza {
	
	AMERICAN("American",5.0),
	INDIAN("Indian",4.0),
	MEXICAN("Mexican",6.0);

	private double price;
	private String name;

	private Pizza(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName(){
		return name;
	}
	
	public double getPrice(){
		return price;
	}
	
	@Override
	public String toString(){
		return name + ": " + price;
	}
}
