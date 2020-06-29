package com.syntax.class12;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {

		// task 1
		String str = "Sunday";
		char reverse;
		for (int i = str.length() - 1; i > -1; i--) {
			reverse = str.charAt(i);
			System.out.print(reverse);
		}
		System.out.println();

		// task 2
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string please :");
		String text = input.nextLine();
		if (!text.isEmpty()) {
			if (text.length() % 2 == 1 && text.length() >= 3) {

				System.out.println(text.charAt((text.length()) / 2));
			} else {
				System.out.println("Even number of characters");
			}
		}

		// task 3
		Scanner scan = new Scanner(System.in);
		System.out.println("What is Mom's first name");
		String name1 = scan.nextLine();

		System.out.println("What is Dad's first name");
		String name2 = scan.nextLine();

		System.out.println("Boy or Girl");
		String babyName = scan.nextLine();
		
		String SuggestedBName = null;
		
		int half1 = name1.length() / 2;
		int half2 = name2.length() / 2;
		
		if (babyName.equalsIgnoreCase("Girl")) {
			SuggestedBName = name1.substring(0, half1) + name2.substring(half2);
			System.out.println(SuggestedBName);

		} else if (babyName.equalsIgnoreCase("Boy")) {
			SuggestedBName = name2.substring(0, half2) + name1.substring(half1);
			System.out.println(SuggestedBName);
		}

	}
}
