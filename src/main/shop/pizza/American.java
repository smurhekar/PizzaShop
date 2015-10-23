package main.shop.pizza;

import main.shop.Extra;

public class American extends Pizza {


	public American(Extra base) {
		super(base);
	}

	@Override
	public double price() {
		return 5.0 + total();
	}
	
	@Override
	public String toString(){
		return "American" + ": " + (5.0 + total());
	}

}
