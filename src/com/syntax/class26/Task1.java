package com.syntax.class26;

interface Shape {

	void calculateArea(double x);

	void calculatePerimeter(double x);
}

class Circle implements Shape {
	@Override
	public void calculateArea(double x) {
		System.out.println("The area of the given circle is " + (3.14 * x * x));
	}

	@Override
	public void calculatePerimeter(double x) {
		System.out.println("The perimeter of the given circle is " + (2 * 3.14 * x));
	}
}

class Square implements Shape {
	public void calculateArea(double x) {
		System.out.println("The area of the given square is" + (x * x));
	}

	public void calculatePerimeter(double x) {
		System.out.println("The perimeter of the given square is " + (4 * x));
	}
}

public class Task1 {
	/*
	 * Create an Interface 'Shape' with undefined methods as calculateArea and
	 * calculatePerimiter. Create 2 classes Circle & Square that implements
	 * functionality defined in the Shape Interface. Test your code.
	 */

	public static void main(String[] args) {

		Shape circle=new Circle();
		circle.calculateArea(10);
		circle.calculatePerimeter(20);
		
		Shape square=new Square();
		square.calculateArea(10);
		square.calculatePerimeter(20);
	}
}
