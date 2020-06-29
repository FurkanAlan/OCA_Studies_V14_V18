package com.syntax.class07;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {

		Scanner scan;
		char operator;
		double num;
		double num1;
		double result = 0.0;

		scan = new Scanner(System.in);
		System.out.println("==CALCULATOR===");
		System.out.println("Please enter two number & an Arithmetic operators:");
		System.out.println("==================================================");

		System.out.print("Number 1 :");
		num = scan.nextInt();

		System.out.print("Choose from (+,-, * or /):");
		operator = scan.next().charAt(0);

		System.out.print("Number 2 :");
		num1 = scan.nextInt();
		scan.close();

		switch (operator) {
		case '+':
			result = num + num1;
			break;
		case '-':
			result = num - num1;
			break;
		case '*':
			result = num * num1;
			break;
		case '/':
			result = num / num1;
			break;
		default:
			System.out.println("You have entered wrong operator");
		}

		// if result was not calculated I do not want to see below message
		if (result != 0.0) {
			System.out.println("your calculation is " + result);
		}
	}
}
