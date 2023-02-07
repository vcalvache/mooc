import java.util.Scanner;

public class UserInterface {
    private TodoList list;
    private Scanner scan;
    
    public UserInterface(TodoList list, Scanner scan){
        this.scan = scan;
        this.list = list;
    }

    public void start(){
        while (true){
            System.out.print("Command: ");
            String command = this.scan.nextLine();
            if (command.equals("stop")){
               break;
            } else if (command.equals("add")){
                add();
            } else if (command.equals("list")){
                list();
            } else if (command.equals("remove")){
                remove();
            }
        }
    }

    public void add(){
        System.out.print("To add: ");
        String task = this.scan.nextLine();
        list.add(task);
    }

    public void list(){
        this.list.print();
    }

    public void remove(){
        System.out.print("Wich one is removed? ");
        int index = Integer.valueOf(this.scan.nextLine());
        this.list.remove(index);
        }
}

