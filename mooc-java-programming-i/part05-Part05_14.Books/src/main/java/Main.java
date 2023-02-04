
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
        There is a program in the exercise base that asks for books from the user and adds them to a list.

        Modify the program so that books that are already on the list are not added to it again.
        Two books should be considered the same if they have the same name and publication year.

        Example print

        Sample output
        Name (empty will stop):
        Bossypants
        Publication year:
        2013
        Name (empty will stop):
        Seriously...I'm Kidding
        Publication year:
        2012
        Name (empty will stop):
        Seriously...I'm Kidding
        Publication year:
        2012
        The book is already on the list. Let's not add the same book again.
        Name (empty will stop):

        Thank you! Books added: 2
        */
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("Name (empty will stop):");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            System.out.println("Publication year:");
            int publicationYear = Integer.valueOf(scanner.nextLine());
            Book book = new Book(name, publicationYear);
            
            if (books.contains(book)){
                System.out.println("The book is already on the list. Let's not add the same book again.");
            } else {
                books.add(book);      
            }
        }
        
        // NB! Don't alter the line below!
        System.out.println("Thank you! Books added: " + books.size());
    }
}
