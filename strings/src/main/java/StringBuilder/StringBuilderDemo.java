package StringBuilder;

public class StringBuilderDemo {
    public static String reverse(String palindrome){
        int len = palindrome.length();
        char[] tempCharArray = new char[len];
        char[] charArray = new char[len];

        // put original string in an
        // array of chars
        for (int i = 0; i < len; i++) {
            tempCharArray[i] =
                    palindrome.charAt(i);
        }

        // reverse array of chars
        for (int j = 0; j < len; j++) {
            charArray[j] =
                    tempCharArray[len - 1 - j];
        }

        String reversePalindrome =
                new String(charArray);
        return reversePalindrome;
    }
    public static String reverseUsingStringBuilder(String palindrome){
        StringBuilder sb = new StringBuilder(palindrome);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(StringBuilderDemo.reverse("Dot saw I was Tod"));
        System.out.println(StringBuilderDemo.reverseUsingStringBuilder("Dot saw I was Tod"));
    }
}
