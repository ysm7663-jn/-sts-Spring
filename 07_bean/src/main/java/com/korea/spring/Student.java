package com.korea.spring;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Student {

	// field
	private String name;
	private ArrayList<Integer> scores;
	private HashMap<String, String> homeInfo;
	private HashSet<String> volunteers;
	
	// constructor
	public Student() {
		super();
	}

	public Student(String name, ArrayList<Integer> scores, HashMap<String, String> homeInfo,
			HashSet<String> volunteers) {
		super();
		this.name = name;
		this.scores = scores;
		this.homeInfo = homeInfo;
		this.volunteers = volunteers;
	}

	// method
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Integer> getScores() {
		return scores;
	}

	public void setScores(ArrayList<Integer> scores) {
		this.scores = scores;
	}

	public HashMap<String, String> getHomeInfo() {
		return homeInfo;
	}

	public void setHomeInfo(HashMap<String, String> homeInfo) {
		this.homeInfo = homeInfo;
	}

	public HashSet<String> getVolunteers() {
		return volunteers;
	}

	public void setVolunteers(HashSet<String> volunteers) {
		this.volunteers = volunteers;
	}
	
	public void studentInfo() {
		System.out.println("name : " + name);
		System.out.println("scores : " + scores);
		for (Map.Entry<String, String> entry : homeInfo.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		System.out.println("volunteers : " + volunteers);
	}
	
	
}
