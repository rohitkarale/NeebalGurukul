package neebalsgurukul.day09;

public class Assignment01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x="ad afb afb";
		
		String a[]=x.split(" ");
		
		for(int i=0;i<a.length;i++) {
			if(!a[i].equals(" ")) {
				System.out.print(a[i]);
			}
			
		}
	}
	
	

}
