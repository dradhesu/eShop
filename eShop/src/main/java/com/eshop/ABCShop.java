package com.eshop;

public class ABCShop implements Shop {

	public double order(Basket basket) {
		 return basket.totalCost();
	}
}
