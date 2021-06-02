package com.korea.spring;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MainClass {

	public static void main(String[] args) {
		
		// 1) List
		ListHandler listHandler = new ListHandler();
		
		List<String> foods = new ArrayList();
		foods.add("떡볶이");
		foods.add("김밥");
		foods.add("순대");
		foods.add("튀김");
		foods.add("어묵");
		
		listHandler.setList(foods);
		listHandler.listinfo();
		/*
		       떡볶이
			김밥
			순대
			튀김
			어묵
		 */
		
		System.out.println(listHandler.getList());
		// set에 의해 저장된  list 자체를 불러온다
		// [떡볶이, 김밥, 순대, 튀김, 어묵]
		
		
		// 2) Set
		SetHandler setHandler = new SetHandler();
		
		Set<String> courses = new HashSet();
		courses.add("자바");
		courses.add("자바");
		courses.add("파이썬");
		courses.add("파이썬");
		courses.add("스프링");
		courses.add("스프링");
		
		setHandler.setSet(courses);
		setHandler.setInfo();
		/*
		 * 순회 1
		     스프링
		     파이썬
		     자바
		     
		 * 순회 2    
		     스프링
		     파이썬
		     자바
		 */
		System.out.println(setHandler.getSet());
		// [스프링, 파이썬, 자바]
		
		
		// 3) Map
		MapHandler mapHandler = new MapHandler();
		
		Map<String, String> dict = new HashMap();
		
		dict.put("spring", "봄");
		dict.put("summer", "여름");
		dict.put("fall", "가을");
		dict.put("winter", "겨울");
		
		mapHandler.setMap(dict);
		mapHandler.mapInfo();
		/*
	        spring : 봄
			fall : 가을
			winter : 겨울
			summer : 여름
			
			spring : 봄
			fall : 가을
			winter : 겨울
			summer : 여름
		 */
		System.out.println(mapHandler.getMap());
		// {spring=봄, fall=가을, winter=겨울, summer=여름}
	}

}
