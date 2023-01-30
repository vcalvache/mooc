
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        /*
        Write a program that prompts the user for two strings. If the strings are the same, then the program prints "Same". Otherwise, it prints "Different".

        Sample output
        Enter the first string:
        hello
        Enter the second string:
        hello
        Same

        Sample output
        Enter the first string:
        hello
        Enter the second string:
        world
        Different
        */
        Scanner scan = new Scanner(System.in);

        // Write your program here.
        System.out.println("Enter the first string:");
        String fristStringGiven = scan.nextLine();
        System.out.println("Enter the second string:");
        String secondStringGiven = scan.nextLine();
        if (fristStringGiven.equalsIgnoreCase(secondStringGiven)){
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }
}
