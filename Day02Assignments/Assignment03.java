package neebalsgurukul.day02;

import java.util.Scanner;

public class Assignment03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Input the lower bound and upper bound then print all the Fibonacci numbers
		 * within the bound Test case : Input lower =5 and upper= 40 Output: 5 8 13 21 34
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Lower Bound:-");
		int lb=sc.nextInt();
		System.out.println("Enter Upper Bound:-");
		int ub=sc.nextInt();
		
		if(lb>ub) {
			System.out.println("Invalid input!!!");
		}
		else
		{
			int first=0,second=1,third;
			
			System.out.println("Fibonecci Series between "+lb+" And "+ub+" is:- ");
			
			for(third=first+second;third<=ub;) {
				if(third>=lb) {
					System.out.println(third+"  ");
				}
				first=second;
				second=third;
				third=first+second;
			}
			
		}
		
		
	}

}
