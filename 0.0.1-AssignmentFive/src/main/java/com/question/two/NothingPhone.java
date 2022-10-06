package com.question.two;

public class NothingPhone extends Smartphone implements Runnable, Motherboard{

	@Override
	String processor() {
		// TODO Auto-generated method stub
		return "778G+";
	}
	
	public double version() {
		return 15.2;
	}

	public void run() {
		System.out.println(processor());
	}
	
}
