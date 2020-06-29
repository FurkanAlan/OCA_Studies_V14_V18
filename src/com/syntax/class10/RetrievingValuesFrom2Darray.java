package com.syntax.class10;

public class RetrievingValuesFrom2Darray {

	public static void main(String[] args) {
		
		String month[][]= {
	            {"January","February","December", "Hi", "Hello"},
	            {"March","April","May"},
	            {"June","July","August", "Monkey"},
	            {"September","October"}
		};

		int rows=month.length;//how many arrays
		int firstArray=month[1].length;
		System.out.println(firstArray);
		
		for(int i=0; i<month.length; i++) {//iterates over rows
			
			for(int j=0; j<month[i].length; j++) {//iterates over columns
				
				System.out.print(month[i][j]+" ");
			}
			
			System.out.println();
		}
	}
}
