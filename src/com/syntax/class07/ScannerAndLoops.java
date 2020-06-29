package com.syntax.class07;

import java.util.Scanner;

public class ScannerAndLoops {

	public static void main(String[] args) {

		// we want to ask user's name 5 times and print Good Afternoon ___ 5 times

		Scanner input;
		String name = null;
		int num = 1;

		input = new Scanner(System.in);
		while (num <= 3) {
			System.out.println("What is your name");

			name = input.nextLine();
			System.out.println("Good afternoon " + name);

			num++;
		}
		
		//we are playing a lottery and a lucky number is 17;
		//we want to keep asking user any number from 1-20 
		//until he guess the lucky number --> congrats
		// break from 1:45-2 pm
	}
}
