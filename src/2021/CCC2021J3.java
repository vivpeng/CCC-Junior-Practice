/*
Vivian Peng
11/02/2023
CCC 2021 Junior Q3 "Secret Instructions"
 */

/*
THINGS TO TAKE AWAY:

- trying to convert a char into an int will give the ASCII code!!!
DO Integer.parseInt(code.substring(0,1)) INSTEAD

- % is MODULUS DIVISION which gives the REMAINDER,
/ is DIVISION which ROUNDS if its int division

- DONT FORGET TO RESET VARIABLES IN A LOOP

 */

import java.util.Scanner;
public class CCC2021J3 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        String code, direction = "";
        int sum = 0;
        code = scanner.next();

        while(! code.equals("99999") ){
            sum += Integer.parseInt(code.substring(0,1));
            sum += Integer.parseInt(code.substring(1,2));

            if (sum % 2 != 0 ) //odd
                direction = "left";
            else if (sum % 2 == 0 && sum != 0 ) //even
                direction = "right";

            System.out.println(direction + " "  + code.substring(2, 5));

            sum = 0;
            code = scanner.next();
        }
    }
}
