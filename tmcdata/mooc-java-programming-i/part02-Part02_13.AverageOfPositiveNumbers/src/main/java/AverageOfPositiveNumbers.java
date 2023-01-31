
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        /*
        Write a program that asks the user for input until the user inputs 0.
        After this, the program prints the average of the positive numbers (numbers that are greater than zero).

        If no positive number is inputted, the program prints "Cannot calculate the average"

        Below a few examples of the programs output

        Sample output
        3
        5
        1
        -3
        0
        3.0

        Sample output
        0
        Cannot calculate the average

        Sample output
        -3
        1
        0
        1.0

        Sample output
        1
        1
        0
        1.0
        */
        Scanner scanner = new Scanner(System.in);
        int sumPositiveNumbers = 0;
        int countInputs = 0;

        while (true){
            int givenNumber = Integer.valueOf(scanner.nextLine());

            if (givenNumber == 0){
                break;
            } else  if (givenNumber > 0){
                sumPositiveNumbers+= givenNumber;
                countInputs++;
            }

        }
        if (sumPositiveNumbers == 0){
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println((double) sumPositiveNumbers / countInputs);
        }
    }
}
