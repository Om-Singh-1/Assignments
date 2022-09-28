package com.interfaceEx.Q2_Q3;

public interface Animal {
	
	abstract void Amphibians();
	
	default int Species(int count) {
		
		System.out.println(count);
		return count;
		
	}
	
}
