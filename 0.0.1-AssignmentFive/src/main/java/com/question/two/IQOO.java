package com.question.two;

public class IQOO extends Smartphone implements Runnable, Motherboard{

	@Override
	String processor() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public boolean isBrandPopular() {
		return true;
	}

	public void run() {
		System.out.println(isBrandPopular());
	}
	
}
