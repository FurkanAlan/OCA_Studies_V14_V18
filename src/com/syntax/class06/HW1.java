package com.syntax.class06;
import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {

		/*
		 * Write a program for user to enter his/hers birth month. Based on the month
		 * define the season. Example: if user is born in June, July or August → season
		 * =“Summer”. At the end of the program we should see output as “You were born
		 * ______“.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your birth month ");
		String month = scan.nextLine();

		String season = null;

		if ((month.equals("January")) || (month.equals("February")) || (month.equals("December"))) {
			season = "Winter";
		} else if ((month.equals("September")) || (month.equals("October")) || (month.equals("November"))) {
			season = "Autumn";
		} else if ((month.equals("June")) || (month.equals("July")) || (month.equals("August"))) {
			season = "Summer";
		} else if ((month.equals("March")) || (month.equals("April")) || (month.equals("May"))) {
			season = "Spring";
		} else {
			//season="Invalid";
			System.out.println("Please enter valid month");
		}
		
		System.out.println("You were born in " + season + ".");
	}
}
