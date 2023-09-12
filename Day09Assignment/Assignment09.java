package neebalsgurukul.day09;

public class Assignment09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="multipleWordsInCamelCaseAreHere" ;
		int count=1;
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(Character.isUpperCase(c)) {
				count++;
			}
		}
		System.out.println(count);
	}

}
