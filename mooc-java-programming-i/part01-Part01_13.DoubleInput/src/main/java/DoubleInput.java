
import java.util.Scanner;

public class DoubleInput {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // write your program here
        System.out.println("Give a number:");
        double doubleGiven = Double.valueOf(input.nextLine());
        System.out.println("You gave the number " + doubleGiven);


    }
}