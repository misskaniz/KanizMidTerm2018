package math;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */

        int f = 5;
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        System.out.println("The factorial of 5 is " + result);

    }

    public static int factorial(int f) {
        if (f == 0) {
            return 1;
        } else {
            return f * factorial(f - 1);
        }

    }
}