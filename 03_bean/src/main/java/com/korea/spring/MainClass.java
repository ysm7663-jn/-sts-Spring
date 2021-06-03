package com.korea.spring;

public class MainClass {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.setModel("520d");
		c1.setPrice(150000000);
		
		Person p1 = new Person();
		p1.setMyCar(c1);
		p1.setName("daniel");
		
		p1.personInfo();
	}

}
