package com.question.five;

public class D extends B, C{					// Throws error since multiple inheritance directly is not supported.
	
	public static void main(String[] args) {
		D d = new D();
		d.show();								// Ambiguity (which show() method to call.)
	}

}
