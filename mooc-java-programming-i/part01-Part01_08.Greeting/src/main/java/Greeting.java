
import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Write your program here
        System.out.println("What's your name?");
        String name = input.nextLine();
        System.out.println("Hi " + name);

    }
}