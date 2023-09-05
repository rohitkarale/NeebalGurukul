package neebalsgurukul.day02;

public class Assignment04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Print first 10 even fibonacii numbers
		
		int n=10;
		System.out.println("Fibonecci Series of first 10 even Numbers:-");
		
		int first=0;
		int second=1;
		System.out.println(first+" \n"+second);
		for(int i=0;i<n-2;) {
			int third=first+second;
			
			if(third%2==0) {
				System.out.println(third);
				i++;
			}
			
			first=second;
			second=third;
			
		}
		
		
	}

}
