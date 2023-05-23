
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        List<String> numbers = new ArrayList<String>();

        System.out.println("Input numbers, type \"end\" to stop");
        while (true){
            String input = scanner.nextLine();
            if(input.equals("end")){
                break;
            } else {
                numbers.add(input);
            }
        }

        double average = numbers.stream().mapToInt(s -> Integer.valueOf(s)).average().getAsDouble();

        System.out.println("Average of the numbers: " + average);

    }
}
