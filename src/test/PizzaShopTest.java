package test;

import static main.Pizza.AMERICAN;
import static main.Pizza.INDIAN;
import static org.junit.Assert.assertEquals;
import main.PizzaShop;

import org.junit.Test;


public class PizzaShopTest {
	
	@Test
	public void shouldBeAbleToOrderPizza(){
		PizzaShop shop = new PizzaShop();
		assertEquals("American: 5.0\nTotal=5.0", shop.order(AMERICAN));
	}
	
	@Test
	public void shouldBeAbleToOrderMoreThanOnePizza(){
		PizzaShop shop = new PizzaShop();
		assertEquals("American: 5.0\nIndian: 4.0\nTotal=9.0",shop.order(AMERICAN, INDIAN));
	}
}
