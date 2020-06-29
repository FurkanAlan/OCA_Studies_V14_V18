package com.syntax.class23;

public class FinalKeyword {

	public static String str="Hello";
	static final String str1="Bye";//Final variable=CONSTANT
	
	public static final String APPLICATION_URL="https://syntaxtechs.com";
	
	final char GRADE='A';
	
	public static void main(String[] args) {
		
		str="Hi";
	
		//str1="Good bye"; CE:
		//applicationURl="http://google.com"
	}
	
	public final void hello() {
		System.out.println("I am a final method");
	}
	
	public final void hello(String name) {
		System.out.println("Hello "+name);
	}
}

class SubClass extends FinalKeyword{
	
//	public void hello() {CE: cannot override final method
//		
//	}
	
	public void hello(int num) {//not overriding(method signature is different), it is a new method 
		System.out.println("hello of child class");
	}

}