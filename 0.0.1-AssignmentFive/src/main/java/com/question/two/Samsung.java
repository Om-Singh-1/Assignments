package com.question.two;

public class Samsung extends Smartphone implements Runnable, Motherboard{

	@Override
	String processor() {
		// TODO Auto-generated method stub
		return "Exynos 9821";
	}
	
	public double version() {
		return 0.1;
	}

	public void run() {
		
		System.out.println("Processor: " + processor() + ", Motherboard Version: " + version());
		
	}
	
}
