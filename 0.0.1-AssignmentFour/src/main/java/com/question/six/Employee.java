package com.question.six;

import java.util.HashMap;
import java.util.Map;

public class Employee {

	public static Map<Integer, String> addMap() {
		
		Map<Integer, String> employee = new HashMap<Integer, String>();			// Integer for id, String for name.
		
		employee.put(1, "Dio Brando");
		employee.put(2, "Joesph Joestar");
		employee.put(3, "Kira yoshikage");
		
		return employee;
		
	}
	
	public static void main(String[] args) {
		
		addMap().entrySet().stream().forEach(System.out::println);
			
	}

}
