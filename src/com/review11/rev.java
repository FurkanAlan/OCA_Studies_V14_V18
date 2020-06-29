package com.review11;

public class rev {

	    public static void main(String[] args) { 
	    

	        String  reverse="";
	        
	        String input = "i love java"; 
	        for(int i=input.length()-1;  i>=0; i--) {
	        	reverse= reverse+input.charAt(i);
	        }
	        	System.out.println(reverse);
	      
	    } 
	} 

