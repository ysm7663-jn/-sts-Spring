package com.korea.spring;

public class EngineerCalculator {

	// field
	private Calculator calculator;
	private int a;
	private int b;
	
	// constructor
	// 생성자 빠르게 생성하는 방법
	// alt + s + o
	public EngineerCalculator() {
		
	}
	
	// 필드(매개변수)를 활용
	public EngineerCalculator(Calculator calculator, int a, int b) {
		super();
		this.calculator = calculator;
		this.a = a;
		this.b = b;
	}
	
	// method
	public void add() {
		calculator.add(a, b);
	}
	
	public void subtract() {
		calculator.subtract(a, b);
	}
	
	public void multiply() {
		calculator.multiply(a, b);
	}
	
	public void divide() {
		calculator.divide(a, b);
	}

	
	// getter와 setter
	// setter: 입력 받은 데이터를 field에 있는 변수에 저장해놓음
	// getter: 저장되어있는 변수의 데이터를 사용
	
	// getter와 setter 빠르게 입력하는 방법
	// alt + s + r
	public Calculator getCalculator() {
		return calculator;
	}
	
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	public int getA() {
		return a;
	}
	
	public void setA(int a) {
		this.a = a;
	}
	
	public int getB() {
		return b;
	}
	
	public void setB(int b) {
		this.b = b;
	}
	
	
}
