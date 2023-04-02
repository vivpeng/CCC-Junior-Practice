/*
Vivian Peng
14/02/2023
CCC 2022 Junior Q3 "Harp Tuning"
 */
import java.util.Scanner;
public class CCC2022J3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String instructions = scanner.nextLine();

        int pastSymbol = 0;
        String inst = "";

        for(int i = 0; i < instructions.length(); i++){
            inst = "";

            if(instructions.charAt(i) == '-') {
                inst += instructions.substring(pastSymbol, i) + " loosen ";
                int j = i+1;
                while((instructions.charAt(j) == '1' || instructions.charAt(j) == '2' || instructions.charAt(j) == '3' || instructions.charAt(j) == '4' || instructions.charAt(j) == '5' || instructions.charAt(j) == '6' || instructions.charAt(j) == '7' || instructions.charAt(j) == '8' || instructions.charAt(j) == '9' || instructions.charAt(j) == '0') && j < instructions.length() -1) {

                    inst += instructions.charAt(j);

                    j++;

                }

                if(j == instructions.length()-1)
                    inst += instructions.charAt(j);


                pastSymbol = j;
                System.out.println(inst);
            }
            else if(instructions.charAt(i) == '+'){
                inst += instructions.substring(pastSymbol, i) + " tighten";
                int j = i+1;

                while((instructions.charAt(j) == '1' || instructions.charAt(j) == '2' || instructions.charAt(j) == '3' || instructions.charAt(j) == '4' || instructions.charAt(j) == '5' || instructions.charAt(j) == '6' || instructions.charAt(j) == '7' || instructions.charAt(j) == '8' || instructions.charAt(j) == '9' || instructions.charAt(j) == '0')  && j < instructions.length() -1) {

                    inst += instructions.charAt(j);

                    j++;
                }

                if(j == instructions.length()-1)
                    inst += instructions.charAt(j);


                pastSymbol = j;
                System.out.println(inst);
            }

        }
    }
}
