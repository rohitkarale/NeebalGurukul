package neebalsgurukul.day01;

import java.util.Scanner;

public class Assignment05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Input 3 numbers and find the largest. 
		 * Input: 7 3 5 
		 * Output: 7 
		 * Condition : 
		 * your program cannot have more than 2 comparisons
		 */
		Scanner sc= new Scanner(System.in);
		//int a=7,b=3,c=5;
		System.out.println("Enter a :- ");
		int a=sc.nextInt();
		System.out.println("Enter b:- ");
		int b=sc.nextInt();
		System.out.println("Enter c:- ");
		int c=sc.nextInt();
		int d=a>b?a:b;
		int e=d>c?d:c;
		
		System.out.println("Greater number between"+a+","+b+","+c+" is:-"+e);
	}

}
