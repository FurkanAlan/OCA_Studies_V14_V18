package com.syntax.class05;

public class MoreLogicalOperators {

	public static void main(String[] args) {
		/*
		 * We have total 7 days in a week if day is 2,3 --> SDLC Class if day 6, 7 -->
		 * Java Class if day 1, 5 --> Off Day if day 4 --> review class
		 */

		int day = 6;
		day = 7;
		// to compare 2 number we use equality operator(==)

		if (day == 2 || day == 3) {
			System.out.println("Today is SDLC Class");
		} else if (day == 6 || day == 7) {
			System.out.println("Today is JAVA class");
		} else if (day == 1 || day == 5) {
			System.out.println("Today is no Class, it is day off");
		} else if (day == 4) {
			System.out.println("Today is a review class with Elion");
		} else {
			System.out.println("Invalid day");
		}

		System.out.println("----------- using strings -------------------");
		// To compare String we use equals
		String day1 = "Saturday";

		if (day1.equals("Tuesday") || day1.equals("Wednesday")) {
			System.out.println("Today is SDLC Class");
		} else if (day1.equals("Saturday") || day1.equals("Sunday")) {
			System.out.println("Today is JAVA class");
		} else if (day1.equals("Monday") || day1.equals("Friday")) {
			System.out.println("Today is no Class, it is day off");
		} else if (day1.equals("Thursday")) {
			System.out.println("Today is a review class with Elion");
		} else {
			System.out.println("Invalid day");
		}
	}
}
