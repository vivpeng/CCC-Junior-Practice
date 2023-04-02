/*
Vivian Peng
08/10/2022
CCC 2011 Junior Q4 "Boring Business"
*/

import java.util.Scanner;

public class CCC2011J4 {
    public static void main(String[] args){
        //Problem J4: Boring Business
        Scanner scanner =  new Scanner(System.in);

        boolean[][] wellPlan = new boolean[401][201]; //array length max 401 (-200 to 200 inclusive), array height max 201 (0 to 200 inclusive)

        int positionX = -1, positionY = -5;
        boolean isSafe = true;

        wellPlan[200][199] = true;
        wellPlan[200][198] = true;
        wellPlan[200][197] = true;
        wellPlan[201][197] = true;
        wellPlan[202][197] = true;
        wellPlan[203][197] = true;
        wellPlan[203][196] = true;
        wellPlan[203][195] = true;
        wellPlan[204][195] = true;
        wellPlan[205][195] = true;
        wellPlan[205][196] = true;
        wellPlan[205][197] = true;
        wellPlan[206][197] = true;
        wellPlan[207][197] = true;
        wellPlan[207][196] = true;
        wellPlan[207][195] = true;
        wellPlan[207][194] = true;
        wellPlan[207][193] = true;
        wellPlan[206][193] = true;
        wellPlan[205][193] = true;
        wellPlan[204][193] = true;
        wellPlan[203][193] = true;
        wellPlan[202][193] = true;
        wellPlan[201][193] = true;
        wellPlan[200][193] = true;
        wellPlan[199][193] = true;
        wellPlan[199][194] = true;
        wellPlan[199][195] = true;

        while (isSafe) {
            String nextCommand = scanner.next();
            int lenCommand = scanner.nextInt();

            if (nextCommand.equals("d")) {
                positionY -= lenCommand;
                for(int i = 0; i < lenCommand; i++) { //for loop for the trail
                    if (wellPlan[positionX + 200][positionY + 200 + i]) //+200 because that is the position it would be in arr
                        isSafe = false;
                    wellPlan[positionX + 200][positionY + 200 + i] = true; //so now this index has been drilled in
                }
            }
            else if (nextCommand.equals("u")) {
                positionY += lenCommand;
                for(int i = 0; i < lenCommand; i++) { //for loop for the trail
                    if (wellPlan[positionX + 200][positionY + 200 - i]) //+200 because that is the position it would be in arr
                        isSafe = false;
                    wellPlan[positionX + 200][positionY + 200 - i] = true; //so now this index has been drilled in
                }
            }
            else if (nextCommand.equals("l")) {
                positionX -= lenCommand;
                for(int i = 0; i < lenCommand; i++) { //for loop for the trail
                    if (wellPlan[positionX + 200 + i][positionY + 200]) //+200 because that is the position it would be in arr
                        isSafe = false;
                    wellPlan[positionX + 200 + i][positionY + 200] = true; //so now this index has been drilled in
                }
            }
            else if (nextCommand.equals("r")) {
                positionX += lenCommand;
                for(int i = 0; i < lenCommand; i++) { //for loop for the trail
                    if (wellPlan[positionX + 200 - i][positionY + 200]) //+200 because that is the position it would be in arr
                        isSafe = false;
                    wellPlan[positionX + 200 - i][positionY + 200] = true; //so now this index has been drilled in
                }
            }
            else
                break;

            System.out.print(positionX + " ");
            System.out.print(positionY + " ");
            if (isSafe)
                System.out.println("safe");
            else {
                System.out.println("DANGER");
                break;
            }
        }
    }
}