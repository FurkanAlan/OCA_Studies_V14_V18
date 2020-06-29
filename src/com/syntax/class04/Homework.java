package com.syntax.class04;

public class Homework {

	public static void main(String[] args) {

		// task 1

		int month = 2;

		if (month == 1) {
			System.out.println("it's January");
		} else if (month == 4) {
			System.out.println("It's April");
		} else if (month == 5) {
			System.out.println("It's May");
		} else if (month == 2) {
			System.out.println("It's February");
		} else if (month == 3) {
			System.out.println("It's March");
		}  else if (month == 6) {
			System.out.println("It's June");
		} else if (month == 7) {
			System.out.println("It's July");
		} else if (month == 8) {
			System.out.println("it's August");
		} else if (month == 9) {
			System.out.println("it's September");
		} else if (month == 10) {
			System.out.println("it's October");
		} else if (month == 11) {
			System.out.println("It's November");
		} else if (month == 12) {
			System.out.println("it's December!!!");
		} else {
			System.out.println("It's not the correct month number");
		}

		// task-2:Write a program to check whether number is positive or negative.
		int num = 0;
		int i1 = 0;

		if (num > i1) {
			System.out.println("It's a Positive Number");
		} else if (num < i1) {
			System.out.println("It's a Negative number");
		} else {
			System.out.println("You number is 0");
		}

		// task-3:
		int myNumber = 51;
		int condition = 2;
		
		if (myNumber % condition == 0) {
			System.out.println("It's an Even Number");
		} else {
			System.out.println("It's an Odd number");
		}
	}
}