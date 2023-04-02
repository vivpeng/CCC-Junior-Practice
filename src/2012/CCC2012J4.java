/*
Vivian Peng
01/28/2023
CCC 2012 Junior Q4 "Big Bang Secrets"
*/

import java.util.Scanner;
public class CCC2012J4 {
    public static void main(String[] args) {
        //CCC '12 J4 - Big Bang Secrets
        Scanner scanner = new Scanner(System.in);

        int k2 = scanner.nextInt();
        scanner.nextLine();
        String word = scanner.nextLine();
        int index = 0, newIndex;
        String decoded = "";
        int shift;
        char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
                'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
                'U', 'V', 'W', 'X', 'Y', 'Z'
        };

        for (int i = 1; i <= word.length(); i++) {
            shift = 3 * i + k2;

            for (int j = 0; j < alphabet.length; j++) {
                if (alphabet[j] == word.charAt(i - 1))
                    index = j;
            }

            newIndex = index - shift;

            if (newIndex < 0)
                newIndex = newIndex + alphabet.length;

            decoded += alphabet[newIndex];
        }

        System.out.println(decoded);
    }
}
