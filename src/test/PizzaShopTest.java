package test;

import static main.Pizza.AMERICAN;
import static org.junit.Assert.assertEquals;
import main.PizzaShop;

import org.junit.Test;


public class PizzaShopTest {
	
	@Test
	public void shouldBeAbleToOrderPizza(){
		PizzaShop shop = new PizzaShop();
		assertEquals("American: 5.0", shop.order(AMERICAN));
	}
}
