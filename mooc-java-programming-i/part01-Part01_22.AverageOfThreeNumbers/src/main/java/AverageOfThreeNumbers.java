
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        /*
        Write a program that asks the user for three integers and prints their average.

        Sample output
        Give the first number:
        8
        Give the second number:
        2
        Give the third number:
        3
        The average is 4.333333333333333
        */
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int firstNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int secondNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        int thirdNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("The average is " + ((double) firstNumber+secondNumber+thirdNumber)/3);
    }
}
