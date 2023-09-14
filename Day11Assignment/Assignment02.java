package neebalsgurukul.day11;

class VovelException extends Exception{
	public VovelException(String m) {
		super(m);
	}
}

public class Assignment02 {
	
	public static int Vovels(String str2)throws VovelException{
		
		int total=0;
		for(char c:str2.toLowerCase().toCharArray()) {
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                total++;
            }
		}
		return total;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			String str="Hello,World";
			int count=Vovels(str);
			System.out.println("Number of Vovels: "+count);
		}catch(VovelException e) {
			System.out.println("Exception: "+e.getMessage());
		}		
	}
}
