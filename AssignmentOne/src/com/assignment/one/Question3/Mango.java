package com.assignment.one.Question3;

public class Mango extends Fruits{
	
	public Mango() {
		System.out.println("Inside Mango class");
	}
	
	public Mango(int count) {
		System.out.println("Mango count: " + count);
	}
	
	public Mango(Boolean Eatable) {
		System.out.println("This mango is Eatable?: " + Eatable);
	}

	public static void main(String[] args) {
		Mango mango = new Mango();
		mango.eat();
		
		Mango count = new Mango(15);
		Mango eatable = new Mango(true);
	}

	
}
