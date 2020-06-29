package com.syntax.class14;

public class Garage {
	public static void main(String[] args) {
		// build individual objects
		Car car1 = new Car();
		car1.make = "Lamborghini";
		car1.model = "Gallardo";
		car1.year = 2020;
		car1.color = "Blue";

		System.out.println(car1.make);
		// accesing behavior/methods of Car with car1
		
		car1.accelerate();
		car1.makeNoise();
		car1.drive();
		car1.stop();

		Car car2 = new Car();
		car2.make = "BMW";
		car2.model = "m5";
		car2.year = 2019;
		car2.color = "Pink";

		// accesing behavior/methods of Car with car2

		car2.stop();
		car2.makeNoise();
		car2.accelerate();
		car2.drive();
		
		Car car3 = new Car();
		car3.make = "123";
		car3.speed = 200;

		System.out.println("I drive " + car2.color + " " + car2.make);

		Car2 anotherCar=new Car2();
		anotherCar.make="Toyota";
		anotherCar.speed=90;
		anotherCar.drive();
		
		
		
		// create bike object

		// new Bike(); --> cannot create an object if we do not have a class
		// car2.breaking();CE: method is not defined in car class

		// I drive pink bmw
	}
}
