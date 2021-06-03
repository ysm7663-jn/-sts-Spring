package com.korea.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class SpringMainClass {

	public static void main(String[] args) {
		
		
		// @Configuration 애너테이션을 추가한 AppContext.java를 
		// 처리하는 클래스는 AnnotationConfigApplicationContext입니다.
		
		// AnnotationConfigApplicationContext 클래스는 AbstractApplicationContext 클래스의 서브클래스입니다.
		
		
		AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);
		
		Song s1 = ctx.getBean("song1", Song.class);
		Song s2 = ctx.getBean("song2", Song.class);
		
		s1.songInfo();
		s2.songInfo();
		
		Singer gasu1 = ctx.getBean("singer1", Singer.class);
		Singer gasu2 = ctx.getBean("singer2", Singer.class);
		
		gasu1.singerInfo();
		gasu2.singerInfo();

		ctx.close();
		
	}

}
