
import java.util.Scanner;

public class MessageThreeTimes {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
   
        System.out.println("Write a message:");
        // Write your program here
        String text = input.nextLine();
        
        System.out.println(text);
        System.out.println(text);
        System.out.println(text);
    }
}