package com.service;

import com.exception.IllegalMarksException;

public class MarksService {
	public double computePercentage(double marks[], double totalMarks,
			int numOfSubjects,double perSubjectMarks) throws IllegalMarksException {
		
		if(marks.length!=numOfSubjects)
			throw new IllegalMarksException("No Of Marks given do not match with Number of Subjects!!!");
		
		for(double x:marks) {
			if(x>perSubjectMarks) {
				throw new IllegalMarksException("Entered Marks Should be less than per subject marks!!!");
			}
		}
		
		
		int res = 0;
		for (double x : marks) {
			res += x;
		}
		double percentage = (res / totalMarks) * 100;

		return percentage;
	}

	public char computeGrade(double marks[], double totalMarks) {
		int res = 0;
		for (double x : marks) {
			res += x;
		}
		double percentage = (res / totalMarks) * 100;
		if (percentage >= 75) {
			return 'A';
		}
		if (percentage >= 60) {
			return 'B';
		}
		if(percentage >= 45) {
			return 'C';
		}
		else {
			return 'D';
		}

	}
}
