package neebalsgurukul.day01;

import java.util.Scanner;

public class Assignment07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * The military uses a 4-digit number system for communicating the time of day.
		 * For example, 2350 hours ie 23 hours and 50 minutes in 24-hour clock which is
		 * 11:50pm. Write a program to input the 4-digit time and convert it to 12-hour
		 * format. Eg: 2350 >>> 11:50pm
		 */
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The time:-");
		int time=sc.nextInt();
		
		int hours=time/100;
		int minutes=time%100;
		
		boolean bln=(hours<12)? true:false;
		
		if (hours > 12) {
            hours =hours-12;
        } else if (hours == 0) {
            hours = 12;
        }
		if(bln=true) {
			System.out.println(hours+":"+minutes+"PM");
		}
		else {
			System.out.println(hours+":"+minutes+"AM");
		}
	}

}
  