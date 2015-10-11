package test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import main.PizzaShop;


public class PizzaShopTest {
	
	@Test
	public void shouldBeAbleToOrderPizza(){
		PizzaShop shop = new PizzaShop();
		assertEquals("American: 5.0", shop.order("American", 5d));
	}
}
