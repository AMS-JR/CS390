package recursion.palindrome;

public class Main {
    public static void main(String[] args) {
        System.out.println("Is number palindrome? " + checkPalindrome(1231) );
    }
    /**
     * Recursive method to check if a string is a palindrome
     * problem 4
     * @param str
     * @param left
     * @param right
     * @return boolean
     */
    private static boolean isPalindrome(String str, int left, int right){
        if (left >= right){
            return true;
        }

        if(str.charAt(left) == str.charAt(right)){
            return isPalindrome(str, left+1, right-1);
        }
        return false;
    }

    /**
     * Public Utility method to check if a number is a palindrome
     * @param Num
     * @return boolean
     */
    public static boolean checkPalindrome(int Num){
        if (Num < 0){
            return false;
        }
        String numStr = String.valueOf(Num);
        return isPalindrome(numStr, 0, numStr.length()-1);
    }
}
