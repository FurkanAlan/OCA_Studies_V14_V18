package com.syntax.class05;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		Scanner variable = new Scanner(System.in);

		System.out.println("Please enter any text");
		String text = variable.nextLine();
		
		System.out.println("Please enter any text");
		String text1 = variable.next();

		System.out.println(text);
		System.out.println(text1);
		
		variable.nextLine();
		
		System.out.println("Please enter any numbers");
		int num=variable.nextInt();
		
		System.out.println("Please enter any decimals");
		double d=variable.nextDouble();
		
		System.out.println(num);
		System.out.println(d);
		
	}
}
