package com.syntax.class01;

public class VariableDeclaration {

	public static void main(String[] args) {
		//create a variable and store value
		// 1. declaring a variable and assigning a value
		boolean b=true;
		// 2 way: 1 step--> declare variable
		//			2 step --> assign value
		int i;
		i=1000;
		// declare multiple variables and assign value later
		char x, y,z;
		x='A';
		y='^';
		z='0';
		//we cannot have variables with same name in 1 program
		//double i=12.99; --> java will complain
		z='#';//reassigning the value
		i=2000;
		System.out.println(i);
		//declaring variables and storing same values
		int num=100;
		int num1=100;
		System.out.println(z);
	}
}
