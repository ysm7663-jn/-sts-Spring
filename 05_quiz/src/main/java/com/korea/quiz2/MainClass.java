package com.korea.quiz2;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		
		BMICalculator bmiCalculator = new BMICalculator();
		bmiCalculator.setNormal(20.0);
		bmiCalculator.setOver(26.0);
		bmiCalculator.setObesity(31.0);
		
		Person person = new Person();
		person.setName("앨리스");
		person.setBmiCalculator(bmiCalculator);
		person.setHeight(165.5);
		person.setWeight(55.5);
		
		ArrayList<String> hobbies = new ArrayList<String>();
		hobbies.add("윤동");
		hobbies.add("여행");
		hobbies.add("독서");
		person.setHobbies(hobbies);
		
		person.personInfo();
		
	}

}
