
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {

        /*
        Write a program that reads user input until an empty line is entered.
        For each non-empty line the program splits the string by spaces and prints the last part of the string.

        Sample output
        one two three four
        four
        this is a very important message
        message

        Tip! You can find out the length of the array like this:

        String[] parts = {"one", "two", "three"};
        System.out.println("Number of parts: " + parts.length);
        Sample output
        Number of parts: 3
        */
        Scanner reader = new Scanner(System.in);
        while (true){
            String givenString = reader.nextLine();
            if (givenString.equals("")){
                break;
            }
            String[] splittedStrings = givenString.split(" ");
            System.out.println(splittedStrings[splittedStrings.length -1]);
        }


    }
}
