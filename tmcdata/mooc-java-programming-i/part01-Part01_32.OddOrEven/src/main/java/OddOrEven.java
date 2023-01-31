
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {

        /*
        Write a program that prompts the user for a number and informs us whether it is even or odd.

        Sample output
        Give a number:
        2
        Number 2 is even.

        Sample output
        Give a number:
        7
        Number 7 is odd. 
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a number:");
        int givenNumber = Integer.valueOf(scan.nextLine());
        if (givenNumber % 2 == 0){
            System.out.println("Number " + givenNumber + " is even.");
        } else {
            System.out.println("Number " + givenNumber + " is odd.");
        }

        // Write your program here 
        // HINT:
        // You can find out if a number is even or odd easily using the modulo operator %
        // Try the following commands to see what they print
        // System.out.println( 1%2 );
        // System.out.println( 2%2 );
        // System.out.println( 3%2 );
        // System.out.println( 4%2 );
        // System.out.println( 5%2 );
        // System.out.println( 6%2 );
        // System.out.println( 7%2 );
        // int luku = 8
        // System.out.println( luku%2 );
        // So, by taking the modulo of a number and two you can find out if it is even or odd !
    }
}
