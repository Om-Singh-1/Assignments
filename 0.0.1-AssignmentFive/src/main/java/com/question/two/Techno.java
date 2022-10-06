package com.question.two;

public class Techno extends Smartphone implements Runnable, Motherboard{

	@Override
	String processor() {
		// TODO Auto-generated method stub
		return "695";
	}
	
	public String name() {
		return "Techno";
	}

	public void run() {
		System.out.println(processor());
	}
	
}
