package com.syntax.class07;

public class PostAndPreIncrement {

	public static void main(String[] args) {
		
		// ++, --
		// preincrement ++y, postincrement y++
		int z;
		int y=10;
		z=y++;//postincrement = first use the variable and then increment
		System.out.println(z);
		
		int w;
		int x=10;
		w=++x;//first increment and then use it and assign it 
		System.out.println(w);
		
		int num=1;
		while(num<5) {
			System.out.println(++num);
		}
		System.out.println("&&&&&&&&&&&&&&&&");
		
		int num1=1;
		while(num1<5) {
			System.out.println(num1++);
		}
	}
}
