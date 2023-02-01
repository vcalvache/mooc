
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {

        /*
        In this exercise, we'll be working with files stored in CSV format, which contain names and ages separated by commas.
        The file format may look like this:

        Sample data
        lily,3
        anton,5
        levi,4
        amy,1

        The exercise template already has a Person class, and the class StoringRecords has a body
        for the method public static ArrayList<Person> readRecordsFromFile(String file).
        Implement the readRecordsFromFile method such that it reads the persons from the file passed as a parameter,
        and finally returns them in the list returned by the method.

        The exercise template has a main method that you can use to test how your program works.
        In this exercise, only modify the method readRecordsFromFile.
        */

        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
       // System.out.println("Persons: " + records.size());
        //System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();

        // Write here the code for reading from file
        // and printing the read records

        try (Scanner scan = new Scanner(Paths.get(file))){
            while (scan.hasNextLine()){
                String line = scan.nextLine();
                String[] splittedLine = line.split(",");
                persons.add( new Person(splittedLine[0], Integer.valueOf(splittedLine[1])));
            }
            
        } catch (Exception e) {
            // TODO: handle exception
        }
        return persons;

    }
}
