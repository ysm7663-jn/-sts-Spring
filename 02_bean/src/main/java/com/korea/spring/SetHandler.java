package com.korea.spring;

import java.util.Iterator;
import java.util.Set;

public class SetHandler {
	
	// Set : List형태에서 중복된 값을 제거하고 출력해준다.
	
	// field
	private Set<String> set;
	
	// constructor
	public SetHandler() {
		
	}
	
	// method
	public Set<String> getSet() {
		return set;
	}
	
	public void setSet(Set<String> set) {
		this.set = set;
	}
	
	public void setInfo() {
		// Set 순회1
		for (String item : set) {
			System.out.println(item);
		}
		
		// Set 순회2
		// Iterator : 순회
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
