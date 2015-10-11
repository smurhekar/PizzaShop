package test;

import static org.junit.Assert.assertEquals;
import main.American;
import main.Indian;
import main.PizzaShop;

import org.junit.Test;


public class PizzaShopTest {
	
	@Test
	public void shouldBeAbleToOrderPizza(){
		PizzaShop shop = new PizzaShop();
		assertEquals("American: 5.0\nTotal=5.0", shop.order(new American()));
	}
	
	@Test
	public void shouldBeAbleToOrderMoreThanOnePizza(){
		PizzaShop shop = new PizzaShop();
		assertEquals("American: 5.0\nIndian: 4.0\nTotal=9.0", shop.order(new American(), new Indian()));
	}
}
