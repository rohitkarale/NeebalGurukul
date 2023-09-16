package com.controller;

import java.util.Scanner;

import com.service.NumberService;

public class NumberController {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the First Number");
		int num1=sc.nextInt();
		System.out.println("Enter the Second Number");
		int num2=sc.nextInt();
		
		NumberService numberService= new NumberService();
		int sum=numberService.addition(num1,num2);
		System.out.println("Addition of "+num1+" and "+ num2+"is"+sum);
	}
}
