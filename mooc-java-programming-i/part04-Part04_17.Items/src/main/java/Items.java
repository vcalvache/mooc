
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {

        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner reader = new Scanner(System.in);

        while (true){
            System.out.print("Name: ");
            String givenName = reader.nextLine();
            if (givenName.isEmpty()){
                break;
            }
            items.add(new Item(givenName));
        }
       System.out.println(items);

    }
}