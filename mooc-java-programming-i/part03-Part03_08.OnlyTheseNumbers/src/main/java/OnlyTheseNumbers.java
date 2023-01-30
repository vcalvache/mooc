
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {

        /*
        The exercise template contains a base that reads numbers from the user and adds them to a list.
        Reading is stopped once the user enters the number -1.

        Expand the program to ask for a start and end indices once it has finished asking for numbers.
        After this the program shall prints all the numbers in the list that fall in the specified range
        (between the indices given by the user, inclusive). You may assume that the user gives indices that match some numbers in the list.

        Sample output
        72
        2
        8
        11
        -1
        From where? 1
        To where? 2
        2
        8

        Sample output
        72
        2
        8
        11
        -1
        From where? 0
        To where? 2
        72
        2
        8
        */
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
        }
        System.out.print("From where? ");
        int givenStart = Integer.valueOf(scanner.nextLine());
        System.out.println("To where? ");
        int givenEnd = Integer.valueOf(scanner.nextLine());

        while (givenStart <= givenEnd){
            System.out.println(numbers.get(givenStart));
            givenStart++;
        }

    }
}
