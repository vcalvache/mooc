
import java.net.SocketTimeoutException;
import java.util.Scanner;

public class Story {

    public static void main(String[] args) {

        /*
        NB! The example output might align wrong on narrow displays. If you're using only a limited portion of the browser window,
        or your display is otherwise very narrow, try to stretch the display horizontally to see if the text aligns differently.
        The exercise expects the text to align as it does on wider displays.

        Write a program that asks the user for a character's name and their job. The program then prints a short story.

        The output must be as shown below — note, the name and job depend on the user's input.

        Program's output:

            I will tell you a story, but I need some information first.
            What is the main character called?
            user input: Bob
            What is their job?
            user input: a builder
            Here is the story:
            Once upon a time there was Bob, who was a builder.
            On the way to work, Bob reflected on life.
            Perhaps Bob will not be a builder forever.
         */
        Scanner input = new Scanner(System.in);

        // Write your program here
        System.out.println("I will tell you a story, but I need some information first.");
        System.out.println("What is the main character called?");
        String characterName = input.nextLine();
        System.out.println("What is their job?");
        String characterJob = input.nextLine();
        System.out.println("Here is the story:");
        System.out.println("Once upon a time there was " + characterName +", who was " + characterJob +".");
        System.out.println("On the way to work, " + characterName + " reflected on life.");
        System.out.println("Perhaps " + characterName + " will not be " + characterJob + " forever.");

    }
}
