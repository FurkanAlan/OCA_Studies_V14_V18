package com.syntax.class22;

public class BankTest {

	public static void main(String[] args) {
		
		Bank bank=new Bank(700);
		double fee=bank.chargeFee();
		System.out.println(fee);
		
		BOA boa=new BOA(700);
		fee=boa.chargeFee();
		System.out.println(fee);
		
		PNC pnc=new PNC(700);
		fee=pnc.chargeFee();
		System.out.println(fee);
		
		TD td=new TD(700);
		fee=td.chargeFee();
		System.out.println(fee);
	}
}
