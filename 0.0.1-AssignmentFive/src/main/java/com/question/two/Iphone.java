package com.question.two;

public class Iphone extends Smartphone implements Runnable, Motherboard{

	@Override
	String processor() {
		// TODO Auto-generated method stub
		return "A13 Bionic";
	}
	
	public int lifespan() {
		return 10;
	}

	public void run() {
		System.out.println(processor());
	}
	
}
