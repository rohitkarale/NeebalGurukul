package neebalsgurukul.day04;

import java.util.Scanner;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of years: ");
        int numyears = scanner.nextInt();

        int[] profits = new int[numyears];
        
        for (int year = 0; year < numyears; year++) {
            System.out.print("Enter profit for year " + (2001 + year) + ": ");
            profits[year] = scanner.nextInt();
        }
        
        //put values of array int[] profits = {12, 18, 20, 38, 53, 93, 77, 61, 59, 56};

        int declineyear = -1;

        for (int year = 1; year < numyears; year++) {
            if (profits[year] < profits[year - 1]) {
                declineyear = 2001 + year;
                break; 
            }
        }

        if (declineyear != -1) {
            System.out.println("The decline in in the year " + declineyear);
        }
	}

}
