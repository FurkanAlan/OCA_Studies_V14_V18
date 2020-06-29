package com.syntax.class33;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class HandlingException {

	public static void main(String[] args) {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("Cathed InterruptedException Exception");
		}

		System.out.println("Continue to next try block");

		String fPath = "";

		try {
			FileInputStream fis = new FileInputStream(fPath);

		} catch (FileNotFoundException fne) {
			System.out.println("Cathed FileNotFoundException Exception");
		}

		System.out.println("Continue to next try block");
		
		int a=10;
		int b=0;
		
		try {
			
			System.out.println(a/b);//new ArithmeticException();
			System.out.println("I am code inside try block");//this block will get ignored if exception occurs
		
		}catch (ArithmeticException ae) {
			System.out.println("Cathed ArithmeticException Exception");
		}

		System.out.println("End of the program");
	}
}


