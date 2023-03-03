
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
 
        Scanner reader = new Scanner(System.in);

        String nameOfTheOldest = "";
        int oldest = 0;
        while (true){
            String givenString = reader.nextLine();
            if (givenString.equals("")){
                break;
            }
            String[] splittedString = givenString.split(",");
            if (oldest < Integer.valueOf(splittedString[1])){
                oldest = Integer.valueOf(splittedString[1]);
                nameOfTheOldest = splittedString[0];
            }
        }
        System.out.println("Name of the oldest: " + nameOfTheOldest);
    }
}