package com.syntax.class04;

public class NestedIfContinues {

	public static void main(String[] args) {

		// check if patient has any allergies
		// if no allergies --> you are healthy
		// othewise check if patient has:
		// orange allergy --> do not eat oranges
		// apple allergy --> do not eat apples
		// kiwi allergy --> do not eat kiwis

		boolean allergy = true;
		boolean appleAllergy = true;
		boolean orangeAllergy = true;
		boolean kiwiAllergy = false;

		if (allergy) {
			System.out.println("Please answer below");
			
			if (orangeAllergy) {
				System.out.println("Do not eat oranges");
			}
			
			if(appleAllergy) {
				System.out.println("Do not eat apples");
			}
			
		} else {
			System.out.println("You are healthy");
		}
	}
}
