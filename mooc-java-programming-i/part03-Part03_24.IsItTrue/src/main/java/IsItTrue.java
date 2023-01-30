
import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        /*
        Write a program that asks the user for a string.
        If the user writes the string "true", the program prints "You got it right!", otherwise it prints "Try again!".

        Sample output
        Give a string: true
        You got it right!

        Sample output
        Give a string: trueish
        Try again!
        */

        Scanner reader = new Scanner(System.in);

        System.out.print("Give a string: ");
        String givenSting = reader.nextLine();
        if ( givenSting.equals("true")){
            System.out.println("You got ir right!");
        } else {
            System.out.println("Try again!");
        }
    }
}
