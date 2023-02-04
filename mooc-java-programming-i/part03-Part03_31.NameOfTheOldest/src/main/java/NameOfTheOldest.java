
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        /*
        Write a program that reads names and ages from the user until an empty line is entered.
        The name and age are separed by a comma.

        After reading all user input, the program prints the name of the oldest person.
        You can assume that the user enters at least one person, and the that one of the users is older than the others.

        Sample output
        sebastian,2
        lucas,2
        lily,1
        hanna,5
        gabriel,10

        Name of the oldest: gabriel
        */
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
