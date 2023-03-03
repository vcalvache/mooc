
import java.nio.file.FileStore;
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstGivenNumber = Integer.valueOf(scanner.nextLine());
        int secondGivenNumber = Integer.valueOf(scanner.nextLine());

        if (firstGivenNumber == secondGivenNumber){
            System.out.println(firstGivenNumber + " is equal to " + secondGivenNumber);
        } else if (firstGivenNumber > secondGivenNumber){
            System.out.println(firstGivenNumber + " is greater than " + secondGivenNumber);
        } else {
            System.out.println(firstGivenNumber + " is smaller than " + secondGivenNumber);
        }
    }
}