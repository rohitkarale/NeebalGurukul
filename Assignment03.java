package neebalsgurukul.day09;

public class Assignment03 {
	
	static boolean check(String str) {
		int count=0;
		for(char ch:str.toCharArray()) {
			if(ch=='(') {
				count++;
			}
			else if(ch==')') {
				count--;
				if(count<0) {
					return false;
				}
			}
		}
		return count==0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="())(";
		
		boolean result=check(str);
		System.out.println(result);
		
	}

}
