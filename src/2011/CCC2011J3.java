/*
Vivian Peng
08/10/2022
CCC 2011 Junior Q3 "Sumac Sequences"
*/

import java.util.Scanner;

public class CCC2011J3 {
    public static void main(String[] args) {
        //Problem J3: Sumac Sequences
        Scanner scanner = new Scanner(System.in);

        int t1 = scanner.nextInt(); //the one being subtracted by
        int t2 = scanner.nextInt();
        int difference = t1 - t2;
        int length = 3; //for the 3 terms already in program

        while (difference <= t2) {
            t1 = t2;
            t2 = difference;
            difference = t1 - t2;
            length++;
        }
        System.out.println(length);
    }
}
