
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {

        /*
        Write a program that asks the user for two integers and prints their average.

        Sample output
        Give the first number:
        8
        Give the second number:
        2
        The average is 5.0 
        */
        Scanner scanner = new Scanner(System.in);

        // Write your program here

        System.out.println("Give the first number:");
        int firstNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int secondNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("The average is " + ((double) firstNumber+secondNumber)/2);

    }
}
