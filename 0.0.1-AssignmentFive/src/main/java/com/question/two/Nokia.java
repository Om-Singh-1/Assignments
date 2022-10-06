package com.question.two;

public class Nokia extends Smartphone implements Runnable, Motherboard{

	@Override
	String processor() {
		// TODO Auto-generated method stub
		return "732G";
	}
	
	public String name() {
		return "Nokia";
	}
	

	public void run() {
		
		System.out.println("Name: " + name() + ", Processor: " + processor());
		
	}
	
}