package com.syntax.class22;

public class AnimalTest {

	public static void main(String[] args) {
		//Non primitive casting: upcasting
		Animal obj=new Tiger();
		obj.sleep();
		obj.eat();
		//obj.run();CE: method run() is indefined in Animal class
		
		System.out.println("--------   Accessing methods using Parent class");
		Animal animal=new Animal();
		//method only of parent class will be vailable
		animal.eat();
		animal.sleep();
		
		System.out.println("--------   Accessing methods using Child class");
		Tiger tiger=new Tiger();
		tiger.sleep();
		tiger.eat();
		tiger.run();
		
	}
}
