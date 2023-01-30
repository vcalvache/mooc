
import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {
        /*
        Write a program that asks the user for two numbers. After this, the program prints the sum of the numbers given by the user.

        When you ask for multiple numbers, create a separate variable for each:

        // do something with the numbers
        Here's how the program is expected to work:

        Sample output
        Give the first number:
        8
        Give the second number:
        3
        The sum of the numbers is 11
         */
        Scanner input = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int firstNumber = Integer.valueOf(input.nextLine());
        System.out.println("Give the second number:");
        int secondNumber = Integer.valueOf(input.nextLine());
        System.out.println("The sum of the numbers is " + (firstNumber+secondNumber));
    }
}
