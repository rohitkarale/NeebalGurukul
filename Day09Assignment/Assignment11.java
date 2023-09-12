package neebalsgurukul.day09;

public class Assignment11 {

public static void main(String[] args) {
    String str = "123";
    permutation(str, "");
    }

    public static void permutation(String str, String currentPermutation) {
        if (str.isEmpty()) {
            System.out.println(currentPermutation);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            String remainingChars = str.substring(0, i) + str.substring(i + 1);
            permutation(remainingChars, currentPermutation + currentChar);
        }
    }
}


