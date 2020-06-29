package com.syntax.class14;

public class Car {

	//define feature of the car
	String make;
	String model;
	int year;
	String color;
	int speed;
	
	//define behavior
	void drive() {
		System.out.println(make+" can drive");
	}
	
	void accelerate() {
		System.out.println(make+ " can accelerate");
	}
	
	void makeNoise() {
		System.out.println(make+ " make noise");
	}
	
	void stop() {
		System.out.println(make+" stops when you press break");
		System.out.println("Car stops");
	}
}
