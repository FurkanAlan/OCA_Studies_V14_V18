package com.syntax.class05;

import java.util.Scanner;

public class ScannerAndLogicalImproved {

	public static void main(String[] args) {

		Scanner scan;
		double sales;
		double commission;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter your OCA_Hepsi.sales amount");
		sales=scan.nextDouble();
		
		//code below look cleaner
		if(sales>=1 && sales<=100) {
			//give user 10% commission
			commission=sales*0.10;
		}else if(sales>100 && sales<=200) {
			//give user 20% commission
			commission=sales*0.2;
		}else if(sales>200 && sales<=500) {
			//give user 30% commission
			commission=sales*0.3;
		}else {
			commission=sales*0.5;
		}
		
		System.out.println("Based on your OCA_Hepsi.sales you commission is ="+commission);

		if (commission>100) {
			System.out.println("You are an awesome seller");
		}
	}

}
