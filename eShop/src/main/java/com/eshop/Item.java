package com.eshop;

public abstract class Item {
	private String id;
	private String name;
	private int quantity;
	private double price;

	public Item() {
		this.id = "";
		this.name = "";
		this.quantity = 0;
		this.price = 0.0d;
	}

	public Item(String id, String name, int quntity, double price) {
		this.id = id;
		this.name = name;
		this.quantity = quntity;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
