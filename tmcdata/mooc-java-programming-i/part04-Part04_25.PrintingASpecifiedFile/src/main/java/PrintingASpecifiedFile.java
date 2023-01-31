
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        /*
        Write a program that asks the user for a string, and then prints the contents of a file with a name matching the string provided. You may assume that the user provides a file name that the program can find.

        The exercise template contains the files "data.txt" and "song.txt", which you may use when testing the functionality of your program. The output of the program can be seen below for when a user has entered the string "song.txt". The content that is printed comes from the file "song.txt". Naturally, the program should also work with other filenames, assuming the file can be found.

        Sample output
        Which file should have its contents printed?
        song.txt
        No option for duality
        The old is where we come
        Clockspeed is fast, but we'll survive
        The new will overcome
        We are challengers, not followers
        We take the ball to build
        Easy safe services
        Are here to stay

        Value for society
        Value for life
        For you and me
        Tieto is here allright!
        */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wich file should have its contents printed?");
        String fileToFind = scanner.nextLine();

        try (Scanner file = new Scanner(Paths.get(fileToFind))){
            while (file.hasNextLine()){
                String line = file.nextLine();
                System.out.println(line);
            }
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
