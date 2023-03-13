import java.util.Scanner;

public class UserInterface {
    private TodoList list;
    private Scanner scan;

    public UserInterface(TodoList list, Scanner scan){
        this.list = list;
        this.scan = scan;
    }

    public void start(){

        while(true){
            System.out.print("Command: ");
            String input = this.scan.nextLine();
            if (input.equals("add")){
                System.out.print("To add: ");
                String newTask = scan.nextLine();
                list.add(newTask);
            } else if (input.equals("list")){
                list.print();
            } else if (input.equals("remove")){
                System.out.print("Wich one is removed? ");
                int index = Integer.valueOf(scan.nextLine());
                list.remove(index);
            } else if (input.equals("stop")){
                break;
            }
        }
    }
}
