
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int negativeNumbersCounter = 0;
        while (true) {
            System.out.println("Give a number:");
            int givenNumber = Integer.valueOf(scanner.nextLine());
            if (givenNumber == 0){
                break;
            } else if (givenNumber < 0){
                negativeNumbersCounter++;
            }
        }

        System.out.println("Number of negative numbers: " + negativeNumbersCounter);
    }
}