package neebalsgurukul.day09;

import java.util.Random;
import java.util.Scanner;

public class Assignment20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min=50;
		int max=100;
		Random x=new Random();
		
		int result=x.nextInt(max-min+1)+min;
		
		System.out.println("Random Number:"+result);
	}

}
