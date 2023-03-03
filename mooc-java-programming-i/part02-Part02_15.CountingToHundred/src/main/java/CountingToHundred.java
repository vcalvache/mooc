
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int givenNumber = Integer.valueOf(scanner.nextLine());

        for (int i = 0; givenNumber <= 100; givenNumber++){
            System.out.println(givenNumber);
        }
    }
}