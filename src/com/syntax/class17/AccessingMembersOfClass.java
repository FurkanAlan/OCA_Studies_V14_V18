package com.syntax.class17;

public class AccessingMembersOfClass {

	public static void main(String[] args) {
		
		Employee emp=new Employee();
		emp.name="Faisal";
		emp.lastName="Sakhi";//protected member
		emp.salary=100000;//default member
		//emp.ssn=78969;CE: field ssn is not visible
		
		Employee.method1();
		emp.method2();
		emp.method3();
		//emp.method4(); CE: method4 is not visible
		
	}
}
