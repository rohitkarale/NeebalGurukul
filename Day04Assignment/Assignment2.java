package neebalsgurukul.day04;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,1,1,0,1,1,1,1,1,1,0,0,1,1,1,0,1,1,1,0,1};
		
		int totaldays=arr.length;
		int presentdays=0;
		double attper=0;
		
		for(int i=0;i<totaldays;i++) {
			if(arr[i]==1) {
				presentdays=presentdays+1;
			}
		}
		attper=(double)presentdays/totaldays*100;
		
		System.out.println("Total Days: " + totaldays);
        System.out.println("Present Days: " + presentdays);
        System.out.println("Attendance Percentage: " + attper + "%");
		
	}

}
