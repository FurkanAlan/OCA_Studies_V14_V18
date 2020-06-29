package com.syntax.class17;

public class StaticKeywordTest {

	public static void main(String[] args) {
		//access static members of another class
		StaticKeyword.brand="Android";
		StaticKeyword.touchScreen=true;
		StaticKeyword.displayGeneralInfo();
		
		//access instance members of another class
		StaticKeyword sk=new StaticKeyword();
		sk.color="red";
		sk.memory=128;
		sk.displaySpecifications();
		
		StaticKeyword sk1=new StaticKeyword();
		sk1.color="red";
		sk1.memory=128;
		
		StaticKeyword sk2=new StaticKeyword();
		sk2.color="red";
		sk2.memory=128;
		sk2.brand="Nokia";// brand will change for all instances
		
		//not the right way access static method
		sk2.displayGeneralInfo();
		sk1.displayGeneralInfo();
		sk.displayGeneralInfo();
		
		
	}
}
