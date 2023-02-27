
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Items> itemArchive = new ArrayList<>();

        while (true){
            System.out.println("Identifier? (empty will stop)");
            String givenIdentifier = scanner.nextLine();
            if (givenIdentifier.isEmpty()){
                break;
            }
            System.out.println("Name? (empty will stop)");
            String givenName = scanner.nextLine();
            
            if (givenName.isEmpty()){
                break;
            }

            Items itemToAdd= new Items(givenIdentifier, givenName);
            
            if (itemArchive.contains(itemToAdd) == false){
                itemArchive.add(itemToAdd);
            }

        }

        System.out.println("==Items==");
        for (Items item: itemArchive){
            System.out.println(item);
        }

    }
}