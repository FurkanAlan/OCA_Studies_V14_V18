package com.syntax.class23;

public class Student {

	public void study() {
		System.out.println("Student studies");
	}

	public void doHomework() {
		System.out.println("Students do homeworks");
	}
}

class SyntaxStudent extends Student {

	@Override
	public void study() {
		System.out.println("Syntax students are coding");
	}

	public void getJob() {
		System.out.println("Syntax students become QA automation engineer");
	}
	
	public void accessParentOverridenMethod() {
		super.study();
	}
}

class CollegeStudent extends Student {
	@Override
	public void study() {
		System.out.println("College Students have exams");
	}

	void attend() {
		System.out.println("Students attend school ceremonies");
	}
}

class SchoolStudent extends Student {
	@Override
	public void study() {
		super.study();
		System.out.println("School students are on vacation");
	}
}