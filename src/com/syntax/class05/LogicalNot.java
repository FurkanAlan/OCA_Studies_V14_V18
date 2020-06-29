package com.syntax.class05;

public class LogicalNot {

	public static void main(String[] args) {
		
		//NOT(!) - reverse the condition
		boolean b=!true;
		boolean val=!false;
		
		System.out.println(b);
		System.out.println(val);
		
		boolean isCold=false;
		
		if(!isCold) {
			System.out.println("hello");
		}else {
			System.out.println("bye");
		}
		
		String day1="Monday";
		
		//if it is not monday or friday --> Find me at Syntax
		
		// day is not monday and my day is not friday
		
		if(!day1.equals("Monday") && !day1.equals("Friday")) {
			System.out.println("Find me at Syntax");
		}
		System.out.println("----------------------------");
		
		// day is not monday and my day is not friday
		if(!(day1.equals("Monday") || day1.equals("Friday"))) {
			System.out.println("Find me at Syntax");
		}
		
		
	}
}
