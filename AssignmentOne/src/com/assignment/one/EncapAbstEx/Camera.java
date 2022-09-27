package com.assignment.one.EncapAbstEx;

public class Camera extends Accessories{

	@Override
	void ScreenGuard() {
		
		System.out.println("Attached");
		
	}

	@Override
	void BackCover() {
		
		System.out.println("Attached");
		
	}
	
	public static void main(String[] args) {
		
		Camera camera = new Camera();			// Abstract class cannot be instantiated
		camera.BackCover();						// but they can be subclassed and their
		camera.ScreenGuard();					// properties can be used by other classes.
		
	}

}
