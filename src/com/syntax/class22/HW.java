package com.syntax.class22;

public class HW {

	public static int area(int a, int b) {
		int areaR = a * b;
		System.out.println("Area of Rectangle is equal to " + areaR);
		return areaR;
	}

	public static int area(int a) {
		int areaS = a * a;
		System.out.println("Area of Square is equal to " + areaS);
		return areaS;
	}

	public static int area(int a, int b, int c) {
		int areaB = a * b * c;
		System.out.println("Area of Box is equal to " + areaB);
		return areaB;
	}
}
