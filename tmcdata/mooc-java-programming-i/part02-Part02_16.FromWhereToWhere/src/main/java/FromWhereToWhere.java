
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        /*
        This exercise is the first two-part exercise. When you complete both parts, you will get two exercise points.
        You can also submit the exercise after completing only the first part.

        Where to
        Write a program which prints the integers from 1 to a number given by the user.

        Sample output
        Where to? 3
        1
        2
        3

        Sample output
        Where to? 5
        1
        2
        3
        4
        5

        hint the number read from the user is now the upper limit of the condition. Remember that in Java a <= b means a is smaller or equal to b.

        Where from
        Ask the user for the starting point as well.

        Sample output
        Where to? 8
        Where from? 5
        5
        6
        7
        8

        If the upper limit is smaller than the starting point, nothing is printed:

        Sample output
        Where to? 12
        Where from? 16
        */
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.print("Where to? ");
        int givenEnd = Integer.valueOf(scanner.nextLine());
        System.out.print("Where from? ");
        int givenStart = Integer.valueOf(scanner.nextLine());

        while (givenStart <= givenEnd){
            System.out.println(givenStart);
            givenStart++;
        }
    }
}
