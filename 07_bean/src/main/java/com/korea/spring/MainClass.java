package com.korea.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		// AppContext.java에서 app-context.xml을 포함했기 때문에
		// AppContext.java만 읽으면 된다.
		
		// AnotationConfigApplictationContext 클래스가 필요
		
		AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);
		
		Student s1 = ctx.getBean("student1", Student.class);
		Student s2 = ctx.getBean("student2", Student.class);
		
		s1.studentInfo();
		s2.studentInfo();
		
		ctx.close();

	}

}
