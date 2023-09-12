package neebalsgurukul.day09;

public class Assignment07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="hello";
		String b="hello";
		boolean flag = false;
		
		if(a.equals(b)) {
			flag=false;
		}
		else {
			int len=a.length();
			for(int i=0;i<len;i++) {
				String str=a.substring(i)+a.substring(0,i);
				
				
				if(str.contains(b)) {
					flag=true;
				}
				
			}
		}
		System.out.println(flag);
	}

}
