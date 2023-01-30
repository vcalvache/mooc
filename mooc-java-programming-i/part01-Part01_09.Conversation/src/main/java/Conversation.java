
import java.util.Scanner;

public class Conversation {

    public static void main(String[] args) {

        /*
        Write a program that works as follows:

        Sample output
            Greetings! How are you doing?
            user input: Good thank you!
            Oh, how interesting. Tell me more!
            user input: Well, there's really nothing to tell.
            Thanks for sharing!

        Sample output
            Greetings! How are you doing?
            user input: Nice and dandy like cotton candy!
            Oh, how interesting. Tell me more!
            user input: Just went shopping.
            Thanks for sharing!
        user input doesn't has to be printed.
         */
        Scanner input = new Scanner(System.in);

        // Write your program here

        System.out.println("Greetings! How are you doing?");
        String firstAnswer = input.nextLine();
        System.out.println("Oh, how interesting. Tell me more!");
        String secondAnswer = input.nextLine();
        System.out.println("Thanks for sharing!");

    }
}
