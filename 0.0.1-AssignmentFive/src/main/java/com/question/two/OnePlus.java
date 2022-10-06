package com.question.two;

public class OnePlus extends Smartphone implements Runnable, Motherboard{

	@Override
	String processor() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public int lifespan() {
		return 5;
	}

	public void run() {
		System.out.println(lifespan());
	}
	
}
