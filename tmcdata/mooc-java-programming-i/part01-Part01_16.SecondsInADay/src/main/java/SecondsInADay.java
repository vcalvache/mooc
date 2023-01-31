
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {

        /*
        In the exercise template, implement a program that asks the user for the number of days.
        After that, the program prints the number of seconds in the given number of days.

        Examples of expected output:

        Sample output
        How many days would you like to convert to seconds?
        user input: 1
        86400
        
         */
        Scanner input = new Scanner(System.in);

        // Write your program here
        System.out.println("How many days would you like to convert to seconds?");
        int days = Integer.valueOf(input.nextLine());
        int seconds = ((days * 24) * 60) * 60;
        System.out.println(seconds);


    }
}
