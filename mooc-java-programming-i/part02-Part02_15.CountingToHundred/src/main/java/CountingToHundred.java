
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        /*
        Write a program, which reads an integer from the user.
        Then the program prints numbers from that number to 100.
        You can assume that the user always gives a number less than 100. Below are some examples of the expected functionality.

        Sample output
        99
        99
        100

        Sample output
        -4
        -4
        -3
        -2
        -1
        0
        1
        2
        ... (many numbers in between) ...
        98
        99
        100
        */
        Scanner scanner = new Scanner(System.in);

        int givenNumber = Integer.valueOf(scanner.nextLine());

        for (int i = 0; givenNumber <= 100; givenNumber++){
            System.out.println(givenNumber);
        }
    }
}
