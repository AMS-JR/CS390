package primitive_types;

public class Prog2 {

    public static void main(String [] args){
        float f1 = 1.27f;
        float f2 = 3.881f;
        float f3 = 9.6f;
        int sum = (int)(f1+f2+f3);
        System.out.println(sum);

        int roundSum = Math.round(f1+f2+f3);
        System.out.println(roundSum);

    }
}
