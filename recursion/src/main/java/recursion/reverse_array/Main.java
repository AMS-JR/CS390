package recursion.reverse_array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Problem 3
        int[] arr = {1, 3, 5, 7, 9, 13};
        reverseArrayElements(arr);
        System.out.println("Reversed Array Elements: " + Arrays.toString(arr));
    }
    /**
     * Returns the reverse of an array using recursion.
     * problem 3
     * @param arr
     */
    public static void reverseArrayElements(int[] arr){
        reverseArrayElements(arr, 0, arr.length-1);
    }

    /**
     * Returns the reverse of an array using recursion
     * @param arr
     * @param beginIndex
     * @param endIndex
     */
    private static void reverseArrayElements(int[] arr, int beginIndex, int endIndex){
        if(beginIndex == endIndex || beginIndex > endIndex) return;
        else{
            int temp = arr[beginIndex];
            arr[beginIndex] = arr[endIndex];
            arr[endIndex] = temp;
            // Recursive call for the next pair of elements.
            reverseArrayElements(arr, beginIndex + 1, endIndex - 1);
        }
    }
}
