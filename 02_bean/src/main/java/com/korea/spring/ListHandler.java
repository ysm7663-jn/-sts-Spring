package com.korea.spring;

import java.util.List;

public class ListHandler {
	
	// List: 같은 자료형을 가진 값들을 같은 공간에 저장한다.
	
	// field
	private List<String> list;

	// constructor
	public ListHandler() {
		
	}
	
	// method
	public List<String> getList() {
		return list;
	}
	
	public void setList(List<String> list) {
		this.list = list;
	}
	
	public void listinfo() {
		for (String item : list) {
			System.out.println(item);
		}
			
	}
	
}
