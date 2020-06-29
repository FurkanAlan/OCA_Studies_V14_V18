package com.syntax.class16;

public class Shelter {

	public static void main(String[] args) {
		
		//access instance variables of different class
		Dog puppy=new Dog();
		puppy.name="Charly";
		System.out.println(puppy.name);
		
		//access static variables of different class
		System.out.println(Dog.breed);
	}
}
