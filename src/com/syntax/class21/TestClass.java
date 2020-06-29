package com.syntax.class21;

public class TestClass {
	public static void main(String[] args) {

		MathTeacher mt=new MathTeacher("Brian", "Quisbert");
		System.out.println(mt.name);
		
		MathTeacher mt1=new MathTeacher("Sarmed", "Halabi");
		System.out.println(mt1.name);
		
		JavaTeacher jt=new JavaTeacher("Anna", "Smith", "Java 8");
		System.out.println(jt.name);
	}
}
