package com.korea.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SpringMainClass {

	public static void main(String[] args) {

		// src/main/resources에 app-context.xml 작성
		// app-context.xml 에 정의된 빈(bean)을 생성하는 클래스 >> GenericXmlApplicationContext 클래스
		
		// AbstactApplicationContext는 GenericXmlApplicationContext의 슈퍼클래스
		
		String resourceLocation = "classpath:app-context.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(resourceLocation);
		
		// cal1과 cal2의 생성을 app-context.xml에서 처리한다.
		// 개발자가 직접 생성하지 않고, app-context.xml에게 빈을 요청하는 방식(getBean)
		
		// 빈의 생성 권한을 스프링 프레임워크가 가져간다
		// 개발자가 빈을 직접 생성하지 않는다
		// loC : Inversion of Control (제어의 역전)
		
		// getBean(bean 태그의 id, bean 태그의 class)
		Calculator cal1 = ctx.getBean("calculator1", Calculator.class);
		// <bean id="calculator1" class="com.korea.spring.Calculator" />
		cal1.add(20, 5);
		cal1.subtract(20, 5);
		cal1.multiply(20, 5);
		cal1.divide(20, 5);
		
		System.out.println();
		
		Calculator cal2 = ctx.getBean("calculator2", Calculator.class);
		cal2.add(150, 50);
		cal2.subtract(150, 50);
		cal2.multiply(150, 50);
		cal2.divide(150, 50);
		
		System.out.println();
		
		EngineerCalculator eCal1 = ctx.getBean("eCalculator1", EngineerCalculator.class);
		eCal1.add();
		eCal1.subtract();
		eCal1.multiply();
		eCal1.divide();
		
		System.out.println();
		
		EngineerCalculator eCal2 = ctx.getBean("eCalculator2", EngineerCalculator.class);
		eCal2.add();
		eCal2.subtract();
		eCal2.multiply();
		eCal2.divide();
		
		System.out.println();
		
		EngineerCalculator eCal3 = ctx.getBean("eCalculator3", EngineerCalculator.class);
		eCal3.add();
		eCal3.subtract();
		eCal3.multiply();
		eCal3.divide();
		
		ctx.close();
	}

}
