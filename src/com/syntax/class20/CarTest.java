package com.syntax.class20;

public class CarTest {
	public static void main(String[] args) {

		//Car car=new Car();
		
		System.out.println("---------------------");
		
		Mercedes merc=new Mercedes();
		merc.display();
		
		System.out.println("---------------------");
		
		Mercedes merc1=new Mercedes("Mercedes", "M","NO AMG");
		merc1.display();
		
		System.out.println("---------------------");
		
		Mercedes merc2=new Mercedes("Mercedes", "S","AMG");
		merc2.display();
		
	}
}
