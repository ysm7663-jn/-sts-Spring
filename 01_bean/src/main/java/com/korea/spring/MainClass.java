package com.korea.spring;

// Spring Legacy Project > Simple Spring Maven 생성 > 패키지 생성

public class MainClass {

	public static void main(String[] args) {

		// 개발자가 직접  new를 이용해서 각종 객체(인스턴스, 빈)을 생성
		Calculator calculator1 = new Calculator();
		Calculator calculator2 = new Calculator();
		
		calculator1.add(30, 15);
		calculator1.subtract(30, 15);
		calculator1.multiply(30, 15);
		calculator1.divide(30, 15);
		
		System.out.println();
		
		// EngineerCalculator 사용 방법
		// 1. 디폴트 생성자 + setter
		// 2. 필드를 이용한 생성자
		
		// 1. 디폴트 생성자 + setter
		// 1) 디폴트 생성
		EngineerCalculator eCalculator1 = new EngineerCalculator();
		
		// 2) setter 
		eCalculator1.setA(15);
		eCalculator1.setB(5);
		eCalculator1.setCalculator(calculator1);
		
		// 함수 호출
		eCalculator1.add();
		eCalculator1.multiply();
		eCalculator1.subtract();
		eCalculator1.divide();
		
		System.out.println();
		
		// 2. 필드를 이용한 생성자
		EngineerCalculator eCalculator2 = new EngineerCalculator(calculator2, 100, 30);
		
		eCalculator1.add();
		eCalculator1.multiply();
		eCalculator1.subtract();
		eCalculator1.divide();

	}

}
