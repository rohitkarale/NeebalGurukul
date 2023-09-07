package neebalsgurukul.day04;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String months[]= {"January","February","March","April","May","June","July","August","September","October","November","December"};
		
		int monthlySales[]= new int[12];
		
		for (int i = 0; i < 12; i++) {
            System.out.print("Enter the sale of the month:-\n"+months[i]+":");
            monthlySales[i]=sc.nextInt();
            }
		
			/*Please enter these values
			 * January 125,000 July 105,000 February 93,000 August 120,000 March 80,000
			 * September 90,000 April 75,000 October 115,000 May 84,000 November 123,000
			 * June 110,000 December 150,000
			 */
		int[] quarterlySales = new int[4];
		
		int totalSales = 0;
        for (int i = 0; i < 12; i++) {
            totalSales += monthlySales[i];
            quarterlySales[i / 3] += monthlySales[i];
        }
        
        System.out.println(" sale of the month :");
        for (int i = 0; i < 12; i++) {
            System.out.println(months[i] + ": " + monthlySales[i]);
        }
        
        System.out.println("Quarterly Sale of the month:");
        for (int i = 0; i < quarterlySales.length; i++) {
            int startMonth = i * 3;
            int endMonth = startMonth + 2;
            System.out.println("Quarter " + (i + 1) + " (" + months[startMonth] + " - " + months[endMonth] + "): " + quarterlySales[i]);
        }
        
        System.out.println("\nTotal Sales: " + totalSales);
        
	}

}
