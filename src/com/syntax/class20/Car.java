package com.syntax.class20;

public class Car {
	
	String make, model;

	public Car(){
		System.out.println("I am parent class constructor");
	}
	
	public Car(String make, String model) {
		this.make=make;
		this.model=model;
	}
}

class Mercedes extends Car{
	
	String sportModel;
	
	public Mercedes(){
		//super();//compiler add super() by default
		System.out.println("I am Child class constructor");
	}
	
	public Mercedes(String make, String model,String sportModel) {
		//super(make, model);
		this.sportModel=sportModel;
	}
	
	public void display() {
		System.out.println("I have "+make+" "+model+" "+sportModel);
	}
}