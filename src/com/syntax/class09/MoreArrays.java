package com.syntax.class09;

public class MoreArrays {

	public static void main(String[] args) {
		//arrays are fixed in size
		//if we add more values then we declared --> ArrayIndexOutOfBoundsException
		
		String[] students=new String[3];
		students[0]="Hassna";
		students[1]="Faisal";
		students[2]="Kemal";
		//students[3]="Aaron"; --> during run time java machine will give
		//     ArrayIndexOutOfBoundsException
		//System.out.println(students[3]);
		
		// if we store less elements than we declared
		// compiler will add default values
		String[] inClassStudents=new String[5];
		inClassStudents[1]="Hichem";
		inClassStudents[2]="Tetteh";
		inClassStudents[3]="Hichem";
		inClassStudents[4]="Tetteh";
		//inClassStudents[5]="Hichem";--> will get ArrayIndexOutOfBoundException
		
		System.out.println(inClassStudents[0]);
		
	}
}
