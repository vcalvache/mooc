
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container firstContainer = new Container();
        Container secondContainer = new Container();


        while (true) {
            System.out.println("> ");
            System.out.println("First: " + firstContainer.getQuantity()+"/100");
            System.out.println("Second: " + secondContainer.getQuantity()+"/100");

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
                firstContainer.move(quantity, secondContainer);
            } else if (command.equals("remove")){
                firstContainer.remove(quantity, secondContainer);
            }
        }
    }
}