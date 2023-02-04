
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        /*
        Write a program that prompts the user for a password. If the password is "Caput Draconis" the program prints "Welcome!". Otherwise, the program prints "Off with you!"

        Sample output
        Password?
        Wattlebird
        Off with you!

        Sample output
        Password?
        Caput Draconis
        Welcome!
        */
        Scanner scan = new Scanner(System.in);

        // Write your program here 
        System.out.println("Password?");
        String givenPassword = scan.nextLine();
        if (givenPassword.equals("Caput Draconis")){
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }
    }
}
