/*
Vivian Peng
01/28/2023
CCC 2012 Junior Q3 "Icon Scaling"
*/
import java.util.Scanner;

public class CCC2012J3 {
    public static void main(String[] args) {
        //CCC '12 J3 - Icon Scaling
        Scanner scanner = new Scanner(System.in);

        int k = scanner.nextInt();

        char[][] icon = {
                {'*', 'x', '*'},
                {' ', 'x', 'x'},
                {'*', ' ', '*'}
        };

        for (int i = 0; i < icon.length; i++) {
            for (int b = 0; b < k; b++) {
                for (int j = 0; j < icon[0].length; j++) {
                    for (int a = 0; a < k; a++)
                        System.out.print(icon[i][j]);
                }
                if (b != k - 1)
                    System.out.print("\n");
            }
            System.out.print("\n");
        }
    }
}
