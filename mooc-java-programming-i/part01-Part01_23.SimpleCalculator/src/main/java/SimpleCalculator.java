
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        /*
        Write a program that asks the user for two numbers and prints their sum, difference, product, and quotient. Two examples of the execution of the program are given below.

        Sample output
        Give the first number:
        8
        Give the second number:
        2
        8 + 2 = 10
        8 - 2 = 6
        8 * 2 = 16
        8 / 2 = 4.0
        */
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int firstNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int secondNumber = Integer.valueOf(scanner.nextLine());
        System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber+secondNumber));
        System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber-secondNumber));
        System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber*secondNumber));
        System.out.println(firstNumber + " / " + secondNumber + " = " + ((double) firstNumber/secondNumber));

    }
}
