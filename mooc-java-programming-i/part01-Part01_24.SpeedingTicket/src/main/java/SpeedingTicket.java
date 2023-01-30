
import java.util.Scanner;

public class SpeedingTicket {

    public static void main(String[] args) {
        /*
        Write a program that asks the user for an integer and prints the string "Speeding ticket!" if the input is greater than 120.

        Sample output
        Give speed:
        15

        Sample output
        Give speed:
        135
        Speeding ticket!
        */
        Scanner scanner = new Scanner(System.in);

        // Write your program here. 
        System.out.println("Give speed:");
        int speedGiven = Integer.valueOf(scanner.nextLine());
        System.out.println(speedGiven);
        if (speedGiven > 120){
            System.out.println("Speeding ticket!");
        }
    }
}
