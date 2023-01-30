
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        /*
        Write a program that reads values from the user until they input a 0.
        After this, the program prints the total number of inputted values that are negative.
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
        Number of negative numbers: 1 
        */
        Scanner scanner = new Scanner(System.in);

        int negativeNumbersCounter = 0;
        while (true) {
            System.out.println("Give a number:");
            int givenNumber = Integer.valueOf(scanner.nextLine());
            if (givenNumber == 0){
                break;
            } else if (givenNumber < 0){
                negativeNumbersCounter++;
            }
        }

        System.out.println("Number of negative numbers: " + negativeNumbersCounter);
    }
}
