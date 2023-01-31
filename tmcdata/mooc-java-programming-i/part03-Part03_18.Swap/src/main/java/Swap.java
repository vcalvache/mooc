
import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        /*
        The exercise template already contains a program, that creates an array and prints the values of the array twice.
        Modify the program to do following:
        After the first printing, the program should ask for two indices from the user.
        The values in these two indices should be swapped, and in the end the values of the array should be printed once again.

        Sample output
        1
        3
        5
        7
        9

        Give two indices to swap:
        2
        4

        1
        3
        9
        7
5
        */
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 3;
        array[2] = 5;
        array[3] = 7;
        array[4] = 9;

        int index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
        System.out.println("");

        System.out.println("Give two indices to swap:");
        int firstGivenIndex = Integer.valueOf(scanner.nextLine());
        int secondGivenIndex = Integer.valueOf(scanner.nextLine());

        // Implement here
        // asking for the two indices
        // and then swapping them

        int toSwap = array[firstGivenIndex];
        array[firstGivenIndex] = array[secondGivenIndex];
        array[secondGivenIndex] = toSwap; 

        System.out.println("");
        index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
    }

}
