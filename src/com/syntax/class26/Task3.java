package com.syntax.class26;

abstract class Car {

	double carPrice;
	String color;

	Car(double carPrice, String color) {
		this.carPrice = carPrice;
		this.color = color;
	}

	abstract double calculateSalePrice();
}

class Sedan extends Car {

	int length;

	Sedan(double carPrice, String color, int length) {
		super(carPrice, color);
		this.length = length;
	}

	double calculateSalePrice() {
		if (length > 20) {
			carPrice -= carPrice * 0.05;
		} else {
			carPrice -= carPrice * 0.1;
		}
		return carPrice;
	}
}

class Truck extends Car {
	double weight;

	Truck(double carPrice, String color, double weight) {
		super(carPrice, color);
		this.weight = weight;
	}

	double calculateSalePrice() {
		if (weight > 2000) {
			carPrice -= carPrice * 0.1;
		} else {
			carPrice -= carPrice * 0.2;
		}
		return carPrice;
	}
}

public class Task3 {
	/*
	 * Create a Class Car that would have the following fields: carPrice and color
	 * and method calculateSalePrice() which should be returning a price of the car.
	 * Create 2 sub classes: Sedan and Truck. The Truck class has field as weight
	 * and has its own implementation of calculateSalePrice() method in which
	 * returned price calculated as following: if weight>2000 then returned price
	 * car should include 10% discount, otherwise 20% discount. The Sedan class has
	 * field as length and also does it is own implementation of
	 * calculateSalePrice(): if length of sedan is >20 feet then returned car price
	 * should include 5% discount, otherwise 10% discount
	 */
	public static void main(String[] args) {
		Car truck = new Truck(20000.0, "Blue",3000.0);
		System.out.println(truck.calculateSalePrice());
		
		Car sedan = new Sedan(20000.0,"White", 30);
		System.out.println(sedan.calculateSalePrice());
		
	}
}
