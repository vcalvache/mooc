
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<Integer>();

        while (true){
            Integer input = Integer.valueOf(scanner.nextLine());
            if (input < 0){
                break;
            } else {
                numbers.add(input);
            }
        }

        numbers.stream().filter( number -> number >= 1 && number <=5)
        .forEach(number -> System.out.println(number));
    }
}
