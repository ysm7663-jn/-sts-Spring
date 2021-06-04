package com.korea.quiz2;

public class BMICalculator {

	// field
	private double normal;
	private double over;
	private double obesity;

	// constructor
	public BMICalculator() {
		super();
	}

	// method
	public void result(double height, double weight) {

		double h = height * 0.01;
		double bmi = weight / (h * h);
		String stat = null;
		if (bmi >= obesity) {
			stat = "비만";
		}

		else if (bmi >= over) {
			stat = "과체중";
		}

		else if (bmi >= normal) {
			stat = "정상";
		}

		else {
			stat = "저체중";
		}

		System.out.println("체질량(BMI) 지수 : " + bmi + "(" + stat + ")");
		
	}

	public double getNormal() {
		return normal;
	}

	public void setNormal(double normal) {
		this.normal = normal;
	}

	public double getOver() {
		return over;
	}

	public void setOver(double over) {
		this.over = over;
	}

	public double getObesity() {
		return obesity;
	}

	public void setObesity(double obesity) {
		this.obesity = obesity;
	}

}
