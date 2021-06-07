package com.korea.spring;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// @Configuration : Bean을 생성하는 app-context.xml과 같은 일을 한다.
@Configuration
public class Appcontext {
	
	@Bean
	public Person person2() {
		ArrayList<String> hobbies = new ArrayList<String>();
		hobbies.add("요리");
		hobbies.add("독서");
		hobbies.add("음악감상");
		
		return new Person("제임스", hobbies);
				
	}
	
	
}
