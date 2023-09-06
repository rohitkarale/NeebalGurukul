package neebalsgurukul.day02;

public class Assignment07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 1; i <=5; i++) {
			
		    for (int j = 5; j >= 1; j--) {
		    	
		    	if(i==j) {
		    		System.out.print(j);
		    	}
		        
		    	else {
		    		System.out.print(" ");
		    	}
		    }

		    for (int j = 2; j <= 5; j++) {
		    	if(i==j)
		    	System.out.print(j);
		    	else
		    		System.out.print(" ");
		    }

		    System.out.println();
		}
		
		for (int i = 4; i >=1; i--) {
		    for (int j = 5; j >= 1; j--) {
		    	if(i==j)
		        System.out.print(j);
		    	else
		    		System.out.print(" ");
		    }

		    for (int j = 2; j <= 5; j++) {
		    	if(i==j)
		    	System.out.print(j);
		    	else
		    		System.out.print(" ");
		    }

		    System.out.println();
		}
	}

}
