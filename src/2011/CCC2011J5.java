/*
Vivian Peng
08/10/2022
CCC 2011 Junior Q5 "Unfriend"
*/

import java.util.ArrayList;
import java.util.Scanner;

public class CCC2011J5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int numPpl = scanner.nextInt();

        ArrayList<Integer> ppl = new ArrayList<>();

        for(int i = 0; i < numPpl; i ++)
            ppl.add(scanner.nextInt());

        System.out.print(mthd(ppl));
    }

    public static int mthd(ArrayList<Integer> ppl){
        if(ppl.size() == 0) //edge
            return 0;

        int leaf = 1;

        int sum =0;

        while (leaf <= ppl.size()){

            for (int i = 0; i < ppl.get(i); i++) { //going thru array searching for occurrence of this leaf
                if (ppl.get(i) == leaf) //leaf node is the one with NO children, therefore, its number does NOT appear AT ALL
                    leaf++; //changing leaf

            }
            ppl.remove(leaf - 1); //remove that one leaf node

            sum += mthd(ppl);

            leaf ++;
        }
        return sum;
    }
}
