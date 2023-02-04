
public class Program {

    public static void main(String[] args) {

        

        /*
        Create a "Book" class that describes a book. Each book has an author, title, and page count.

        Make the class a:

        Constructor public Book(String author, String name, int pages)
        Method public String getAuthor() that returns the book's author's name.
        Method public String getName() that returns the name of the book.
        Method public int getPages() that returns the number of pages in the book.
        In addition, make a public String toString() method for the book that will be used to print the book object.
        For example, the method call should produce the following output:

        Sample output
        J. K. Rowling, Harry Potter and the Sorcerer's Stone, 223 pages
        */


        // This is simply an empty main method where you are
        // free to experiment with your Book class.
        // An example that you can use for testing:


        Book b = new Book("J. K. Rowling", "Harry Potter and the Sorcerer's Stone", 223);
        System.out.println(b);

    }
}
