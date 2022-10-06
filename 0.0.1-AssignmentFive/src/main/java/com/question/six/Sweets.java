package com.question.six;

import java.util.ArrayList;

public class Sweets {
	
	public static ArrayList<String> chocolates() {
		
		ArrayList<String> chocolates = new ArrayList<String>();
		
		chocolates.add("Walnut Flavour");
		chocolates.add("Peanuts Flavour");
		chocolates.add("Butterscotch Flavour");
		chocolates.add("Vanilla Flavour");
		
		return chocolates;
		
	}
	
	public static ArrayList<String> iceCream() {
		
		ArrayList<String> iceCream = new ArrayList<String>();
		
		iceCream.add("Vanilla Flavour");
		iceCream.add("Chocolate Flavour");
		iceCream.add("Mango Flavour");
		
		return iceCream;
		
	}
	
	public static ArrayList<String> sweetDrinks() {
		
		ArrayList<String> sweetDrinks = new ArrayList<String>();
		
		sweetDrinks.add("Normal Flavour");
		sweetDrinks.add("Vanilla Flavour");
		
		return sweetDrinks;
		
	}
	
	public static ArrayList<String> cakes() {
		
		ArrayList<String> cakes = new ArrayList<String>();
		
		cakes.add("Red berry");
		cakes.add("BlueBerry");
		cakes.add("Vanilla Flavour");
		
		return cakes;
		
	}

	public static void main(String[] args) {

		System.out.println(chocolates().indexOf("Vanilla Flavour"));
		System.out.println(iceCream().indexOf("Vanilla Flavour"));
		System.out.println(sweetDrinks().indexOf("Vanilla Flavour"));
		System.out.println(cakes().indexOf("Vanilla Flavour"));
		
	}
	
}
