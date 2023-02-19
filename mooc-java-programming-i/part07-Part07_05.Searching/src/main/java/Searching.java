
import java.util.ArrayList;
import java.util.Scanner;

public class Searching {

    public static void main(String[] args) {

        /*
        /*
        In the exercise template you'll find the class Book, ready for use.
        The class describes objects with a numeric id id and a name name.

        In this exercise you will implement linear search and binary search algorithms for searching for books
        by their numeric id. In the exercise template you'll find the names of the methods to be implemented
        ready for you — at the moment these method always return -1 — you'll also find the Main method ready
        to be used for testing your methods.

        Part 1: Linear search
        The linear search algorithm works by checking every value in a list or an array one at a time,
        starting from index 0.

        In the Main-class, implement a method public static int linearSearch(ArrayList<Book> books, int searchedId),
        which searches the list it received as a parameter, for a book with an id variable that matches the value of
        searchedId variable it received as a parameter.
        If that book is found, the method, should return the index it's located at in the list it received as a parameter.
        If the book isn't found, the method should return the value -1.

        Part 2: Binary search
        In the Main-class, implement a method public static int binarySearch(ArrayList<Book> books, int searchedId),
        which searches the list it received as a parameter, for a book with an id variable that matches the value
        of searchedId variable it received as a parameter. If that book is found the method, should return the index
        it's located at, in the list it received as a parameter.
        If the book isn't found, the method should return the value -1.

        The method must be implemented as a binary search, which assumes the list is ordered.
        You should also assume, that the ids towards the beginning of the list, are always smaller than
        the ids towards the end of the list.

        To help you, you have the idea of the binary search shown in the slideshow above,
        as well as the pseudocode for binary search. Pseudocode is a description of a programs/methods function
        written in a programming-language like way.

        In the slideshow above, the idea of a binary search was described as follows:

        - The array or list searched must be sorted
        - The search begins in the middle of the array or list
        - If the value in the middle-point being examined isn't the searched value, eliminate half of the searched area,
          and move on to examine the middle-point of the remaining half.
        - If the value in the middle-point being examined is the searched value,
          return the index of the middle-point being examined.
        - If there is nowhere left to search (the entire area has been eliminated), return the value -1,
          indicating that the searched value was not found (i.e, it wasn't in the list or array searched).

        The pseudocode for binary search looks like this:

            // assuming the variable searched exits
            // assuming the variable list exits
            begin = 0 // the 0th index of the list (i.e, the first index of the list)
            end = size(list) - 1 // the last index in the list

            repeat until begin is larger than end:
                middle = (end + begin) / 2

                if the value at list[middle] is searched
                    return the value of the variable middle

                if the value at list[middle] is smaller than searched
                    begin = middle + 1

                if the value at list[middle] is larger than searched
                    end = middle - 1

            return value -1
        Note that in the case of books, you are examining the values of the books' id-variable.
        Meaning that in this exercise, instead of examining the value at an index, you should examine
        the value of the id-variable of the value found at the index.
        */
        

        // The program below is meant for testing the search algorithms you'll write
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        System.out.println("How many books to create?");
        int numberOfBooks = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < numberOfBooks; i++) {
            books.add(new Book(i, "name for the book " + i));
        }

        System.out.println("Id of the book to search for?");
        int idToSearchFor = Integer.valueOf(scanner.nextLine());

        System.out.println("");
        System.out.println("Searching with linear search:");
        long start = System.currentTimeMillis();
        int linearSearchId = linearSearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (linearSearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(linearSearchId));
        }

        System.out.println("");

        System.out.println("");
        System.out.println("Seaching with binary search:");
        start = System.currentTimeMillis();
        int binarySearchId = binarySearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (binarySearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(binarySearchId));
        }

    }

    public static int linearSearch(ArrayList<Book> books, int searchedId){
        for (int i = 0; i < books.size(); i++){
            if (books.get(i).getId() == searchedId){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(ArrayList<Book> books, long searchedId) {
        int result = -1 ;
        int begin = 0;
        int end = books.size() - 1;
        while (begin <= end){
            int middle = (end + begin) / 2;
            if (books.get(middle).getId() < searchedId){
                begin = middle + 1;
            } else if (books.get(middle).getId() > searchedId){
                end = middle - 1;
            } else if (books.get(middle).getId() == searchedId){
                result = middle;
                break;
            }
        }
        return result;
    }
}

