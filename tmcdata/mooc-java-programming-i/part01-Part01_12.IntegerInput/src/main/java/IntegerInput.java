
import java.util.Scanner;

public class IntegerInput {

    public static void main(String[] args) {

        /*
        Write a program that asks the user for a value. The program should then print the value provided by the user.

        Here's a couple of examples:

        Sample output
        Give a number:
        user input: 3
        You gave the number 3

        Sample output
        Give a number:
        user input: 42
        You gave the number 42
        
        */
        Scanner input = new Scanner(System.in);

        // write your program here
        System.out.println("Give a number:");
        int givenNumber = Integer.valueOf(input.nextLine());
        System.out.println("You gave the number " + givenNumber);
    }
}
