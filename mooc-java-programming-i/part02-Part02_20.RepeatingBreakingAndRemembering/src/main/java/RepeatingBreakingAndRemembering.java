
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int even = 0;
        int odd = 0;

        System.out.println("Give numbers:");
        while (true){
            
            int givenNumbers = Integer.valueOf(scanner.nextLine());
            if (givenNumbers == -1) {
                System.out.println("Thx! Bye!");
                break;
            }

            if (givenNumbers % 2 == 0){
                even++;
            } else {
                odd++;
            }
            sum += givenNumbers;
            count++;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + ((double) sum / count));
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}