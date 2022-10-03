package com.question.four;

public class Earth extends Elements{

	@Override
	String Nature() {
		return "Solid";
	}

	@Override
	String Properties() {
		return "Moldable";
	}
	
	public static void main(String[] args) {
		Earth earth = new Earth();
		System.out.println(earth.Nature());
	}

}
