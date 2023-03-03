
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sumOfGivenNumbers = 0;

        while (true){
            System.out.println("Give a number:");
            int givenNumber = Integer.valueOf(scanner.nextLine());

            if (givenNumber == 0){
                break;
            } else {
                sumOfGivenNumbers += givenNumber;
                count++;
            }
        }
        System.out.println("Average of the numbers: " + ((double) sumOfGivenNumbers / count));
    }
}