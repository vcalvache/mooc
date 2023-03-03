
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int oldest= 0;
        while (true){
            String givenString = reader.nextLine();
            if (givenString.equals("")){
                break;
            }

            String[] splittedString = givenString.split(",");

            if (oldest < Integer.valueOf(splittedString[1])){
                oldest = Integer.valueOf(splittedString[1]);
            }
        }
        System.out.println("The age of the oldest: " + oldest);
    }
}