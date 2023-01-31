
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        /*
        Write a program that reads user input until an empty line is entered.
        For each non-empty line the program splits the string by spaces and prints the first part of the string.

        Sample output
        one two three four
        one
        this is a very important message
        this
        */
        Scanner reader = new Scanner(System.in);

        while (true){
            String givenString = reader.nextLine();
            if (givenString.equals("")){
                break;
            }
            String[] splittedString = givenString.split(" ");
            System.out.println(splittedString[0]);
        }
    }
}
