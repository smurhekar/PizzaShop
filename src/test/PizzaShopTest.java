package test;

//import static main.Pizza.AMERICAN;
//import static main.Pizza.INDIAN;
import static org.junit.Assert.assertEquals;
import main.American;
import main.Indian;
import main.Pizza;
import main.PizzaShop;

import org.junit.Test;


public class PizzaShopTest {
	
	@Test
	public void shouldBeAbleToOrderPizza(){
		PizzaShop shop = new PizzaShop();
		Pizza americanPizza = new American();
		
		assertEquals("American: 5.0\nTotal=5.0", shop.order(americanPizza));
	}
	
	@Test
	public void shouldBeAbleToOrderMoreThanOnePizza(){
		PizzaShop shop = new PizzaShop();
		Pizza american = new American();
		Pizza indian = new Indian();
		assertEquals("American: 5.0\nIndian: 4.0\nTotal=9.0", shop.order(american, indian));
	}
}
