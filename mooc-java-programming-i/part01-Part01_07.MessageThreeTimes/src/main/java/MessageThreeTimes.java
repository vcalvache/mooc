
import java.util.Scanner;

public class MessageThreeTimes {

    public static void main(String[] args) {

        /*
        Write a program that asks the user to write a string. When the user has given a string (that is, written some text and pressed enter),
        the program must print the user's string three times (you can use the System.out.println command multiple times).

        The exercise template already includes the code that creates the Scanner tool.
        */

        Scanner input = new Scanner(System.in);
   
        System.out.println("Write a message:");
        // Write your program here
        String text = input.nextLine();
        
        System.out.println(text);
        System.out.println(text);
        System.out.println(text);
    }
}
