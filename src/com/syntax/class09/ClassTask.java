package com.syntax.class09;

public class ClassTask {

	public static void main(String[] args) {
		/*
		 * Print the following pattern:
			55555
			4444
			333
			22
			1 
		 */
		
		for(int i=5;i>=1;i--) {
           
			for(int j=1;j<=i;j++) {
                System.out.print(i);
            }
			
            System.out.println();
        }
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		/*  Print the following pattern:
			*
			**
			***
			****
			*****
			****
			***
			**
			*
		 */

		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		for(int i=4;i>=1;i--) {
		    for(int j=1;j<=i;j++) {
		    	System.out.print("*"+" ");
		    }
		    System.out.println();
		}
	}
}
