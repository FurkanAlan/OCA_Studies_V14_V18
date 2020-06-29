package com.syntax.class03;

public class RelationalEqualityOperators {

	public static void main(String[] args) {
	
		int i=10;
		int y=20;
		
		System.out.println(i>y);//false
		System.out.println(i<y);//true
		System.out.println(i==y);//false
		System.out.println(i!=y);//true
		
		System.out.println("----------------------------");
		
		double a=900.99;
		double b=100.99;
		
		boolean result=a>b;//true
		boolean result1=a==b;//false
		boolean result2=a!=b;//true

		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);
	}
}
