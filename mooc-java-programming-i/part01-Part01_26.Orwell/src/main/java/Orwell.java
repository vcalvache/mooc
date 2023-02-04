
import java.util.Scanner;

public class Orwell {

    public static void main(String[] args) {
        /*
        Write a program that prompts the user for an integer and prints the string "Orwell" if the number is exactly 1984.

        Sample output
        Give a number:
        1983

        Sample output
        Give a number:
        1984
        Orwell
        */
        Scanner scan = new Scanner(System.in);

        // Write your program here

        System.out.println("Give a number:");
        int numberGiven = Integer.valueOf(scan.nextLine());
        if (numberGiven == 1984){
            System.out.println("Orwell");
        }
    }
}
