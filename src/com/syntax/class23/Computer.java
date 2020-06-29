package com.syntax.class23;

class SmartMachine{
	
	public void smart() {
		System.out.println("I am a smart machine");
	}
}

public class Computer extends SmartMachine{
	
	String brand;

	public Computer(String brand) {
		this.brand = brand;
	}

	public void run() {
		System.out.println(brand + " can run the system");
	}

	public void save() {
		System.out.println(brand + " can save input");
	}

	public void transfer() {
		System.out.println(brand + " can transfer information");
	}

	public void storage() {
		System.out.println(brand + " can store input");
	}
}

class Apple extends Computer {
	public Apple(String brand) {
		super(brand);
	}

	public void run() {
		System.out.println(brand + " can run the system faster");
	}

	public void save() {
		System.out.println(brand + " saves input in different way");
	}

	public void transfer() {
		super.transfer();
	}

	public void safe() {
		System.out.println(brand + " is safer");
	}
}

class Lenovo extends Computer {
	public Lenovo(String brand) {
		super(brand);
	}

	public void run() {
		super.run();
		transfer();
	}
}
class HP extends Computer{
	public HP (String brand) {
		super(brand);
	}
}