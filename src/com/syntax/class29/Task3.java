package com.syntax.class29;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Student {

	public String name;
	private int studentID;

	public Student(String name, int studentID) {
		this.name = name;
		this.studentID = studentID;
	}

	public String getName() {
		return name;
	}

}

public class Task3 {
	public static void main(String[] args) {

		Set<Student> students = new HashSet<>();

		students.add(new Student("Samir", 101));
		students.add(new Student("Karim", 102));
		students.add(new Student("John", 103));
		students.add(new Student("Jane", 104));
		students.add(new Student("Khan", 105));
		students.add(new Student("Tariq", 106));
		students.add(new Student("Ahmed", 107));
		
		Iterator <Student> student = students.iterator();
		
		while(student.hasNext()) {
			System.out.print(student.next().name+" ");
		}
	}
}
