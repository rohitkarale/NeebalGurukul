package neebalsgurukul.day04;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Eenter the size of the array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		
		System.out.println("Enter "+size+"Elements:");
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		
		
		System.out.println("Before Reverse of array:");
		for(int x:a) {
			System.out.println(x);
		}
		int temp=0;
		int left=0;
		int right=a.length-1;
		while(left<right) {
			temp=a[left];
			a[left]=a[right];
			a[right]=temp;
			
			left++;
			right--;
		}
		
		System.out.println("After Reverse Operation is done:");
		for(int x:a) {
			System.out.println(x);
		}
	}

}
