package neebalsgurukul.day01;

import java.util.Scanner;

public class Assignment02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Swap Both Halfs ,4 Digit Input a 4-digit number. Interchange the first half
		 * with the second half. Input: 4523 Output : 2345
		 */
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Number:-");
		int a=sc.nextInt();
		
		int first_half=a/100;
		int second_half=a%100;
		System.out.println(second_half+""+first_half);
	}

}
