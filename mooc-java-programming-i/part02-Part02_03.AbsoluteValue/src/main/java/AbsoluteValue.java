
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        /*
        Write a program that reads an integer from the user. If the number is less than 0, the program prints the given integer multiplied by -1.
        In all other cases, the program prints the number itself. A few examples of how the program's expected to function are shown below:

        Sample output
        -3
        3

        Sample output
        2
        2

        Sample output
        -5
        5
         */
        Scanner scanner = new Scanner(System.in);

        int givenNumber = Integer.valueOf(scanner.nextLine());

        if (givenNumber < 0){
            System.out.println(givenNumber * -1);
        } else {
            System.out.println(givenNumber);
        }
    }
}
