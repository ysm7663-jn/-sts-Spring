package com.koreait.spring;

public class EngineerCalculator {

	
	// field
	private Calculator calculator;
	private int a;
	private int b;
	
	// constructor
	public EngineerCalculator() {
		
	}
	
	// 필드를 이용
	// 주어진 매개변수에 값이 일치하도록 넣어 바로 사용한다.
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
	
	// getter와 setter를 활용
	// set : field의 private 변수에 넣어놓는다.
	// get : field에 저장되어 있는 값을 꺼내온다.
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
