package com.syntax.class06;

import java.util.Scanner;

public class CompareTwoNumbersNestedIf {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
        System.out.println("Enter any three numbers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int largest;
      
        
        if (num1>num2) {
        	//here num1 is already larger than num2
	        	if(num1>num3) {
	        		largest=num1;
	        	}else {//num1>2 but num1<num3
	        		largest=num3;
	        	}
        }else {// num2>num1
	        	if (num2>num3) {//num2 is larger than num1 AND num2 is >num3
	        		largest=num2;
	        	}else {// num2>num1 but num2<num3
	        		largest=num3;
	        	}
        }
        System.out.println("Largest number is "+largest);
	}
}			//BREAK TILL 11:40

