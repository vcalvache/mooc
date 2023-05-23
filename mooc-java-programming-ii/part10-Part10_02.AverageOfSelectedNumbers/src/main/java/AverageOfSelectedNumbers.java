
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        List<String> numbers = new ArrayList<String>();

        System.out.println("Input numbers, type \"end\" to stop");

        while(true){
            String input = scanner.nextLine();
            if (input.equals("end")){
                break;
            } else {
                numbers.add(input);
            }
        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String command = scanner.nextLine();

        if (command.equals("n")){
            Double averageOfNegative = numbers.stream()
            .mapToDouble(s -> Double.valueOf(s))
            .filter(number -> number < 0).average().getAsDouble();

            System.out.println("Average of negative numbers: " + averageOfNegative);
        } else if(command.equals("p")){
            Double averageOfPositive = numbers.stream()
            .mapToInt(s -> Integer.valueOf(s))
            .filter(number -> number > 0).average().getAsDouble();


            System.out.println("Average of positive numbers: "+ averageOfPositive);
        }

    }
}
