package com.syntax.class10;

public class Largest {

	public static void main(String[] args) {
		
		//find largest element from an array
		int[] nums= {200, 30, -1, 900, 56, 787, 3000};
		
		int largest=nums[0];//200
		
		for(int i=1;i<nums.length; i++) {
			
			if(nums[i]>largest) {
				largest=nums[i];
			}
		}
		
		System.out.println("Largest num is "+largest);

	}
}
