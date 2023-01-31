
import java.util.Scanner;

public class DoubleInput {

    public static void main(String[] args) {

        /*
        Write a program that asks the user for a floating-point number using the variable type Double. The program then prints the user's input value.

        Example prints for the program can be seen below:

        Sample output
        Give a number:
        3.14
        You gave the number 3.14

        Sample output
        Give a number:
        2.718
        You gave the number 2.718
         */
        Scanner input = new Scanner(System.in);

        // write your program here
        System.out.println("Give a number:");
        double doubleGiven = Double.valueOf(input.nextLine());
        System.out.println("You gave the number " + doubleGiven);


    }
}
