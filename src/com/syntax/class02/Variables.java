package com.syntax.class02;

public class Variables {

	public static void main(String[] args) {

		String name = "Ahmet";
		String lastName = "Haci";
		char grade = 'B';
		String city = "Atlanta";
		String state = "Georgia";
		long phoneNumber = 5206669095l;

		//String city = "Chantilly";--> error saying duplicate variable
		city = "Chantilly";
		state="Virginia";
		
		phoneNumber=6767899090l;
		
		System.out.println(city);
		System.out.println("My name is "+name+" and "+"my lastname is "+lastName+".");
		System.out.println("I live in city of "+city+ " state "+state+" and "+"my phone number is "+phoneNumber+"!");
		
	}
}
