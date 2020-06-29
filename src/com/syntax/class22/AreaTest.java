package com.syntax.class22;

public class AreaTest {

	public static void main(String[] args) {
		
		HW obj=new HW();
		int area=obj.area(12, 14);
		System.out.println(area);
		
		area=obj.area(40);
		System.out.println(area);
		
		String str="Hello friends";
		System.out.println(str.substring(6));//friends
		System.out.println(str.substring(0,5));//hello
	}

}
