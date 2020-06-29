package com.syntax.class23;

public class StudentTest {

	public static void main(String[] args) {
		System.out.println("---- Student Object and  Reference Student Type");
		Student student=new Student();
		student.study();
		student.doHomework();
		
		System.out.println("---- SyntaxStudent Object and  Reference SyntaxStudent Type");
		SyntaxStudent syntax=new SyntaxStudent();
		syntax.doHomework();
		syntax.study();
		syntax.accessParentOverridenMethod();
		syntax.getJob();
		
		System.out.println("---- SyntaxStudent Object and Student Reference Type");
		Student st=new SyntaxStudent();
		st.study();
		st.doHomework();

		//SyntaxStudent st1=new Student();
	}
}
