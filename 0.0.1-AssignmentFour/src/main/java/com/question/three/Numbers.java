package com.question.three;

public class Numbers extends PrimeNumbers implements EvenOdd {
	

	public int Even() {
		
		System.out.println("Default Even numbers 2,4,6,8...");				// Method Override
		return 2;
	}

	public int Odd() {
		
		System.out.println("Default Odd numbers 1,3,5,7...");
		return 1;
	}
	
	public int Odd(int odd) {												// Method Override
		System.out.println("Inserted odd number: " + odd);
		return odd;
	}
	
	public static void main(String[] args) {

		Numbers num = new Numbers();
		num.Even();
		num.Odd();
		num.Odd(13);
		
		WholeNumbers wn = new WholeNumbers();
		int[] wnum = {0,1,2,3};
		wn.setWhole(wnum);
		System.out.println("Entered whole number length: " + wn.returnArrayLength(wn.whole));
	}
	
}
