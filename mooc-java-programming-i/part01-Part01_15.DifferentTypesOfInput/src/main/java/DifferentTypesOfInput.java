
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String textInput = scan.nextLine();
        System.out.println("Give an integer:");
        int numberInput = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double decimalInput = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean boolInput = Boolean.valueOf(scan.nextLine());
        System.out.println("You gave the string " + textInput);
        System.out.println("You gave the integer " + numberInput);
        System.out.println("You gave the double " + decimalInput);
        System.out.println("You gave the boolean " + boolInput);
    }
}