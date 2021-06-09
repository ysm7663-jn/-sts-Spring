package com.korea.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("app-context.xml");
		
		TV tv = ctx.getBean("tv", TV.class);
		tv.channelUp();
		tv.channelDown();
		tv.volumUp(5);
		tv.volumDown(5);
		
		ctx.close();

	}

}
