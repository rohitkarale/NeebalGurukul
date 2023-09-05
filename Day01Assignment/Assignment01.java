package neebalsgurukul.day01;

import java.util.Scanner;

public class Assignment01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * convert millsec to hrs,mins,secs given the time in milliseconds express in
		 * the form of hours: minute: seconds sample: input: 7000234 output: 1: 56: 40
		 * hint: 1000 milliseconds make 1 second 60 seconds makes 1 minute 60 minutes
		 * make 1 hour
		 */
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The value of milliseconds you want to convert into hours: minute: seconds");
		int millisec=sc.nextInt();
		
		int sec=millisec/1000;
		int min=sec/60;
		int hours=min/60;
		
		sec=sec%60;
		min=min%60;
		
		System.out.println("The Converted hours: minute: seconds are\n"+hours+":"+min+":"+sec);
	}

}
