package com.syntax.class33;

public class InfoAboutException {

	public static void main(String[] args) {
		
		String str="Hello";
		
		try {
			
			char character=str.charAt(10);// new StringIndexOutOfBoundsException();
			
			System.out.println(character);
		
		}catch (StringIndexOutOfBoundsException se) {
			//to get info about the exception
			//se.printStackTrace();//name, message about E, where it occurs
			//System.out.println(se);//name, message about E
			System.out.println(se.getMessage());
		}
		
		System.out.println(" -----   END OF THE PROGRAM --------");

	}
}