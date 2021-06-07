package com.korea.quiz3;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SpringMainClass {

	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:app-context3.xml");
		Student s = ctx.getBean("student", Student.class);
		s.studentInfo();
		ctx.close();

	}

}
