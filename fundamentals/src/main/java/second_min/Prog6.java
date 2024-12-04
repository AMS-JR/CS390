package second_min;

public class Prog6 {

    public static void main(String[] args){

        secondMin(new int[]{4, 2, 36, 0, 44, 32, 1});
        // test case
//        secondMin(new int[]{4, 2, 36, 1, 44, 32, 0});

    }
    public static void secondMin(int[] arrayOfInts){
        int min = arrayOfInts[0];
        int secondMin = arrayOfInts[1];

        for (int n: arrayOfInts){
            if(n<secondMin && n>min){
                secondMin = n;
            }
            else if(n<min){
                secondMin = min;  // update second min if current number is smaller than min
                min = n;
            }
        }
        System.out.println(secondMin);
    }
}
