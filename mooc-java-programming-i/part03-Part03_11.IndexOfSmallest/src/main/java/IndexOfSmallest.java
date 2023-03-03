
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> listOfNumbers = new ArrayList<>();

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        while (true){
            int givenNumber = Integer.valueOf(scanner.nextLine());
            if (givenNumber == 9999){
                break;
            } else {
                listOfNumbers.add(givenNumber);
            }

        }
        int smallestNumber = listOfNumbers.get(0);

        for (int i = 0; i < listOfNumbers.size(); i++){
            if (listOfNumbers.get(i) <  smallestNumber){
                smallestNumber = listOfNumbers.get(i);
            }
        }
        System.out.print("Smallest number: " + smallestNumber);
        for (int i = 0; i < listOfNumbers.size(); i++){
            if (listOfNumbers.get(i) == smallestNumber){
                System.out.print("Found at index: " + i);
            }
        }
    }
}