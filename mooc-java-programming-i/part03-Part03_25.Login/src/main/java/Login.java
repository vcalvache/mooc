
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

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