/*
Vivian Peng
12/02/2023
CCC 2021 Junior Q5 "Modern Art"
 */

//TIME LIMITED EXCEEDED T-T

import java.util.Scanner;

public class CCC2021J5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int r= scanner.nextInt();
        int c = scanner.nextInt();

        //making & filling array
        char[][] canvas = new char[r][c];

        for(int i = 0; i < r; i ++){
            for(int j = 0; j < c; j++){
                canvas[i][j] = 'B';
            }
        }

        int numBrushes = scanner.nextInt();

        for(int i = 0; i < numBrushes; i++){
            String line = scanner.next();

            int lineNum = scanner.nextInt() -1 ;

            if(line.equals("R")){
                for(int row = 0; row < c; row++){
                    if( canvas[lineNum][row] == 'B')
                        canvas[lineNum][row] = 'G';
                    else
                        canvas[lineNum][row] = 'B';
                }
            }

            else if(line.equals("C")){
                for(int col = 0; col < r; col++){
                    if( canvas[col][lineNum] == 'B')
                        canvas[col][lineNum] = 'G';
                    else
                        canvas[col][lineNum] = 'B';
                }
            }
        }

        //checking num of squares that are GOLD
        int numGold = 0;

        for(int i = 0; i < r; i ++){
            for(int j = 0; j < c; j++){
                if( canvas[i][j] == 'G')
                    numGold ++;
            }
        }

        System.out.print(numGold);

    }
}
