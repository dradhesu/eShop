package com.eshop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EBasket implements Basket {
	
	private List<Item> listOfItems = new ArrayList<Item>();
	
	public boolean addItem(Item item) {
		return listOfItems.add(item);
	}

	
	public boolean removeItem(Item item) {
		return listOfItems.remove(item);
	}

	
	public double totalCost() {
		double price = 0.0d;
		Iterator listIterator = listOfItems.iterator();
		while (listIterator.hasNext()) {
			Item item = (Item) listIterator.next();
			price += (item.getPrice() * item.getQuantity()) ;
		}
		return price;
	}
	
	
	public int itemCount(){
		return listOfItems.size();
	}


}
