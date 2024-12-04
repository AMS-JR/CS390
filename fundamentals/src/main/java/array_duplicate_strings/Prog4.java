package array_duplicate_strings;

import java.util.Arrays;

public class Prog4 {
    public static void main(String[] args){
        String [] inputArray = {"horse", "dog", "horse", "dog", "cat", "cow","goat","goat"};
        String [] result = new String[0];

        for (String string : inputArray) {
            boolean notDuplicate = true;
            for (String s : result) {
                if (string.equals(s)) {
                    notDuplicate = false;
                    break;
                }
            }
            if (notDuplicate) {
                result = Arrays.copyOf(result, (result.length + 1));
                result[result.length - 1] = string;
            }
        }
        System.out.println(Arrays.toString(result));
    }

}
