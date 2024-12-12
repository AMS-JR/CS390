package combine_arrays;

import java.util.Arrays;

public class Prog5 {
    public static void main(String[] args) {
        int[] result = combine(new int[]{5,6,-4,3,1}, new int[]{3,8,9,11});
        System.out.println(Arrays.toString(result));
    }
    public static int[] combine(int[] a, int[] b) {
        int[] combinedArray = new int[a.length+b.length];
        int index = a.length;
        for (int i = 0; i < a.length; i++) {
            combinedArray[i] = a[i];
        }
        for (int i = 0; i < b.length; i++,index++) {
            combinedArray[index] = b[i];
        }
        return combinedArray;
    }
}
