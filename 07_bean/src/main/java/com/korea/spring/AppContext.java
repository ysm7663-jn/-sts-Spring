package com.korea.spring;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/*
	 * app-context.xml에 저장된 Bean을
	 * AppContext.java로 가져올 수 있어요
	 * 
	 * 방법
	 *   1. AppContext 클래스에 @ImportResource(XML파일) 애너테이션을 추가한다.
	 */
@ImportResource("classpath:app-context.xml")
@Configuration
public class AppContext {
	
	@Bean
	public Student student2() {
		ArrayList<Integer> scores = new ArrayList<Integer>();
		scores.add(85);
		scores.add(95);
		scores.add(100);
		
		HashMap<String, String> homeInfo = new HashMap<String, String>();
		homeInfo.put("phone", "010-1111-2222");
		homeInfo.put("address", "경기도 고양시");
		
		HashSet<String> volunteers = new HashSet<String>();
		volunteers.add("칠판");
		volunteers.add("거울");
		volunteers.add("책상");
		
		return new Student("에밀리", scores, homeInfo, volunteers);
	}

}
