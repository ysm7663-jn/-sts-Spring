package com.korea.quiz2;

import java.util.ArrayList;

public class Person {
	
	// field
	private String name;
	private double weight;
	private double height;
	private BMICalculator bmiCalculator;
	private ArrayList<String> hobbies;
	
	// constructor
	public Person() {
		
	}
	
	// method
	public void personInfo() {
		System.out.println("성명 : " + name);
		System.out.println("키 : " + height);
		System.out.println("몸무게 : " + weight);
		bmiCalculator.result(height, weight);
		for (String hobby : hobbies) {
			System.out.print(hobby + " ");
		}
		System.out.println();
		System.out.println(getHobbies());
			
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public BMICalculator getBmiCalculator() {
		return bmiCalculator;
	}

	public void setBmiCalculator(BMICalculator bmiCalculator) {
		this.bmiCalculator = bmiCalculator;
	}

	public ArrayList<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(ArrayList<String> hobbies) {
		this.hobbies = hobbies;
	}

		
}
