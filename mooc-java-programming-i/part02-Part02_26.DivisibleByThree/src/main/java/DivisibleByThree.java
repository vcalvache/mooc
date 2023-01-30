import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {

        /*
        Write a method public static void divisibleByThreeInRange(int beginning, int end) that prints all the numbers divisible by three in the given range.
        The numbers are to be printed in order from the smallest to the greatest.

        public static void main(String[] args) {
            divisibleByThreeInRange(3, 6);
        }
        Sample output
        3
        6

        public static void main(String[] args) {
            divisibleByThreeInRange(2, 10);
        }
        Sample output
        3
        6
        9


        */
        Scanner scanner = new Scanner(System.in);
        divisibleByThreeInRange(3, 6);
    }
    
    public static void divisibleByThreeInRange(int beginning, int end) {
        for (int i = beginning; i <= end; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

}

