package com.eshop;

import org.junit.Test;

import com.eshop.Basket;
import com.eshop.EBasket;
import com.eshop.Fruit;
import com.eshop.Item;

import junit.framework.Assert;

public class BasketTest {
	
	@Test
	public void testCreateEmptyShoppingBasket() {
		Basket cart = new EBasket();
		Assert.assertEquals(0, cart.itemCount());
	}
	
	@Test
	public void testAddOneItemToShoppingBasket() {
		Basket cart = new EBasket();
		Item apple = new Fruit("101", "Red Apple", 6, 24.0d, "Kashmiri Red Apple");
		cart.addItem(apple);
		Assert.assertEquals(1, cart.itemCount());
		Assert.assertEquals(144.0, cart.totalCost(),0.0); 
	}
	
	@Test
	public void testAddDifferentItemToTheBasket(){
		Basket cart = new EBasket();
		Item apple = new Fruit("101", "Red Apple", 6, 24.0d, "Kashmiri Red Apple");
		Item banana = new Fruit("102", "Banana", 12, 5.0d, "Banana");
		Item orange = new Fruit("103", "Orange", 2, 26.0d, " Nagpur Orange");
		Item peach = new Fruit("104", "Peache", 1, 40.0d, " Peache");
		Item lemon = new Fruit("105", "Lemon", 4, 4.0d, " Yellow Lemon");
		cart.addItem(apple);
		cart.addItem(banana);
		cart.addItem(orange);
		cart.addItem(peach);
		cart.addItem(lemon);
		Assert.assertEquals(5, cart.itemCount());
		Assert.assertEquals(312.0, cart.totalCost(),0.0);
	}

}