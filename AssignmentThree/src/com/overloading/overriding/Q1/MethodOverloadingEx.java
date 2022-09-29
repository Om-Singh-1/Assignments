package com.overloading.overriding.Q1;

public class MethodOverloadingEx {
	
	static void watchMovie() {
		
		System.out.println("Watch default movie");
		
	}
	
	static void watchMovie(String Movie) {
		
		System.out.println("Let's watch " + Movie);
		
	}
	
	static void watchMovie(String Movie1, String Movie2) {
		
		System.out.println("Lets watch " + Movie1 + " and then " + Movie2);
		
	}
	
	public static void main(String[] args) {
		
		watchMovie();
		watchMovie("Paranoraml Activity");
		watchMovie("Batman Begins", "The Dark Knight");
		
	}

}
