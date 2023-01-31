
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        /*
        Write a program that asks the user for input until the user inputs 0.
        After this the program prints the amount of numbers inputted and the sum of the numbers.
        The number zero does not need to be added to the sum, but adding it does not change the results.

        You need two variables to keep track of the information.
        Use one for keeping track of the numbers inputted and other for keeping track of the sum

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
        Sum of the numbers: 34
        */
        Scanner scanner = new Scanner(System.in);
        int countNumbersGiven = 0;
        int sumNumbersGiven = 0;

        while (true){
            System.out.println("Give a number:");
            int givenNumber = Integer.valueOf(scanner.nextLine());

            if (givenNumber == 0 ){
                break;
            } else {
                countNumbersGiven++;
                sumNumbersGiven += givenNumber;
            }
        }

        System.out.println("Number of numbers: " + countNumbersGiven);
        System.out.println("Sum of the numbers: " + sumNumbersGiven);
    }
}
