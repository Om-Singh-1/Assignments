package com.assignment.one.multipleInheritanceEx;

public class Redmi implements Smartphone, Xiaomi{

	@Override
	public boolean subBrand() {
		// TODO Auto-generated method stub
		return true;
	}
	
	@Override
	public void battery() {
		
		System.out.println("5000mah");
		
	}

	@Override
	public void processor() {
		
		System.out.println("SD888");
		
	}

	@Override
	public void camera() {
		
		System.out.println("48MP");
		
	}
	
	public static void main(String[] args) {
		
		Redmi redmi = new Redmi();
		redmi.battery();
		
	}

}
