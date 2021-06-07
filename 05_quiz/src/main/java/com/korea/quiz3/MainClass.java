package com.korea.quiz3;

import java.util.ArrayList;
import java.util.HashMap;

public class MainClass {

	public static void main(String[] args) {

		Student student = new Student();
		Exam midterm = new Exam();
		
		student.setName("david");
		student.setAge(25);

		HashMap<String, String> homeInfo = new HashMap<String, String>();
		homeInfo.put("seoul", "02-555-5555");
		homeInfo.put("busan", "051-555-5555");

		student.setHomeInfo(homeInfo);

		ArrayList<Integer> score = new ArrayList<Integer>();
		score.add(50);
		score.add(60);
		score.add(70);
		score.add(80);
		score.add(90);
		
		student.setScoreList(score);
		
		student.studentInfo();
	}

}
