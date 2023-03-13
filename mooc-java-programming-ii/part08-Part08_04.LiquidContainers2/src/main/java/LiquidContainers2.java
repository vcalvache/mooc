
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container firstContainer = new Container();
        Container secondContainer = new Container();


        while (true) {
            System.out.println("> ");
            System.out.println("First: " + firstContainer.contains()+"/100");
            System.out.println("Second: " + secondContainer.contains()+"/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] commandAndQuantity = input.split(" ");
            String command = commandAndQuantity[0];
            int quantity = Integer.valueOf(commandAndQuantity[1]);

            if (command.equals("add")){
                firstContainer.add(quantity);
            } else if (command.equals("move")){
                if (quantity > firstContainer.contains()){
                    int difference = firstContainer.contains();
                    firstContainer.remove(quantity);
                    secondContainer.add(difference);
                } else {
                firstContainer.remove(quantity);
                secondContainer.add(quantity);
                }
            } else if (command.equals("remove")){
                secondContainer.remove(quantity);
            }
        }
    }
}