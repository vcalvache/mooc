
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        BirdsDataBase dataBase = new BirdsDataBase();

        while(true){
            System.out.print("? ");
            String command = scan.nextLine();
            if (command.equals("Add")){
                dataBase.addBird(scan);
            } else if (command.equals("Observation")){
                dataBase.addObservation(scan);
            } else if (command.equals("All")){
                dataBase.printAllBirds();
            } else if (command.equals("One")){
                dataBase.printOneBird(scan);
            } else if (command.equals("Quit")){
                break;
            } else {
                System.out.println("Incorrect command. Try again!");
            }
        }
    }
}