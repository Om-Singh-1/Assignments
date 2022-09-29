package com.overloading.overriding.Q1;

public class MethodOverriding extends WebSeries{

	@Override
	public void watch() {
		System.out.println("SnowPiercer S2");			// The method from child class was overridden.
	}
	
	public static void main(String[] args) {
		
		MethodOverriding mo = new MethodOverriding();
		mo.watch();
		
	}
	
}
