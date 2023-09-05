package neebalsgurukul.day01;

public class Assignment06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=153;
		
		
		if(a>=100&&a<=999) {
			int firstnumber=a/100;
			int middlenumber=(a/10)%10;
			int lastnumber=a%10;
			
			int sum=firstnumber*firstnumber*firstnumber +
					middlenumber*middlenumber*middlenumber+
					lastnumber*lastnumber*lastnumber;
			
			if(sum==a) {
				System.out.println("Given Number "+a+"is Armstrong Number");
			}else {
				System.out.println("Entered Number"+a+"is not Armstrong Number");
			}
				
		}
		else {
			System.out.println("You have entered Wrong Number");
		}
	}

}
