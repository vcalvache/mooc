
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        /*
        Write a program that reads strings from the user until the user inputs the string "end".
        At that point, the program should print how many strings have been read.
        The string "end" should not be included in the number strings read.
        You can find some examples below of how the program works.

        Sample output
        I
        have
        a
        feeling
        that
        I
        have
        written
        this
        wrong
        before
        end
        11

        Sample output
        end
        0
        */
        Scanner scanner = new Scanner(System.in);
        int totalStringsGiven =0;
        while (true){
            String givenString = scanner.nextLine();
            if (givenString.equals("end")){
                break;
            }
            totalStringsGiven+=1;
        }
        System.out.println(totalStringsGiven);

    }
}
