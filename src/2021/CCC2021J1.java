/*
Vivian Peng
11/02/2023
CCC 2021 Junior 1 "Boiling Water"
 */
import java.util.Scanner;

public class CCC2021J1 {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int sealevel; //-1 = below, 0 = at, 1 = above
    int b, p;
    b =scanner.nextInt();

    //determining above/below/at sea level
    if(b ==100)
        sealevel =0;
    else if(b > 100)
        sealevel =-1;
    else
        sealevel =1;

    //determining atmospheric pressure
    p =5*b -400;

    System.out.println(p);
    System.out.print(sealevel);
    }
}
