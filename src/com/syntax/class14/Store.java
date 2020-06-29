package com.syntax.class14;

import java.util.Scanner;

public class Store {
	public static void main(String[] args) {
		
		//create an object from Phone class
		//instanciate Phone class
		
		//new Phone(); --> create an Object of Phone
		//iphone --> variable/reference variable
		// Phone --> type pf varibale
		Phone iphone = new Phone();
		iphone.brand = "Iphone";
		iphone.color = "White";
		iphone.model = "X Max";
		iphone.dial();
		iphone.text();
		iphone.pics();
		
		Phone android = new Phone();
		android.brand = "Samsung";
		android.color = "Black";
		android.model = "Note10";
		android.dial();
		android.text();
		android.pics();
		
		Phone nokia = new Phone();
		nokia.brand = "Nokia";
		nokia.color = "Gray";
		nokia.model = "Nokia 9";
		nokia.dial();
		nokia.text();
		nokia.pics();
		
		String str="Hello friends";
		str=str.replace("Hello", "Welcome");
		
		System.out.println(str);
		
		Scanner scan=new Scanner(System.in);
		scan.nextLine();
		
	}
}
