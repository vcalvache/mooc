
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        /*
        Write a program that reads values from the user until they input a 0.
        After this, the program prints the total number of inputted values.
        The zero that's used to exit the loop should not be included in the total number count.

        Example output of the program:

        Sample output
        Give a number:
        5
        Give a number:
        22
        Give a number:
        9
        Give a number:
        -2
        Give a number:
        0
        Number of numbers: 4
        */
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        
        while (true){
            System.out.println("Give a number:");
            int numberGiven = Integer.valueOf(scanner.nextLine());

            if (numberGiven == 0) {
                break;
            } else {
                count++;
            }
        }
        System.out.println("Number of numbers: " + count);
    }
}
