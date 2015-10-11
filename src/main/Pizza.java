package main;

abstract public class Pizza {
	
	private double price;
	private String name;
	
	public Pizza(String name){
		this.name = name;
	}

	abstract public double getPrice();
	
	@Override
	public String toString(){
		return name + ": " + price;
	}
}
