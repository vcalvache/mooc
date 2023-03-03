
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {

        */
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.print("Where to? ");
        int givenEnd = Integer.valueOf(scanner.nextLine());
        System.out.print("Where from? ");
        int givenStart = Integer.valueOf(scanner.nextLine());

        while (givenStart <= givenEnd){
            System.out.println(givenStart);
            givenStart++;
        }
    }
}