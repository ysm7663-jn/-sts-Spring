package com.korea.mvc05.dto;

public class PersonDto {
	
	private String name;
	private int age;
	
	public PersonDto(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public PersonDto() {
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
