package neebalsgurukul.day09;

public class Assignment04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="OneWord";
		String trimmed=s.trim();
		int count=1;
		for(int i=0;i<trimmed.length();i++) {
			if(trimmed.charAt(i)==' ') {
				count++;
			}
		}
		System.out.println(count);
		
		
	}

}
