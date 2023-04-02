/*
Vivian Peng
14/02/2023
CCC 2022 Junior Q1 "Cupcake Party"
 */
import java.util.Scanner;
public class CCC2022J1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int r = scanner.nextInt(); //8
        int s = scanner.nextInt(); //3

        int numLeft = r * 8 + s * 3 - 28;

        if (numLeft < 0)
            numLeft = 0;

        System.out.print(numLeft);
    }
}
