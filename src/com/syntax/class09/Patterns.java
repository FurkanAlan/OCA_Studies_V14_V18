package com.syntax.class09;

public class Patterns {

	public static void main(String[] args) {

		// *****
		for (int a = 1; a <= 5; a++) {
			System.out.print("*");

		}
		System.out.println("----------------");
		/*
		 * ***** 
		 * ***** 
		 * ***** 
		 * *****
		 * 
		 */

		for (int a = 1; a <= 5; a++) {
			System.out.print("*");

		}
		System.out.println();
		
		for (int a = 1; a <= 5; a++) {
			System.out.print("*");

		}
		System.out.println();
		
		for (int a = 1; a <= 5; a++) {
			System.out.print("*");

		}
		System.out.println();
		
		for (int a = 1; a <= 5; a++) {
			System.out.print("*");

		}
		System.out.println();
		System.out.println("--- PRINTING PATTERN USING NEXTED LOOPS --------");
	
		for(int i=1; i<=5; i++) {
			
			for (int j=1; j<=5; j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		System.out.println("--- PRINTING PATTERN 10X10 --------");
	
		for(int i=0; i<10; i++) {
			
			for(int y=0; y<10; y++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
