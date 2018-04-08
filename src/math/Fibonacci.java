package math;

public class Fibonacci {
    //public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
         */

    public static void main(String[] args) {
        int x = 0;
        int y = 1;
        for (int i = 0; i < 40; i++) {
            System.out.println(x);
            x = x + y;
            y = x - y;
        }

    }
}



