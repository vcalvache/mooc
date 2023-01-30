
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        /*
        Write a program that reads two integers from the user and prints the square root of the sum of these integers.
        The program does not need to work with negative values.

        You can calculate the square root of an integer with the command Math.sqrt like this:

        int number = 42;
        double squareRoot = Math.sqrt(number);
        System.out.println(squareRoot);
        Here are a few examples:

        Sample output
        1
        0
        1

        Sample output
        5
        4
        3

        Sample output
        1
        35
        6
        */
        Scanner scanner = new Scanner(System.in);
        int firstNumberGIven = Integer.valueOf(scanner.nextLine());
        int seconndNUmberGiven = Integer.valueOf(scanner.nextLine());
        Double squareRoot = Math.sqrt(firstNumberGIven+seconndNUmberGiven);
        System.out.println(squareRoot);

    }
}
