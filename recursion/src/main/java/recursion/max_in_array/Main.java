package recursion.max_in_array;

public class Main {
    public static void main(String[] args) {
        System.out.println("Max: " + getMaxValue(new int[]{ 5, -3, 6, 1, 9, 4 }));
    }
    public static int getMaxValue(int[] arr){
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        return getMaxValue(arr, 0);
    }
    /**
     * Recursion to return the Max value from a given array
     * problem 5
     * @param arr
     * @return int
     */
    private static int getMaxValue(int[] arr, int index){
        if (index == arr.length - 1) { // Base case: last element
            return arr[index];
        }

        int maxOfRemaining = getMaxValue(arr, index + 1); // Recursive call
        return Math.max(arr[index], maxOfRemaining);
    }
}
