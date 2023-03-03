
import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Give a string: ");
        String givenSting = reader.nextLine();
        if ( givenSting.equals("true")){
            System.out.println("You got ir right!");
        } else {
            System.out.println("Try again!");
        }
    }
}