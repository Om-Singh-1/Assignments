package com.exceptionHandling.Q1;

public class DivisionByZero {

	static void divideByZero(int num1, int num2) {
		
		try {
			
			int ans = num1/num2;
			System.out.println(ans);
			
		} catch(Exception E) {
			
			System.out.println("Error: " + E.getLocalizedMessage());
			
		}
		
	}
	
	public static void main(String[] args) {
		
		divideByZero(10, 0);
		
	}
	
}
