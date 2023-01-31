
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {

        /*
        The exercise template contains a base that reads numbers from the user and adds them to a list.
        Reading is stopped once the user enters the number -1.

        Continue developing the program so that it finds the greatest number in the list and prints its value after reading all the numbers.
        The programming should work in the following manner.

        Sample output
        72
        2
        8
        93
        11
        -1

        The greatest number: 93 
        */
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        
        System.out.println("");

        // implement finding the greatest number in the list here
        int greatestNumber = list.get(0);

        for (int i = 0; i < list.size(); i++){
            if (greatestNumber < list.get(i)){
                greatestNumber = list.get(i);
            }
        }
        System.out.println("The greatest number: " + greatestNumber);
    }
}
