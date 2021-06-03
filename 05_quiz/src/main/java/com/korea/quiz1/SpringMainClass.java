package com.korea.quiz1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SpringMainClass {

	public static void main(String[] args) {

		String resourceLocation = "classpath:app-context1.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(resourceLocation);
		
		Gugudan g = ctx.getBean("gugudan", Gugudan.class);
		g.gugudanInfo();
		ctx.close();
		
	}

}
