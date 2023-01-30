
import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {

        /*
        Write a program that prompts the user for their name with the message "What's your name?".
        When the user has written their name, the program has to print "Hi " followed by the user's name.

        The exercise template already includes the code that creates the Scanner tool.
        */
        Scanner input = new Scanner(System.in);

        // Write your program here
        System.out.println("What's your name?");
        String name = input.nextLine();
        System.out.println("Hi " + name);

    }
}
