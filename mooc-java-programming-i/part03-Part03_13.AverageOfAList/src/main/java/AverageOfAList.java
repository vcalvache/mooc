
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.

        while (true){
            int givenNumber = Integer.valueOf(scanner.nextLine());
            if (givenNumber == -1){
                break;
            } else {
                numbers.add(givenNumber);
            }
        }
        double sum = 0;
        for (int number: numbers){
            sum += number;
        }
        System.out.println("Average: " + sum/numbers.size());
    }
}