
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {

        /*
        Write a program, that reads a string from the user and then prints it three times.

        Sample output
        Give a word: cake

        cakecakecake

        NB! The program should ask for only one string. Don't use a loop here.
        */
        Scanner reader = new Scanner(System.in);

        // Write your program here

        System.out.print("Give a word: ");
        String wordGiven = reader.nextLine();
        System.out.println(wordGiven+wordGiven+wordGiven);
    }
}
