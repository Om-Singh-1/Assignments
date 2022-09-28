package com.interfaceEx.Q2_Q3;

public class SpeciesType extends SuperExample implements Animal{

	@Override
	public void Amphibians() {
		
		System.out.println("Toads, Frogs");
		super.CallMe();
		
	}
	
	public static void main(String[] args) {
		
		SpeciesType st = new SpeciesType();
		
		st.Amphibians();
		st.Species(15000);
		
	}

}
