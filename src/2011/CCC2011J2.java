/*
Vivian Peng
08/10/2022
CCC 2011 Junior Q2 "Who Has Seen The Wind"
*/

import java.util.Scanner;

public class CCC2011J2 {
    public static void main(String[] args) {
        //Problem J2: Who Has Seen The Wind
        //A = -6t^4 + ht^3 + 2t^2 + t
        Scanner scanner = new Scanner(System.in);

        int humidity = scanner.nextInt();
        int maxHours = scanner.nextInt();
        boolean touchedGround = false;

        for (int t = 1; t <= maxHours; t++) {
            double altitude = -6 * Math.pow(t, 4) + humidity * Math.pow(t, 3) + 2 * t * t + t;
            if (altitude <= 0) {
                touchedGround = true;
                System.out.println("The balloon first touches ground at hour:\n" + t);
                break;
            }
        }
        if (!touchedGround)
            System.out.print("The balloon does not touch ground in the given time.");
    }
}
