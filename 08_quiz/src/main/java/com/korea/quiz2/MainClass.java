package com.korea.quiz2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);
		
		Car car1 = ctx.getBean("car1", Car.class);
		Car car2 = ctx.getBean("car2", Car.class);

		car1.carInfo();
		car2.carInfo();
		
		ctx.close();
		
	}

}
