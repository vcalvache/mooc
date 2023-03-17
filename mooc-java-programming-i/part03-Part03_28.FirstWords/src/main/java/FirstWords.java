
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        while (true){
            String givenString = reader.nextLine();
            if (givenString.equals("")){
                break;
            }
            String[] splittedString = givenString.split(" ");
            System.out.println(splittedString[0]);
        }
    }
}