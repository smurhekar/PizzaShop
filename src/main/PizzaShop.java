package main;

public class PizzaShop {

	public String order(Pizza... pizzas) {
		double total = 0;
		StringBuilder order = new StringBuilder();
		for (Pizza pizza : pizzas) {
			order.append(pizza.toString()+"\n");
			total = total + pizza.price();
		}
		return order.append("Total="+total).toString();
	}

}
