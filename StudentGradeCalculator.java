package com.codwaysolutions;
import java.util.*;
public class StudentGradeCalculator {
	int numberOfSubject;
	int sumSubject = 0; 
	public StudentGradeCalculator(int numberOfSubject) {
		this.numberOfSubject=numberOfSubject;
	}
	int calculateTotalMarks() {	
		Scanner sc = new Scanner(System.in);

		for(int i=0; i<numberOfSubject; i++) {
			System.out.println("Enter marks for Subject" + (i+1));
			sumSubject = sumSubject + sc.nextInt();
		}
		sc.close();
		return sumSubject;

	}
	int CalculateAveragePercent() {	
		return sumSubject/numberOfSubject;
	}
	String gradeCalculation() {
		int percentage=CalculateAveragePercent();
		if(percentage < 35) {
			return("Grade: Failed");
		} else if(percentage >= 40 && percentage < 60) {
			return ("Grade: C");
		} else if(percentage >= 60 && percentage < 80) {
			return("Grade: B");
		} else if(percentage >= 80 && percentage <= 100){
			return("Grade: A");
		} else {
			return ("Invalid Marks. Please enter valid marks.");
		}
	}
	void displayResult() {
		int marks=calculateTotalMarks();
		int percentage=CalculateAveragePercent();
		System.out.println("Sum of all subjects: "+marks);
		System.out.println("Percentage: "+percentage);
		System.out.println(gradeCalculation());
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of subjects");
		int numberOfSubject =sc.nextInt();
		StudentGradeCalculator sgc=new StudentGradeCalculator(numberOfSubject);
		sgc.displayResult();
		sc.close();
	}
}
