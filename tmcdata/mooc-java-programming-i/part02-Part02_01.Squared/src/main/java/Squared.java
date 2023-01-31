
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {

        /*
        Write a program that reads an integer from the user and prints the square of the given integer, i.e. the integer multiplied by itself.

        Sample output
        4
        16

        Sample output
        -3
        9

        Sample output
        5
        25        
        */
        Scanner scanner = new Scanner(System.in);

        int numberGiven = Integer.valueOf(scanner.nextLine());
        System.out.println(numberGiven * numberGiven);
    }
}
