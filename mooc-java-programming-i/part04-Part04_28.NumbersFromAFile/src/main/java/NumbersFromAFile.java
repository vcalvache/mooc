
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {

        /*
        Write a program that prompts the user for a filename, as well as the upper and lower bounds for the accepted range of numbers.
        Then the program reads the numbers contained in the file (each number is on its own line) and only accounts
        for the numbers which are inside the given range. Finally, the program should print the number of numbers that
        were inside the given range.

        You can convert a string-type integer read from a file into a proper integer using the command Integer.valueOf
        (just as when handling input from a user).

        Sample output
        File? numbers-1.txt
        Lower bound? 15
        Upper bound? 20
        Numbers: 2

        Sample output
        File? numbers-1.txt
        Lower bound? 0
        Upper bound? 300
        Numbers: 4

        NB! The exercise template comes with two files, numbers-1.txt and numbers-2.txt
        that have the following contents. Do not change the contents of these files.

        numbers-1.txt:

        Sample data
        300
        9
        20
        15

        numbers-2.txt:

        Sample data
        123
        -5
        12
        67
        -300
        1902
        */
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        int numbersFound = 0;

        try (Scanner fileToFind = new Scanner(Paths.get(file))){
            while (fileToFind.hasNextLine()){
                int number = Integer.valueOf(fileToFind.nextLine());
                numbers.add(number);
                
            }
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        for (int i = 0; i < numbers.size(); i++){
            if (numbers.get(i) >= lowerBound && numbers.get(i) <=upperBound){
                numbersFound++;
            }
        }    
        System.out.println("Numbers: " + numbersFound);

    }

}
