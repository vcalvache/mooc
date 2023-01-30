
import java.util.Scanner;

import javax.xml.transform.Source;

public class Ancient {

    public static void main(String[] args) {
        /*
         Write a program that prompts the user for a year. If the user inputs a number that is smaller than 2015, then the program prints the string "Ancient history!".

        Sample output
        Give a year:
        2017

        Sample output
        Give a year:
        2013
        Ancient history!
        */
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a year:");
        int givenNumber = Integer.valueOf(scan.nextLine());
        if (givenNumber < 2015){
            System.out.println("Ancient history!");
        }
    }
}
