package neebalsgurukul.day09;

import java.util.Scanner;

public class Assignment02 {
	
	public static String compressString(String input) {

        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(input.charAt(i - 1));
                if (count > 1) {
                    compressed.append(count);
                }
                count = 1;
            }
        }

        compressed.append(input.charAt(input.length() - 1));
        if (count > 1) {
            compressed.append(count);
        }

        return compressed.toString();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s = sc.next();
        String cp = compressString(s);
        System.out.println("Original String: " + s);
        System.out.println("Compressed String: " + cp);
	}

}
