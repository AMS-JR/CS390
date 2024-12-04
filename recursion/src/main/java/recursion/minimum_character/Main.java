package recursion.minimum_character;

public class Main {
    public static void main(String[] args) {
        //problem 2
        System.out.println("Minimum character is " +miniChar("dftyuaowb"));
    }
    /**
     * Recursion to return the Min char from a given string
     * problem 2
     * @param str
     * @return char
     */
    public static char miniChar(String str){

        if(str.length() == 1){
            return str.charAt(0);
        }

        char currentChar = str.charAt(0);
        char miniChar = miniChar(str.substring(1));

        return (currentChar > miniChar)? miniChar : currentChar;
    }
}
