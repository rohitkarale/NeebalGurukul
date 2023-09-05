package neebalsgurukul.day02;

import java.util.Scanner;

//Write a program to calculate Cosine series

public class Assignment01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number:-");
        int a=sc.nextInt();
        double sum=1;
        double n=Math.toRadians(a);
        int fact=1;
        double num=1;
        
        for(int i=1;i<=19;i++) {
        	fact=fact*i;
        	if(i%2==0) {
        		num=-num*n*n;
        		sum=sum+num/fact;
        	}
        }
        System.out.println("Answer= "+sum);
	}

}
