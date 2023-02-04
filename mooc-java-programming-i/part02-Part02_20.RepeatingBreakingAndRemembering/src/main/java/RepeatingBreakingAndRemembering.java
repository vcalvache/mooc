
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        /*
        Next, we'll implement a program one piece at a time. This is always strongly recommended when coding.

        The series of exercises form a larger program whose functionality is implemented in small pieces.
        If you do not finish the whole series, you can still submit the parts you've completed to be checked.
        This can be done by clicking the "submit" button (the arrow pointing up) to the right of the "test" button.
        Although the submission system complains about the tests of unfinished parts, you get points for the parts you have finished.

        NB: Remember that each sub-part of the series is equivalent to one individual exercise.
        As such, the series is equivalent to five individual exercises.

        Note: the tests might fail a correct solution. This is a known bug that will be fixed in the future.
        In the meantime, you can avoid the error by printing "Give numbers:" without any spaces after ':'

        Part 1: Reading
        Implement a program that asks the user for numbers (the program first prints "Write numbers: ") until the user gives the number -1.
        When the user writes -1, the program prints "Thx! Bye!" and ends.

        Sample output
        Give numbers:
        5
        2
        4
        -1
        Thx! Bye!

        Part 2: Sum of numbers
        Extend the program so that it prints the sum of the numbers (not including the -1) the user has written.

        Sample output
        Give numbers:
        5
        2
        4
        -1
        Thx! Bye!
        Sum: 11

        Part 3:Sum and the number of numbers
        Extend the program so that it also prints the number of numbers (not including the -1) the user has written.

        Sample output
        Give numbers:
        5
        2
        4
        -1
        Thx! Bye!
        Sum: 11
        Numbers: 3

        Part 4: Average of numbers
        Extend the program so that it prints the mean of the numbers (not including the -1) the user has written.

        Sample output
        Give numbers:
        5
        2
        4
        -1
        Thx! Bye!
        Sum: 11
        Numbers: 3
        Average: 3.666666666666

        Part 5: Even and odd numbers
        Extend the program so that it prints the number of even and odd numbers (excluding the -1).

        Sample output
        Give numbers:
        5
        2
        4
        -1
        Thx! Bye!
        Sum: 11
        Numbers: 3
        Average: 3.666666666666
        Even: 2
        Odd: 1
        */
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int even = 0;
        int odd = 0;

        System.out.println("Give numbers:");
        while (true){
            
            int givenNumbers = Integer.valueOf(scanner.nextLine());
            if (givenNumbers == -1) {
                System.out.println("Thx! Bye!");
                break;
            }

            if (givenNumbers % 2 == 0){
                even++;
            } else {
                odd++;
            }
            sum += givenNumbers;
            count++;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + ((double) sum / count));
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
