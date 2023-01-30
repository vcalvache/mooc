
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        /*
        Write a program, according to the preceding example, that asks the user to input values until they input the value 4.

        Sample output
        Give a number:
        5
        Give a number:
        744
        Give a number:
        22
        Give a number:
        -1
        Give a number:
        4
        */
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Give a number:");
            int givenNumber = Integer.valueOf(scanner.nextLine());
            if (givenNumber == 4){
                break;
            }
        }
    }
}
