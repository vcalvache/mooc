
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        // Write your program here

        System.out.print("Give a word: ");
        String wordGiven = reader.nextLine();
        System.out.println(wordGiven+wordGiven+wordGiven);
    }
}