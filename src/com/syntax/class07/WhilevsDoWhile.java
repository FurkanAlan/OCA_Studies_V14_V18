package com.syntax.class07;

public class WhilevsDoWhile {

	public static void main(String[] args) {
		
		//hello 5 times
		int num=11;
		
		while(num<=5) {
			System.out.println("Hello");
			num++;
		}
		
		System.out.println("----- USING DO WHILE LOOP ------------");
		// hello 5 times
		int num1=6;
		
		do {
			System.out.println("Hello");
			num1++;
			
		}while(num1<=5);
	}
}
