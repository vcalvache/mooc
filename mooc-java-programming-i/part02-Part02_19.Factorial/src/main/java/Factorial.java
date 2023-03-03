
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class Factorial {

    public static void main(String[] args) {


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