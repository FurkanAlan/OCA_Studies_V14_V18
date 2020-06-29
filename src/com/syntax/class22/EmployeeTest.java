package com.syntax.class22;

public class EmployeeTest {
	public static void main(String[] args) {

		Employee emp=new Employee();
		emp.salary=80000;
		emp.getPaid();
		
		FullTimeEmployee ft=new FullTimeEmployee();
		ft.salary=90000;
		ft.getPaid();
		
		Contractor ct=new Contractor();
		ct.hourlyRate=50;
		ct.getPaid();
	}
}
