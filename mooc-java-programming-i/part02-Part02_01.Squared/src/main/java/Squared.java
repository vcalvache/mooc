
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberGiven = Integer.valueOf(scanner.nextLine());
        System.out.println(numberGiven * numberGiven);
    }
}