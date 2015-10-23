package main.shop.pizza;

import main.shop.Extra;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
	protected List<Extra> extraItems = new ArrayList<Extra>();
	public Pizza(Extra base){
		extraItems.add(base);
	}
	
	public void add(Extra extra){
		this.extraItems.add(extra);
	}
	
	protected double total(){
		double totalExtra = 0;
		for (Extra extra : extraItems) {
			totalExtra = totalExtra + extra.price();
		}
		return totalExtra;
	}
	
	public abstract double price();
}
