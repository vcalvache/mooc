import java.util.Scanner;

public class UserInterface {
    private JokeManager jokesToManage;
    private Scanner scanner;

    public UserInterface(JokeManager manager, Scanner scanner){
        this.jokesToManage = manager;
        this.scanner = scanner;
    }

    public void start(){
        while (true){
            System.out.println("Commands: ");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");
            String command = this.scanner.nextLine();
            if (command.equals("X")){
                break;
            } else if (convertToNumber(command) == 1){
                System.out.println("Write the joke to be added:");
                String joke = this.scanner.nextLine();
                jokesToManage.addJoke(joke);
            } else if (convertToNumber(command) == 2){
                System.out.println(jokesToManage.drawJoke());
            } else if (convertToNumber(command) == 3){
                jokesToManage.printJokes();
            }
        }    
    }

    public void addJoke(){
        System.out.println("Write the joke to be added:");
        String jokeToAdd = this.scanner.nextLine(); 
        this.jokesToManage.addJoke(jokeToAdd);
    }

    public void drawJoke(){
        this.jokesToManage.drawJoke();
    }

    public void listJokes(){
        this.jokesToManage.printJokes();
    }

    public int convertToNumber(String toConvert){
        int number = Integer.valueOf(toConvert);
        return number;
    }
    

}
