package neebalsgurukul.day09;

public class Assignment10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="aaaAAAbbCCC"  ;
		int count[]=new int[26];
		str=str.toLowerCase();
		for(char c:str.toCharArray()) {
			if(Character.isLetter(c)) {
				int i=c-'a';
				count[i]++;
			}
		}
		for(int i=0;i<count.length;i++) {
			if(count[i]>0) {
				
				char character = (char) ('a' + i);
				System.out.println(character+":"+count[i]);
			}
		}
	}

}
