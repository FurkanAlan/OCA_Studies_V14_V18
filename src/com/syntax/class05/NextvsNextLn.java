package com.syntax.class05;

import java.util.Scanner;

public class NextvsNextLn {

	public static void main(String[] args) {
		Scanner variable = new Scanner(System.in);

		System.out.println("Please enter any text");
		String text1 = variable.next();
		
		System.out.println("Please enter any text");
		String text = variable.nextLine();

		System.out.println(text);
		System.out.println(text1);
		

	}

}
