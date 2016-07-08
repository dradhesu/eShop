package com.eshop;

public class Fruit extends Item {

	
	private String description;

	public Fruit() {
		super();
		this.description = description;
	}

	public Fruit(String id, String name, int quntity, double price) {
		super(id, name, quntity, price);
	}

	public Fruit(String id, String name, int quntity, double price,String description) {
		super(id, name, quntity, price);
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
