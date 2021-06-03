package com.korea.spring;

public class Car {

	// field
	private String model;
	private int price;
	
	// constructor
	
	public Car() {
		
	}
	
	public Car(String model, int price) {
		super();
		this.model = model;
		this.price = price;
	}

	
	// method
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void carInfo() {
		System.out.println(model + " (" + price + ")");
	}
	
}
