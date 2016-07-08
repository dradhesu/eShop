package com.eshop;

import org.junit.Assert;
import org.junit.Test;

import com.eshop.ABCShop;
import com.eshop.Basket;
import com.eshop.EBasket;
import com.eshop.Fruit;
import com.eshop.Item;
import com.eshop.Shop;

public class ShopTest {
	
	@Test
	public void testOrder(){
		Shop eShop = new ABCShop();
		Basket eBasket = new EBasket();
		
		Item apple = new Fruit("101", "Red Apple", 6, 24.0d, "Kashmiri Red Apple");
		Item banana = new Fruit("102", "Banana", 12, 5.0d, "Banana");
		Item orange = new Fruit("103", "Orange", 2, 26.0d, " Nagpur Orange");
		Item peach = new Fruit("104", "Peache", 1, 40.0d, " Peache");
		Item lemon = new Fruit("105", "Lemon", 4, 4.0d, " Yellow Lemon");
		
		eBasket.addItem(apple);
		eBasket.addItem(banana);
		eBasket.addItem(orange);
		eBasket.addItem(peach);
		eBasket.addItem(lemon); 
		
		double totalCost = eShop.order(eBasket);
		Assert.assertEquals(totalCost, eBasket.totalCost(),0.0);
	}

}