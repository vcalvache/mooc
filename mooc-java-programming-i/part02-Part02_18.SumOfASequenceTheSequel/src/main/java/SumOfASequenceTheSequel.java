
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("First number? ");
        int firstNumberGiven = Integer.valueOf(scanner.nextLine());
        System.out.print("Last number? ");
        int lastNumberGiven = Integer.valueOf(scanner.nextLine());
        
        int sum = 0;
        for(int i = 0; firstNumberGiven <= lastNumberGiven; firstNumberGiven++){
            sum += firstNumberGiven;
        }
        System.out.println("The sum is " + sum);
    }
}