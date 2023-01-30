
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        /*
        In the exercise template there is a program that reads inputs from the user until an empty string is entered.
        Add the following functionality to it: after reading the inputs one more string is requested from the user.
        The program then tell whether that string was found in the list or not.

        Sample output
        Tom
        Emma
        Alex
        Mary

        Search for? Mary
        Mary was found!

        Sample output
        Tom
        Emma
        Alex
        Mary

        Search for? Logan
        Logan was not found!
        */
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        System.out.println("Search for? ");
        String toFind = scanner.nextLine();

        if (list.contains(toFind)){
            System.out.println(toFind + " was found!");
        } else {
            System.out.println(toFind + " was not found!");
        }

    }
}
