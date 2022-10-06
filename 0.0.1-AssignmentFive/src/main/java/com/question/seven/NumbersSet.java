package com.question.seven;

import java.util.LinkedHashSet;
import java.util.Set;

public class NumbersSet {
	
	public static Set<Integer> numbers() {
		
		Set<Integer> numbers = new LinkedHashSet<Integer>();
		
		numbers.add(60);
		numbers.add(60);
		numbers.add(60);
		numbers.add(60);
		numbers.add(60);
		numbers.add(60);
		numbers.add(60);
		numbers.add(60);
		numbers.add(60);
		numbers.add(60);
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		numbers.add(9);
		numbers.add(10);
		
		return numbers;
		
	}

	public static void main(String[] args) {
		
		
		System.out.println("Last Item: " + numbers().stream().toList().get(numbers().size() - 1));
		
	}
	
}
