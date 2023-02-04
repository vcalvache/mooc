
import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class BooleanInput {

    public static void main(String[] args) {

        /*
        Write a program that asks the user for a boolean value. The program should then print the value provided by the user.

        Example prints for the program can be seen below.

        Sample output
        Write something:
        santa does not exist
        True or false? false

        Sample output
        Write something:
        TRUE
        True or false? true
         */

        Scanner input = new Scanner(System.in);

        // write your program here
        System.out.println("Write something:");
        boolean text = Boolean.valueOf(input.nextLine());
        System.out.println("True or false? " + text);

    }
}
