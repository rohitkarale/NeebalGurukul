package neebalsgurukul.day09;

public class Assignment05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Replace characters : Create a program that replaces all occurrences of a
		 * specified character with another character in a given string.
		 */
		
		String str="Mississippi";
		
		char a='i';
		char b='e';
		
		char ch[]=str.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]==a) {
				ch[i]=b;
			}
		}
		String result=new String(ch);
		System.out.println(result);
	}

}
