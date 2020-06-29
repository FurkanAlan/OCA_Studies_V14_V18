package com.syntax.class20;

public class TestClass {

	public static void main(String[] args) {
		
		Employee emp=new Employee();
		emp.empNumber=101;
		emp.salary=90000;
		emp.getPaid();
		Employee.company="ABC";
		Employee.work();
		System.out.println("-------------------------------------");
		ProductOwner po=new ProductOwner();
		//features accessible from grand parent
		po.empNumber=123;
		po.salary=150000;
		//po.ssn --> CE: private members of the class not available 
		//--> DO NOT PARTICIPATE I INHERITANCE
		ProductOwner.company="Syntax";
		//features accessible from immediate parent
		po.ceremonies="Sprint Grooming, Sprint Planning, Sprint Demo, Daily Stand up";
		po.attendMeetings();
		//accessing own features
		po.prioritizeBacklog();
		
		ProductOwner.work();
		Employee.work();
	}
}
