/*
Vivian Peng
01/28/2023
CCC 2012 Junior Q2 "Sounds fishy!"
*/

import java.util.Scanner;

public class CCC2012J2 {
    public static void main(String[] args) {
        //CCC '12 J2 - Sounds fishy!
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[4];

        System.out.println("what are the depth readings? ");

        for (int i = 0; i < 4; i++) {
            arr[i] = scanner.nextInt();
        }

        int a = arr[0];
        int b = arr[1];
        int c = arr[2];
        int d = arr[3];

        if (a == b && b == c && c == d)
            System.out.println("Fish At Constant Depth");
        else if (a < b && b < c && c < d)
            System.out.println("Fish Rising");
        else if (a > b && b > c && c > d)
            System.out.println("Fish Diving");
        else
            System.out.println("No Fish");
    }
}
