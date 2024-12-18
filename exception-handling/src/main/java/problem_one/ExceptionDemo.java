package problem_one;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
* Write your program to get the input of score in the range of 0 to 100 from
* the console. Apply the necessary Exception handling to avoid negative, non
* numbers.
* Handle the following
* • InputMismatchException for the wrong entry of data instead of int value.
* • UnsupportedOperationException for the inputs not in the range of
* 0-100.
*/
public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            try {
                System.out.print("Enter a score (0-100): ");
                int score = scanner.nextInt();

                // Check if the score is within the valid range
                validateScore(score);

                System.out.println("Your score is: " + score);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Clear the invalid input
            } catch (UnsupportedOperationException e) {
                System.out.println(e.getMessage());
            }
        }
        scanner.close();
    }
    // Method to validate the score
    private static void validateScore(int score) {
        if (score < 0 || score > 100) {
            throw new UnsupportedOperationException("Score must be in the range of 0 to 100.");
        }
    }

}