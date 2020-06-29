package com.syntax.class26;

abstract class Marks1 {

	int mathMark;
	int englishMark;
	int scienceMark;
	int biologyMark;

	Marks1(int mathMark, int englishMark, int scienceMark) {
		this.mathMark = mathMark;
		this.englishMark = englishMark;
		this.scienceMark = scienceMark;
	}

	Marks1(int mathMark, int englishMark, int scienceMark, int biologyMark) {
		this.mathMark = mathMark;
		this.englishMark = englishMark;
		this.scienceMark = scienceMark;
		this.biologyMark = biologyMark;
	}

	public abstract double getPercentage();
}

class StudentA1 extends Marks1 {
	
	StudentA1(int mathMark, int englishMark, int scienceMark) {
		super(mathMark, englishMark, scienceMark);
	}

	@Override
	public double getPercentage() {
		double averagePercentage;
		averagePercentage = ((mathMark + englishMark + scienceMark) / 3);
		System.out.print("The average percentage for " + 3 + " subjects marks is: ");
		return averagePercentage;
	}
}

class StudentB1 extends Marks1 {
	StudentB1(int mathMark, int englishMark, int scienceMark, int biologyMark) {
		super(mathMark, englishMark, scienceMark, biologyMark);
	}

	@Override
	public double getPercentage() {
		double averagePercentage;
		averagePercentage = ((mathMark + englishMark + scienceMark + biologyMark) / 4);
		System.out.print("The average for " + 4 + " subjects marks is: ");
		return averagePercentage;
	}
}

public class Task2_AnotherWay {

	public static void main(String[] args) {
		StudentA1 student1=new StudentA1(80,90,95);
		double averageP=student1.getPercentage();
		System.out.println(averageP+" % ");
		
		System.out.println("===========================");
		
		StudentB1 student2=new StudentB1(90,89,95,90);
		averageP=student2.getPercentage();
		System.out.println(averageP+" %");
	}

}
