package com.syntax.class22;

public class Recap {

	public void hello() {
		System.out.println("Hello");
	}

	public void hello(String name) { // --This method is overloaded
		System.out.println("hello " + name);
	}
	
	public void hello(int num) { // --This method is overloaded
		System.out.println("hello " + num);
	}
	
	public void hello1(int num) { // --This method is overloaded
		System.out.println("hello " + num);
	}

	// CE: overloading is not possible by changing access modifier
//	private void hello(String str){
//		System.out.println(str);
//	}

	// CE: overloading is not possible by changing return type
//	public String hello(String name) {
//		return name;
//	}
}
