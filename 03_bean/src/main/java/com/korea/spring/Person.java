package com.korea.spring;

public class Person {
	
	// field
	private String name;
	private Car myCar;
	
	// constructor
	public Person() {
		
	}
	
	public Person(String name, Car myCar) {
		super();
		this.name = name;
		this.myCar = myCar;
	}

	// method
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Car getMyCar() {
		return myCar;
	}

	public void setMyCar(Car myCar) {
		this.myCar = myCar;
	}
	
	
	public void personInfo() {
		System.out.println("이름: " + name);
		myCar.carInfo();
	}
	
	
}