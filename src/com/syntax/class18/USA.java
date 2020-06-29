package com.syntax.class18;

public class USA {
	
	//create variables to hold state and capital of the state
	String state, stateCapital;
	
	//create method to display state and stateCapital
	public void display() {
		System.out.println(state+" and it's capital is "+stateCapital);
	}
	
	//create a Constructor that will initialize instance variables
	public USA(String state, String stateCapital) {
		this.state=state;
		this.stateCapital=stateCapital;
	}
	
	
	public static void main(String[] args) {
		
		USA usa=new USA("Virginia", "Richmond");
		usa.display();
	}
}
