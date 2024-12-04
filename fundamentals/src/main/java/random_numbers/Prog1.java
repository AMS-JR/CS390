package random_numbers;

import java.util.random.RandomGenerator;

public class Prog1 {
    public static void main(String[] args) {
        RandomGenerator rand = RandomGenerator.getDefault();
        // Generate a random integer between 1 and 9(inclusive) and calculate the power of PI to that number.
        int x = rand.nextInt(1,10);
        // Generate a random integer between 3 and 14(inclusive) and calculate the power of that number to PI.
        int y = rand.nextInt(3,15);
        System.out.println("Random integer in range 1 .. 9: " + x);
        System.out.printf("π^x: %.2f%n", Math.pow(Math.PI, x));

        System.out.println("Random integer in range 3 .. 14: " + y);
        System.out.printf("y^π: %.2f%n", Math.pow(y, Math.PI));

    }
}
