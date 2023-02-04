
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        /*
        Write a program that prompts the user to input their age and checks whether or not it is possible (at least 0 and at most 120). Only use a single if-command in your program.

        Sample output
        How old are you? 10
        OK

        Sample output
        How old are you? 55
        OK

        Sample output
        How old are you? -3
        Impossible!

        Sample output
        How old are you? 150
        Impossible!
        */
        Scanner scan = new Scanner(System.in);

        System.out.println("How old are you?");
        int ageGiven = Integer.valueOf(scan.nextLine());
        if (ageGiven >= 0 && ageGiven <121){
            System.out.println("OK");
        } else {
            System.out.println("Impossible!");
        } 
    }
}
