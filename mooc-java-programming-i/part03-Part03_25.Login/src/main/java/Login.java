
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        /*
         Write a program that recognizes the following users:

        username	password
        alex	    sunshine
        emma	    haskell
        The program either shows a personal message or informs of an incorrect username or password.

        Sample output
        Enter username: alex
        Enter password: sunshine
        You have successfully logged in!

        Sample output
        Enter username: emma
        Enter password: haskell
        You have successfully logged in!

        Sample output
        Enter username: alex
        Enter password: thunderstorm
        Incorrect username or password!
        */
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter username: ");
        String givenUserName = reader.nextLine();
        System.out.print("Enter password: ");
        String givenPassword = reader.nextLine();

        if (givenUserName.equals("alex") && givenPassword.equals("sunshine") ){
            System.out.println("You have successfully logged in!");
        } else if (givenUserName.equals("emma") && givenPassword.equals("haskell")){
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
