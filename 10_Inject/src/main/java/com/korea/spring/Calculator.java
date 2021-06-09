package com.korea.spring;

import org.springframework.stereotype.Component;

@Component("calculator")	// <bean id="calculator">로 이름
public class Calculator {
	
		// method
		public void add(int a, int b) {
			System.out.println(a + "+" + b + "=" + (a + b));
		}
		
		public void subtract(int a, int b) {
			System.out.println(a + "-" + b + "=" + (a - b));
		}
		
		public void multiply(int a, int b) {
			System.out.println(a + "*" + b + "=" + (a * b));
		}
		
		public void divide(int a, int b) {
			System.out.println(a + "/" + b + "=" + (a / b));
		}

}
