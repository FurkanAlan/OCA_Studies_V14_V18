package com.syntax.class07;

public class WhileLoopIntro {

	public static void main(String[] args) {
		int time=10;

		if(time>12){
			System.out.println("Good morning");
		}

		System.out.println("------  WHILE LOOP ---------");
//		while(time<12){
//			System.out.println("Good morning");//CODE WILL EXECUTE INFINETELY
//		}
		while(time>12){
			System.out.println("Good morning");
			time++;
		}
		
		//how to print numbers from 1 to 50?
		
		int num=1;
		while(num<=50) {
			System.out.println(num);
			num++;
		}
		System.out.println("***************************");
		// how to print numbers from 20 to 30
		int num1=20;
		while(num1<=30) {
			System.out.println(num1);
			num1++;
		}
		System.out.println("***************************");
		// how to print number from 5 to 15 all in 1 line
		int num2=5;
		while(num2<=15) {
			System.out.print(num2+" ");
			num2++;
		}
		System.out.println("***************************");
		// how to print values from 10 to 1?
		int num3=10;
		
		while(num3>=1) {
			System.out.println(num3);
			num3--;
		}
		//how to print 50 to 1
		// how to print odds numbers from 1 to 20
		//AFTER YOU DONE BREAK FROM FROM 11:30 TILL 11:45
		
		
		
		
	}
}
