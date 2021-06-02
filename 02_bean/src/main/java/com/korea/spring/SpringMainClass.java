package com.korea.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SpringMainClass {

	public static void main(String[] args) {
		
		String resourceLocations = "classpath:app-context.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(resourceLocations);
		
		ListHandler handler1 = ctx.getBean("listHandler", ListHandler.class);
		handler1.listinfo();
		
		SetHandler handler2 = ctx.getBean("setHandler", SetHandler.class);
		handler2.setInfo();
		
		MapHandler handler3 = ctx.getBean("mapHandler", MapHandler.class);
		handler3.mapInfo();
		
		ctx.close();
		
	}

}