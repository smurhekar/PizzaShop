package main;

public abstract class Pizza {
	protected Base base;
	public Pizza(Base base){
		this.base = base;
	}
	
	public abstract double price();
}
