
import java.util.Scanner;

public class Positivity {

    public static void main(String[] args) {

        /*
        Write a program that prompts the user for an integer and informs the user whether or not it is positive (greater than zero).

        Sample output
        Give a number:
        5
        The number is positive.

        Sample output
        Give a number:
        -2
        The number is not positive.
        */
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a number:");
        int givenNumber = Integer.valueOf(scan.nextLine());
        if (givenNumber <= 0){
            System.out.println("The number is not positive.");
        } else {
            System.out.println("The number is positive.");
        }
    }
}
