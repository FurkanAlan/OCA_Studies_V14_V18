package com.syntax.class14;

public class Dog {
	
	String breed;
	String color;
	String name;
	int age;

	public static void main(String[] args) {
		Dog dog1 = new Dog();
		dog1.breed = "Shih tzu";
		dog1.color = "brown";
		dog1.name = "Charlie";
		dog1.age = 3;
		
		dog1.bark();
		dog1.eat();
		dog1.run();
		
		Dog dog2 = new Dog();
		dog2.breed = "buuldog";
		dog2.color = "black";
		dog2.name = "Lucy";
		dog2.age = 5;
		
		dog2.bark();
		dog2.eat();
		dog2.run();
	}
	
	void eat() {
		System.out.println(name+" can eat");
	}
	
	void bark() {
		System.out.println(name+" can bark");
	}
	
	void run() {
		System.out.println(name+" can run");
	}
}
//break from 1:40-1:55