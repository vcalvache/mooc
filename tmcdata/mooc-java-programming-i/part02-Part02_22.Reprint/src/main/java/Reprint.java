
import java.util.Scanner;

public class Reprint {

    public static void main(String[] args) {
       /*
        Expand the previous program so that the main program asks the user for the number of times the phrase will be printed
        (i.e. how many times the method will be called).

        public static void main(String[] args) {
            // ask the user for the number of times that the phrase will be printed
            // use the while command to call the method a suitable number of times
        }

        public static void printText() {
            // write some code in here
        }
        Sample output:

        Sample output
        How many times?
        7
        In a hole in the ground there lived a method
        In a hole in the ground there lived a method
        In a hole in the ground there lived a method
        In a hole in the ground there lived a method
        In a hole in the ground there lived a method
        In a hole in the ground there lived a method
        In a hole in the ground there lived a method

        NB: print the prompt How many times? on its own separate line!
       */
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many times?");
        int givenRepeats = Integer.valueOf(scanner.nextLine());

        for (int i = 0; i < givenRepeats; i++){
            printText();
        }
    }
    
    // Don't change the next line that defines the method!
    // (We aren't giving a method a parameter yet)
    public static void printText() {
        // write some code here
        System.out.println("In a hole in the ground there lived a method");
    }
}
