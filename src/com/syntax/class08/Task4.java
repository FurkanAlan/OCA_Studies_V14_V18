package com.syntax.class08;

import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {

		/*
		 * Write a program to ask a user to enter item they want to buy 
		 * and the price of that item. 
		 * Every time user enters money accumulate the amount 
		 * and tell the user how much is left to pay off. 
		 * If user give more money program should return a change. 
		 * Whenever a user done with payments program should say 
		 * "Thank you for shopping!"
		 */
		
		Scanner s;
		String item;
		double price;
		double money;
		double amount=0;
		double change;
		double remainingBalance;
		
		s=new Scanner(System.in);
		System.out.println("What are you byuing today");
		item=s.nextLine();
		
		System.out.println("What is the price for the "+item);
		price=s.nextDouble();
		do {
			System.out.println("Please give payment");
			money=s.nextDouble();
			amount=amount+money;
			
			if(amount<price) {
				remainingBalance=price-amount;
				System.out.println("Please give more "+remainingBalance);
			}else if(amount>price) {
				change=amount-price;
				System.out.println("Here is your change "+change);
				break;
			}
			
		}while(price!=amount);
		
		System.out.println("Thank you for shopping");
	}
}
