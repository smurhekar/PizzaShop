package main.shop.pizza;

import main.shop.Extra;

public class Indian extends Pizza {

	public Indian(Extra base) {
		super(base);
	}

	@Override
	public double price() {
		return 4.0 + total();
	}
	
	@Override
	public String toString(){
		return "Indian" + ": " + (4.0 + total());
	}

}
