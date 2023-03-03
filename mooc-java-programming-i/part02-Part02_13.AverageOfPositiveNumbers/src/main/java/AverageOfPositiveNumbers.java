
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sumPositiveNumbers = 0;
        int countInputs = 0;

        while (true){
            int givenNumber = Integer.valueOf(scanner.nextLine());

            if (givenNumber == 0){
                break;
            } else  if (givenNumber > 0){
                sumPositiveNumbers+= givenNumber;
                countInputs++;
            }

        }
        if (sumPositiveNumbers == 0){
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println((double) sumPositiveNumbers / countInputs);
        }
    }
}