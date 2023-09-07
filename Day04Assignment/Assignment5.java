package neebalsgurukul.day04;

import java.util.Scanner;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many elements you want to store in array");
		int x=sc.nextInt();
		
		if (x <= 0) {
            System.out.println("Invalid input. Number of elements must be greater than zero.");
            return;
        }
		
		int a[]=new int[x];
		
		for(int i=0;i<x;i++) {
			System.out.println("Enter "+i+" element of the array");
			a[i]=sc.nextInt();
		}
		
		int minIndex = 0;
        for (int i = 1; i < x; i++) {
            if (a[i] < a[minIndex]) {
                minIndex = i;
            }
        }
        System.out.println("Index of the smallest element: " + minIndex);
		
	}

}
