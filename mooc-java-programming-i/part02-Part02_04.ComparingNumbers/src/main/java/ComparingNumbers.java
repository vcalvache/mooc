
import java.nio.file.FileStore;
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        /*
        Write a program that reads two integers from the user. If the first number is greater than the second,
        the program prints "(first) is greater than (second)." If the first number is less than the second,
        the program prints "(first) is smaller than (second)." Otherwise, the program prints "(first) is equal to (second)."
        The (first) and (second) should always be replaced with the actual numbers that were provided by the user.

        A few examples of the expected behaviour:

        Sample output
        8
        4
        8 is greater than 4.

        Sample output
        -3
        5
        -3 is smaller than 5.

        Sample output
        1
        1
        1 is equal to 1.
         */
        Scanner scanner = new Scanner(System.in);

        int firstGivenNumber = Integer.valueOf(scanner.nextLine());
        int secondGivenNumber = Integer.valueOf(scanner.nextLine());

        if (firstGivenNumber == secondGivenNumber){
            System.out.println(firstGivenNumber + " is equal to " + secondGivenNumber);
        } else if (firstGivenNumber > secondGivenNumber){
            System.out.println(firstGivenNumber + " is greater than " + secondGivenNumber);
        } else {
            System.out.println(firstGivenNumber + " is smaller than " + secondGivenNumber);
        }
    }
}
