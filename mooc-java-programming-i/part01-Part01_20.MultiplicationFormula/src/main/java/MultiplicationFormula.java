
import java.util.Scanner;

public class MultiplicationFormula {

    public static void main(String[] args) {
        /*
        Similar to the previous exercise, create a program that multiplies the values stored in two integer variables.

        For instance, if the entered numbers are 2 and 8, the program should print the following:

        Sample output
        Give the first number:
        2
        Give the second number:
        8
        2 * 8 = 16
        */
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int firstNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int secomdNumber = Integer.valueOf(scanner.nextLine());
        System.out.println(firstNumber + " * " + secomdNumber + " = " + (firstNumber*secomdNumber));
    }
}
