
import java.util.ArrayList;

public class PrintInRange {

    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit){
        for(int number: numbers){
            if (number >= lowerLimit && number <= upperLimit){
                System.out.println(number);
            }
        }
    }

    public static void main(String[] args) {

        /*
        Create the method public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) in the exercise template.
        The method prints the numbers in the given list whose values are in the range [lowerLimit, upperLimit].
        A few examples of using the method are supplied below.

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        numbers.add(5);
        numbers.add(1);

        System.out.println("The numbers in the range [0, 5]");
        printNumbersInRange(numbers, 0, 5);

        System.out.println("The numbers in the range [3, 10]");
        printNumbersInRange(numbers, 3, 10);
        Sample output
        The numbers in the range [0, 5]
        3
        2
        5
        1
        The numbers in the range [3, 10]
        3
        6
        5
        */
        // Try your method here

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        numbers.add(5);
        numbers.add(1);

        System.out.println("The numbers in the range [0, 5]");
        printNumbersInRange(numbers, 0, 5);

        System.out.println("The numbers in the range [3, 10]");
        printNumbersInRange(numbers, 3, 10);
    }
    
}
