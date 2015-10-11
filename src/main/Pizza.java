package main;

public class Pizza {
	
	public final static Pizza AMERICAN = new Pizza("American",5.0);
	public final static Pizza INDIAN = new Pizza("Indian",4.0);
	public final static Pizza MEXICAN = new Pizza("Mexican",6.0);

	private double price;
	private String name;

	private Pizza(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public double getPrice(){
		return price;
	}
	
	@Override
	public String toString(){
		return name + ": " + price;
	}
}
