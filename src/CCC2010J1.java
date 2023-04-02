import java.util.Scanner;

public class CCC2010J1 {
    //CCC '10 J1 - What is n, Daddy?
    public static void main(String[]args){
        int n, i, numOfAnswers = 0;

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        if (n <= 5) //if it can be held up on just one hand, +1
            numOfAnswers ++;

        for (i = 1; i <= n/2; i++) //ways it can be held up on both hands
            if (n - i <= 5)
                numOfAnswers ++;

        System.out.print(numOfAnswers);
    }
}
