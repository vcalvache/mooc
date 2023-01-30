
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        /*
        Write a program that prompts the user for two integers and prints the larger of the two. If the numbers are the same, then the program informs us about this as well.

        Sample outputs:

        Sample output
        Give the first number:
        5
        Give the second number:
        3
        Greater number is: 5

        Sample output
        Give the first number:
        5
        Give the second number:
        8
        Greater number is: 8

        Sample output
        Give the first number:
        5
        Give the second number:
        5
        The numbers are equal!
        */
        Scanner scan = new Scanner(System.in);

        System.out.println("Give the first number:");
        int firtsNumber = Integer.valueOf(scan.nextLine());
        System.out.println("Give the second number:");
        int secondNumber = Integer.valueOf(scan.nextLine());

        if (firtsNumber == secondNumber){
            System.out.println("The numbers are equal!");
        } else if (firtsNumber > secondNumber){
            System.out.println("Greater number is " + firtsNumber);
        } else {
            System.out.println("Greater number is " + secondNumber);
        }

    }
}
