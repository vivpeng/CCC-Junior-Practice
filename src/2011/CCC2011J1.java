/*
Vivian Peng
08/10/2022
CCC 2011 Junior Q1 "Which Alien?"
*/

import java.util.Scanner;

public class CCC2011J1 {
    public static void main(String[] args) {
        //Problem J1: Which Alien? of CCC 2011
        Scanner scanner =  new Scanner(System.in);

        System.out.println("How many antennas?");
        int numAntennas = scanner.nextInt();

        System.out.println("How many eyes?");
        int numEyes = scanner.nextInt();

        if (numAntennas >= 3 && numEyes <= 4)
            System.out.println("TroyMartian");
        if (numAntennas <= 6 && numEyes >= 2)
            System.out.println("VladSaturnian");
        if (numAntennas <= 2 && numEyes <= 3)
            System.out.println("GraemeMercurian");
    }
}
