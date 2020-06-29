package com.syntax.class18;

public class Constructor {
	/*
	 * CE: saying invalid modifier
	 * static Constructor() {
	 * 
	 * }
	 */
	public Constructor(){
		System.out.println("Public constructor");
	}
	
	Constructor(int num){
		System.out.println("Default constructor");
	}
	
	protected Constructor(int num, int num1){
		System.out.println("protected constructor");
	}
	
	private Constructor(String str){
		System.out.println("private constructor");
	}
	
	public static void main(String[] args) {
		Constructor obj=new Constructor();
		Constructor obj1=new Constructor(12);
		Constructor obj2=new Constructor(12,13);
		Constructor obj3=new Constructor("Hi");
	}
}
