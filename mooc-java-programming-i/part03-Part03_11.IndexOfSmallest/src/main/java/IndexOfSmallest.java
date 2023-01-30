
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {

        /*
        Write a program that reads numbers from the user. When number 9999 is entered, the reading process stops.
        After this the program will print the smallest number in the list, and also the indices where that number is found. Notice: the smallest number can appear multiple times in the list.

        Sample output
        72
        2
        8
        8
        11
        9999

        Smallest number: 2
        Found at index: 1

        Sample output
        72
        44
        8
        8
        11
        9999

        Smallest number: 8
        Found at index: 2
        Found at index: 3
        */
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