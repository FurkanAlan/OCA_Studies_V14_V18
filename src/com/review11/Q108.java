package com.review11;

public class Q108 {

	public static void main(String[] args) {
	String[] arr= {"A","B",	"C","D"};
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]+" ");
		if (arr[i].contentEquals("D")) {
			System.out.println("Work done");
			break;
			
		}
		continue;
	}
	
	}

}
