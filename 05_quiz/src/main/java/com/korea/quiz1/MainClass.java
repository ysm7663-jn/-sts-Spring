package com.korea.quiz1;

public class MainClass {

	public static void main(String[] args) {

		Gugudan gugudan = new Gugudan();
		gugudan.setStartDan(3);
		gugudan.setEndDan(4);
		gugudan.setStartNum(5);
		gugudan.setEndNum(7);
		
		Calculator calculator = new Calculator();
		gugudan.setCalculator(calculator);
		gugudan.gugudanInfo();
		
	}

}
