package com.syntax.class13;

public class Q2 {

	public static void main(String[] args) {
		/*
		 * Write a java program to check whether a given number is prime or not?
		 * 
		 * prime number is a number that is greater than 1
		 * prime number should meet 2 conditions(divisible by 1 and itself only)
		 * 2(1,2),3(2,3),5(2,3,4,5),7(2,3,4,5,6,7),11,13,17
		 */

		int given = 10;
		boolean isPrime=true;
		
		if(given>1) {
			for(int i=2; i<given; i++) {
				if(given%i==0) {
					isPrime=false;
					break;
				}
			}
			
		}else {
			isPrime=false;
		}
		System.out.println("Given number "+given+" is prime? "+isPrime);
		
	}
}
