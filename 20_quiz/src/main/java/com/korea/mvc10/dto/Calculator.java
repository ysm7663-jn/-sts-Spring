package com.korea.mvc10.dto;

public class Calculator {

	private int n1;
	private int n2;
	private String btn;
	private double result;
	private String viewName;
	private String op;
	
	public Calculator(int n1, int n2, String btn, double result, String viewName, String op) {
		this.n1 = n1;
		this.n2 = n2;
		this.btn = btn;
		this.result = result;
		this.viewName = viewName;
		this.op = op;
	}

	public Calculator() {
	}

	public int getN1() {
		return n1;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public int getN2() {
		return n2;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}

	public String getBtn() {
		return btn;
	}

	public void setBtn(String btn) {
		this.btn = btn;
	}

	public double getResult() {
		return result;
	}

	// 스스로 계산하는 setResult() 메소드로 변경
	public void setResult() {
		
		if (btn.equals("덧셈")) {
			// 덧셈 결과를 저장한다.
			result = n1 + n2;
			
			// 덧셈 후에는 뺄셈 
			btn = "뺄셈";
			
			// 덧셈 결과는 result.jsp에서 보여준다.
			viewName = "result";
			
			// result.jsp에서 보여줄 연산기호는 +
			op = "+";
		}
		
		else if (btn.equals("뺄셈")) {
			result = n1 - n2;
			btn = "곱셈";
			viewName = "result";
			op = "-";
		}
		
		else if (btn.equals("곱셈")) {
			result = n1 * n2;
			btn = "나눗셈";
			viewName = "result";
			op = "*";
		}
		
		else if (btn.equals("나눗셈")) {
			result = (double)n1 / n2;
			btn = "초기화면";
			viewName = "result";
			op = "/";
		} 
		
		else if (btn.equals("초기화면")) {
			viewName = "index";
		}
		 
	}

	public String getViewName() {
		return viewName;
	}

	public void setViewName(String viewName) {
		this.viewName = viewName;
	}

	public String getOp() {
		return op;
	}

	public void setOp(String op) {
		this.op = op;
	}
	
}
