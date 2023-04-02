/*
Vivian Peng
01/28/2023
CCC 2012 Junior Q1 "Speed fines are not fine!"
*/
import java.util.Scanner;

public class CCC2012J1 {
    public static void main(String[] args) {
        //CCC '12 J1 - Speed fines are not fine!

        Scanner scanner = new Scanner(System.in);
        int speedLimit, speedOfCar, fine;

        speedLimit = scanner.nextInt();
        speedOfCar = scanner.nextInt();

        if (speedOfCar <= speedLimit)
            System.out.println("Congratulations, you are within the speed limit!");
        else {
            if (speedOfCar - speedLimit <= 20)
                fine = 100;
            else if (speedOfCar - speedLimit <= 30)
                fine = 270;
            else
                fine = 500;
            System.out.println("You are speeding and your fine is $" + fine + ".");
        }
    }
}