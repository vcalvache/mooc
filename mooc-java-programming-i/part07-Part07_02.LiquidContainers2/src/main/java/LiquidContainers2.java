
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First: " + first.toString());
            System.out.println("Second: " + second.toString());
            
            String input = scan.nextLine();
            String[] splitedStrings = input.split(" ");
            String command = splitedStrings[0];
            if (command.equals("quit")) {
                break;
            } else if (command.equals("add")){
                int amount = Integer.valueOf(splitedStrings[1]);
                first.add(amount);
            } else if (command.equals("move")){
                int amount = Integer.valueOf(splitedStrings[1]);
                if (first.contains()==0){

                } else if (first.contains() - amount < 0){
                    int diff = (first.contains() - amount) * -1;
                    second.add(amount - diff);
                } else {
                    first.remove(amount);
                second.add(amount);
                }
            } else if (command.equals("remove")){
                int amount = Integer.valueOf(splitedStrings[1]);
                second.remove(amount);
            }
        }
    }
}
