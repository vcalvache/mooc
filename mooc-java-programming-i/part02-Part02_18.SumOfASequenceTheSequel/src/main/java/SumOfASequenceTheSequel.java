
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        /*
        Implement a program which calculates the sum of a closed interval, and prints it.
        Expect the user to write the smaller number first and then the larger number.

        You can base your solution to this exercise to the solution of last exercise
        — add the functionality for the user to enter the starting point as well.

        Sample output:

        Sample output
        First number? 3
        Last number? 5
        The sum is 12

        The above example internally calculated 3 + 4 + 5 = 12

        Sample output
        First number? 2
        Last number? 8
        The sum is: 35

        And now the internal calculation was 2 + 3 + 4 + 5 + 6 + 7 + 8 = 35
        */
        Scanner scanner = new Scanner(System.in);

        System.out.print("First number? ");
        int firstNumberGiven = Integer.valueOf(scanner.nextLine());
        System.out.print("Last number? ");
        int lastNumberGiven = Integer.valueOf(scanner.nextLine());
        
        int sum = 0;
        for(int i = 0; firstNumberGiven <= lastNumberGiven; firstNumberGiven++){
            sum += firstNumberGiven;
        }
        System.out.println("The sum is " + sum);
    }
}
