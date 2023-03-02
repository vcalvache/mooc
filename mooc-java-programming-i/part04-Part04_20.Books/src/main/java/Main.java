import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here the program that allows the user to enter 
        // book information and to examine them

        Scanner reader = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true){
            System.out.print("Title: ");
            String givenTitle = reader.nextLine();
            if (givenTitle.isEmpty()){
                break;
            }
            System.out.print("Pages: ");
            int totalPages = Integer.valueOf(reader.nextLine());
            System.out.print("Publication year: ");
            int publicationYear = Integer.valueOf(reader.nextLine());
            books.add(new Book(givenTitle, totalPages, publicationYear));
        }
        System.out.print("What information will be printed? ");
        String infoToPrint = reader.nextLine();
        if (infoToPrint.equals("name")){
            for (Book allBooks: books){
                System.out.println(allBooks.getTitle());
            }
        } else if (infoToPrint.equals("everything")){
            for (Book allBooks: books){
                System.out.println(allBooks.toString());
            }
        }
    }
}