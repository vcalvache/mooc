
import java.util.Scanner;
import java.util.ArrayList;

public class LiquidContainers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int first = 0;
        int second = 0;
        
        while (true) {    
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");       
            String input = scan.nextLine();
            String[] splittedInput = input.split(" ");
            String command = splittedInput[0];

            if (command.equals("quit")) {
                break;
            } else if (command.equals("add")){
                int amount = Integer.valueOf(splittedInput[1]);
                if (amount > 0){
                    first += amount;
                    if (first > 100){
                        first = 100;
                    }
                }                  
            } else if (command.equals("move")){
                int amount = Integer.valueOf(splittedInput[1]);
                int diff = 0;
                if (amount > first){
                    diff = (first - amount) * -1;
                    first = 0;
                    second = amount - diff;
                }
                if (first - amount < 0){
                    first = 0;
                } else {
                first -= amount;
                second += amount;
                    if (second > 100){
                        second = 100;
                    }
                }
            } else if (command.equals("remove")){
                int amount = Integer.valueOf(splittedInput[1]);
                second -= amount;
                if (second < 0){
                    second = 0;
                }
            }
        }
    }
}