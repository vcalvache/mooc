
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        /*
        Write a program that reads strings from the user until the user inputs the string "end".
        As long as the input is not "end", the program should handle the input as an integer
        and print the cube of the number provided (i.e., number _ number _ number). Below are some sample outputs

        Sample output
        3
        27
        -1
        -1
        11
        1331
        end

        Sample output
        end
        */
        Scanner scanner = new Scanner(System.in);

        while (true){
            String givenInput = scanner.nextLine();
            if (givenInput.equals("end")){
                break;
            }
            int num = Integer.valueOf(givenInput);
            System.out.println((num * num) *num);
        }

    }
}
