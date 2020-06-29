package com.syntax.class23;

public class Animal {

	public static void whoAmI() {
		System.out.println("I am an animal");
	}
	
	public void sleep() {
		System.out.println("Animal sleep");
	}
	
	private void eat() {
		System.out.println("Aminal eat");
	}
}

class Bird extends Animal{
	
	//we are not overriding, this process calls method hiding
	public static void whoAmI() {
		System.out.println("I am a bird");
	}
	
	public void sleep() {
		System.out.println("Bird sleeps");
	}
	
	private void eat() {
		System.out.println("Birds eat too");
	}
}