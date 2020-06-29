package com.syntax.class25;

public class DrivableTest {

	public static void main(String[] args) {
		
		Drivable obj=new Cars();
		//Drivable.MOVE_FAST=false;
		obj.drive();
		
		Cars car=new Cars();
		car.drive();
		car.stop();

	}
}
