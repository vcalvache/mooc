
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        /*
        A year is a leap year if it is divisible by 4. However, if the year is divisible by 100, then it is a leap year only when it is also divisible by 400.

        Write a program that reads a year from the user, and checks whether or not it is a leap year.

        Sample output
        Give a year: 2011
        The year is not a leap year.

        Sample output
        Give a year: 2012
        The year is a leap year.

        Sample output
        Give a year: 1800
        The year is not a leap year.

        Sample output
        Give a year: 2000
        The year is a leap year.
        */
        Scanner scan = new Scanner(System.in);

        System.out.print("Give a year: ");
        int givenYear = Integer.valueOf(scan.nextLine());
        if (givenYear % 100 == 0){
            if (givenYear % 400 == 0){
                System.out.println("The year is a leap year.");
            } else {
                System.out.println("The year is not a leap year.");
            }
        } else if (givenYear % 4 == 0){
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");
        }
    }
}
