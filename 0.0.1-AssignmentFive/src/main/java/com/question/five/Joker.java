package com.question.five;

public class Joker {

	public Joker() {
		System.out.println("Techno Edge Learning Circus.");
	}
	
	public Joker(String name, String dance) {
		System.out.println("Ye " + name + " nacha/nachi " + dance + "\n");
	}
	
	// Kripya dhyaan de iss code me likhi gae logo k naam random h 
	// please relate na kare, Dhnyawaad.
	
	public static void main(String[] args) {
		
		Joker shivam = new Joker();
		Joker shivamReborned = new Joker("Shivam", "Desi naach");
		
		Joker gaurav = new Joker();
		Joker gauravReborned = new Joker("Gaurav", "Kathak Kali");
		
		Joker shivani = new Joker();
		Joker shivaniReborned = new Joker("Shivani", "Bharat natyam");
		
		Joker piyush = new Joker();
		Joker piyushReborned = new Joker("Piyush", "Ballet");
		
		Joker saksham = new Joker();
		Joker sakshamReborned = new Joker("Saksham", "Hip Hop");
		
		Joker mashir = new Joker();
		Joker mashirReborned = new Joker("Mashir", "Folk dance");
		
		Joker partheev = new Joker();
		Joker partheevReborned = new Joker("Partheev", "Tap dance");
		
		Joker akansha = new Joker();
		Joker akanshaReborned = new Joker("Akansha", "Anime Dance");
		
	}
	
}
