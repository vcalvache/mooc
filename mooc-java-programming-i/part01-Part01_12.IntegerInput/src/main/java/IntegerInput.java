
import java.util.Scanner;

public class IntegerInput {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // write your program here
        System.out.println("Give a number:");
        int givenNumber = Integer.valueOf(input.nextLine());
        System.out.println("You gave the number " + givenNumber);
    }
}