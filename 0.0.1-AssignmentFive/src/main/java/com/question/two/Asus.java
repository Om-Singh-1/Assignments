package com.question.two;

public class Asus extends Smartphone implements Runnable, Motherboard{

	@Override
	String processor() {
		// TODO Auto-generated method stub
		return "888";
	}
	
	public boolean isBrandPopular() {
		return true;
	}

	public void run() {
		System.out.println(processor());
	}
	
}
