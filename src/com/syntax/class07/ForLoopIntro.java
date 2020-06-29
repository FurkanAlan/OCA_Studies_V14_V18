package com.syntax.class07;

public class ForLoopIntro {

	public static void main(String[] args) {
		
		//Good morning 5 times
		for(int c=1; c<6; c++) {
			
			System.out.println("Good morning");
			
		}
		//print numbers from 1 to 10
		for(int i=1; i<=10; i++) {
			
			System.out.println(i);
		}
		//print numbers from 10 to 1
		for(int i=10; i>=1; i--) {
			System.out.println(i);
		}
		
		//what will be the output?
		for(int i=0; i<=50; i+=5) {
			System.out.println(i);
		}
		
		//what is the output
		int sum=0;
		
		for(int i=1; i<5; i++) {
			sum=sum+i;
		}

		System.out.println("Value of sum "+sum);
	}
}
