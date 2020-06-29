package com.syntax.class05;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		/*
		 * Task-1:Create a Java program that will ask if user has a credit card or not.
		 * If you user does not have a credit card then offer them. If they do have one
		 * ask what is balance on the card? If balance of the card is larger than 1000,
		 * tell them to pay off immediately, otherwise you can tell them that they can
		 * spend more.
		 */
//		Scanner userInput = new Scanner(System.in);
//		System.out.print("Do you use credit card? ");
//		String answer = userInput.nextLine();
//		
//		if (answer.equals("Yes")) {
//			System.out.print("what is the current balance on your credit card?");
//			double c = userInput.nextDouble();
//			if (c >= 1000) {
//				System.out.println("Please pay off your dues immediately");
//			} else {
//				System.out.println("Please spend more to get higher credit limit");
//			}
//		} else {
//			System.out.println("We have a great Credit Card offer for you. Are you interested?");
//		}

		System.out.println("-------------------------------");
		Scanner input = new Scanner(System.in);
		System.out.print("Do you use credit card? ");
		boolean answer1 = input.nextBoolean();
		
		if (answer1) {
			System.out.print("what is the current balance on your credit card?");
			double c = input.nextDouble();
			if (c >= 1000) {
				System.out.println("Please pay off your dues immediately");
			} else {
				System.out.println("Please spend more to get higher credit limit");
			}
		} else {
			System.out.println("We have a great Credit Card offer for you. Are you interested?");
		}
	}

}
