package neebalsgurukul.day01;

import java.util.Scanner;

public class Assignment03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Given the days expressin the formof Years: Months:Weeks:Days 
			Test Case:
			Input : 1020 days
			Output: 2 Years : 9 Months: 2 Weeks : 6 Days
			Hint : 365 days make a year, 30 days make a month , 7 days make a week*/
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number of days:-");
		int days=sc.nextInt();
		
		int years=days/365;
		int months=(days%365)/30;
		int weeks=((days%365)%30)/7;
		int remainingdays=(((days%365)%30)%7);
		
		System.out.println("Output: " + years + " Years : " + months + " Months: " + weeks + " Weeks : " + remainingdays + " Days");
	}

}
