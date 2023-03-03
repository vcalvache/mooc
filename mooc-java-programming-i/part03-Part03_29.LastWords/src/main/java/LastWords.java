
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        while (true){
            String givenString = reader.nextLine();
            if (givenString.equals("")){
                break;
            }
            String[] splittedStrings = givenString.split(" ");
            System.out.println(splittedStrings[splittedStrings.length -1]);
        }
    }
}