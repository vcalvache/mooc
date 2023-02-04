
import java.util.Scanner;

public class Adulthood {

    public static void main(String[] args) {
        /*
        Write a program that prompts the user for their age and tells them whether or not they are an adult (18 years old or older).

        Sample output
        How old are you?
        12
        You are not an adult

        Sample output
        How old are you?
        32
        You are an adult 
        */
        Scanner scan = new Scanner(System.in);

        // Write your program here 
        System.out.println("How old are you?");
        int givenAge = Integer.valueOf(scan.nextLine());
        if (givenAge < 18){
            System.out.println("You are not an adult");
        } else {
            System.out.println("You are an adult");
        }
    }
}
