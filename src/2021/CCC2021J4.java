/*
Vivian Peng
12/02/2023
CCC 2021 Junior Q4 "Arranging Books"
 */

//DOESN'T WORK!!! EG. LMLMLM

import java.util.Scanner;

public class CCC2021J4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String books = scanner.nextLine();
        char[] booksArr = new char[books.length()];

        for(int i = 0; i < books.length(); i++)
            booksArr[i] = books.charAt(i); //converting to array

        int curserLeft = 0, curserRight = books.length()-1, numSwaps = 0;

        for(int i = 0; i < booksArr.length; i++){
            if(booksArr[i] == 'S'){

                if(curserRight == i || booksArr[curserRight] == booksArr[i]) {
                    curserRight--;
                    System.out.println("i am moving curserRight +1 to left");
                }
                else {
                    char temp = booksArr[curserRight];
                    System.out.println("i am swapping " + temp + " (curserRight) with " + booksArr[i] + " (letter I am proccesing: ) " + i);
                    booksArr[curserRight] = booksArr[i];
                    booksArr[i] = temp; //swapping i to the end of the not swapped (right curser)
                    curserRight--;
                    numSwaps++;
                }
            }

            else if(booksArr[i] == 'L'){
                if(curserLeft == i || booksArr[curserLeft] == booksArr[i]) { //if the letter being processed has already been swapped
                    curserLeft++;
                    System.out.println("i am moving curserLeft +1 to right");
                }
                else {
                    char temp = booksArr[curserLeft];
                    System.out.println("i am swapping " + temp + " (curserLeft) with " + booksArr[i] + " (letter I am proccesing: ) " + i);

                    booksArr[curserLeft] = booksArr[i];
                    booksArr[i] = temp; //swapping i to the beginning of the not swapped (left curser)
                    curserLeft++;
                    numSwaps++;
                }
            }

            if(curserLeft == curserRight)
                break;
        }

        System.out.print(numSwaps);
    }
}
