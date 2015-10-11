package main;

public class PizzaShop {

	public String order(Pizza pizza) {
		return pizza.getName() + ": " + pizza.getPrice();
	}

}
