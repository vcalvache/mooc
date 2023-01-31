
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        /*
        Write a program that asks the user for input until the user inputs 0.
        After this, the program prints the average of the numbers.
        The number zero does not need to be counted to the average.
        You may assume that the user inputs at least one number.

        The average of the numbers can be calculated by dividing the sum of numbers with the amount of the numbers

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
        Average of the numbers: 8.5
        */
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sumOfGivenNumbers = 0;

        while (true){
            System.out.println("Give a number:");
            int givenNumber = Integer.valueOf(scanner.nextLine());

            if (givenNumber == 0){
                break;
            } else {
                sumOfGivenNumbers += givenNumber;
                count++;
            }
        }
        System.out.println("Average of the numbers: " + ((double) sumOfGivenNumbers / count));
    }
}
