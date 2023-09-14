package neebalsgurukul.day11;

class Nomatch extends Exception {
    public Nomatch(String message) {
        super(message);
    }
}

public class Assignment01 {
	public static void main(String[] args) {
        try {
            String str = "India"; 
            matchString(str);
        } catch (Nomatch e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    public static void matchString(String input) throws Nomatch {
        if (!input.equals("India")) {
            throw new Nomatch("String does not match 'India'");
        } else {
            System.out.println("String matches 'India'");
        }
    }

}
