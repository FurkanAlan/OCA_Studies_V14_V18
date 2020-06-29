package com.syntax.class05;

import java.util.Scanner;

public class ScannerAndLogical {

	public static void main(String[] args) {
		/* You are a salesman
		 * ask a user for how much his OCA_Hepsi.sales are
		 * based on the amount of OCA_Hepsi.sales we need to calculate his commission
		 * if OCA_Hepsi.sales is between 1 - 100 --> commission should be 10%
		 * if OCA_Hepsi.sales is between 100 and 200 --> commission should be 20%
		 * if OCA_Hepsi.sales is between 200 and 500 --> commission should be 30%
		 * if OCA_Hepsi.sales more than 500 --> commission should be 50%
		 */

		//if your OCA_Hepsi.sales are 200 --> 40
		
		//1. declare all variables that I will need
		Scanner scan;
		double sales;
		double commission;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter your OCA_Hepsi.sales amount");
		sales=scan.nextDouble();
		
		if(sales>=1 && sales<=100) {
			//give user 10% commission
			System.out.println("Based on your OCA_Hepsi.sales you commission is ="+(sales*0.1));
		}else if(sales>100 && sales<=200) {
			//give user 20% commission
			System.out.println("Based on your OCA_Hepsi.sales you commission is ="+(sales*0.2));
		}else if(sales>200 && sales<=500) {
			System.out.println("Based on your OCA_Hepsi.sales you commission is ="+(sales*0.3));
			//give user 30% commission
		}else {
			System.out.println("Based on your OCA_Hepsi.sales you commission is ="+(sales*0.5));
		}
		
		//if commission is > 100 --> you are awesome seller
		//code below will give error since commissiondo not have any value
//		if (commission>100) {
//			System.out.println("You are an awesome seller");
//		}
		
		
		
		
	}
}
