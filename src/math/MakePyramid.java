package math;

public class MakePyramid {
    public static void main(String[] args) {

        //   Implement a large Pyramid of stars in the screen with java.
        //
        //                    *
        //                   * *
        //                  * * *
        //                 * * * *
        //                * * * * *
        //               * * * * * *

        //Start Here

        int x = 55;

        for(int i=0; i<x; i++) {

            for(int j=0; j<x-i; j++) {

                System.out.print(" ");
            }

            for(int k=0; k<=i; k++) {

                System.out.print("* ");

            }
            System.out.println();

        }

    }
}



