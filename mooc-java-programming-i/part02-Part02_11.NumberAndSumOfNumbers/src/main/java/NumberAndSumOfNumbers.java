
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {

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