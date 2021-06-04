package com.korea.quiz2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SpringMainClass {
	
	public static void main(String[] args) {
		
		String resourceLocation = "classpath:app-context2.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(resourceLocation);
		
		Person p = ctx.getBean("person", Person.class);
		p.personInfo();
		
		ctx.close();
	}

}
