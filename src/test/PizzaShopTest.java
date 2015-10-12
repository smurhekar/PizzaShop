package test;

import static org.junit.Assert.assertEquals;
import main.American;
import main.Indian;
import main.Normal;
import main.PizzaShop;
import main.Wheat;

import org.junit.Test;


public class PizzaShopTest {
	
	@Test
	public void shouldBeAbleToOrderPizza(){
		PizzaShop shop = new PizzaShop();
		assertEquals("American: 5.0\nTotal=5.0", shop.order(new American(new Normal())));
	}
	
	@Test
	public void shouldBeAbleToOrderMoreThanOnePizza(){
		PizzaShop shop = new PizzaShop();
		assertEquals("American: 5.0\nIndian: 4.0\nTotal=9.0", shop.order(new American(new Normal()), new Indian(new Normal())));
	}
	
	@Test
	public void shouldBeAbleToOrderAmericanPizzaWithWheatBase(){
		PizzaShop shop = new PizzaShop();
		assertEquals("American: 6.0\nTotal=6.0", shop.order(new American(new Wheat())));
	}
}
