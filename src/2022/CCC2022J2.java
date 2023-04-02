/*
Vivian Peng
14/02/2023
CCC Junior 2022 Q2 "Fergusonball Ratings"
 */
import java.util.Scanner;
public class CCC2022J2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int numPlayers = scanner.nextInt();
        int numGold = 0;

        for(int i = 0; i < numPlayers; i++){
            int points = scanner.nextInt();
            int fouls = scanner.nextInt();

            if(points*5 - fouls*3 > 40)
                numGold++;
        }

        System.out.print(numGold);
        if(numGold == numPlayers)
            System.out.print("+");

    }
}
