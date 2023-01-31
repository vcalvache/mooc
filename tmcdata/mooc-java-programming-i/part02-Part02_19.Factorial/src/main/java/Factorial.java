
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class Factorial {

    public static void main(String[] args) {
        /*
        Implement a program which calculates the factorial of a number given by the user.

        Factorial of n, denoted n!, is calculated as 1 * 2 * 3 * ... * n.
        For example, the factorial of 4 is 24 or 4! = 1 * 2 * 3 * 4 = 24.
        Additionally, it has been specified that the factorial of 0 is 1, so 0! = 1.

        Sample output:

        Sample output
        Give a number: 3
        Factorial: 6

        The internal calculation here was 1 * 2 * 3 = 6

        Sample output
        Give a number: 10
        Factorial: 3628800

        And now the internal calculation was 1 * 2 * 3 * ... * 8 * 9 * 10 = 3628800
        */  

        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a number: ");
        int factorial = 1;
        int givenNumber = Integer.valueOf(scanner.nextLine());
        if (givenNumber == 0){
            System.out.println("Factorial: 1");
        }

        for (int i = 1; i <= givenNumber; i++){
            factorial *= i;
        }
        System.out.println("Factorial: " + factorial);

    }
}
