package neebalsgurukul.day01;

import java.util.Scanner;

public class Assignment04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Bluebird bus service operates abusonly when its entire 50seats are occupied.
		 * X numberof bookings have beenmade fortheday. Find thenumber of people from X
		 * who will gettotravel today.
		 *  Case 1: Input : X= 109 Output:PeopleTravelling=100 
		 *  Case 2: Input :X = 49 Output : People Travelling= 0 
		 *  Hint : No.of passengers travelling = 50 * (x//50)
		 */
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The value of who get ticket to travel today:-");
		int x=sc.nextInt();
		int noofpassangerstravelling=50*(x/50);
		System.out.println("People Travelling = " +noofpassangerstravelling);
		
	}

}
