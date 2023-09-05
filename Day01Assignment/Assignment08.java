package neebalsgurukul.day01;

import java.util.Scanner;

public class Assignment08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Input the name and numbers of units consumed by the consumer. Calculate the
electricity bill. 
			For the first 100 units charge Rs. 4 per units For the next 200 units charge Rs. 5 for every additional unit Above 300 units charge Rs 10 for every additional unit If the amount exceeds Rs. 1000 charge 5 %additional surcharge All the amounts are charged 18% GST. Print the name ,unit consumed and the amount to be paid. 			Example: 
			Input: 
			Name : Arjun Units :310 
			Output : Name : Arjun 
			Units : 310 
			Amount : 1858.5
			Note : 400 (First 100 units) + 1000 (Next 200 units) + 100 ( 10 units) + 75 (5% surcharge) + 283.5(GST)= 1858.5 (Total)
		 */
		
		Scanner scanner = new Scanner(System.in);
        
        // Input name and units consumed
        System.out.print("Enter The Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter the Units Consumed: ");
        int units = scanner.nextInt();
        
        double bill = 0;
        
        if (units <= 100) {
            bill = units * 4;
        } 
        else if (units <= 300) {
            bill = 100 * 4 + (units - 100) * 5;
        } 
        else {
            bill = 100 * 4 + 200 * 5 + (units - 300) * 10;
        }
        
        double amount=bill;
        double surcharge = 0;
        if (amount > 1000) {
            surcharge = 0.05 * amount;
        }
        
        double gst = 0.18 * (amount + surcharge);
        
        double totalAmount = amount + surcharge + gst;
        
        
        System.out.println("Name: " + name);
        System.out.println("Units Consumed: " + units);
        System.out.println("Amount: " + totalAmount);
	}

}
