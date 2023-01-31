
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class GuestListFromAFile {

    public static void main(String[] args) {
        /*
        The exercise template comes ready with functionality for the guest list application.
        It checks whether names entered by the user are on the guest list.

        However, the program is missing the functionality needed for reading the guest list.
        Modify the program so that the names on the guest list are read from the file.

        Sample output
        Name of the file:
        guestlist.txt

        Enter names, an empty line quits.
        Chuck Norris
        The name is not on the list.
        Jack Baluer
        The name is not on the list.
        Jack Bauer
        The name is on the list.
        Jack Bower
        The name is on the list.

        Thank you!

        NB! The exercise template comes with two files, names.txt and other-names.txt,
        which have the following contents. Do not change the contents of the files!

        names.txt:

        Sample data
        ada
        arto
        leena
        test

        other-names.txt:

        Sample data
        leo
        jarmo
        alicia
        */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        ArrayList<String> list = new ArrayList<>();
        // implement reading the file here.

        try (Scanner fileToFind = new Scanner(Paths.get(file))){
            while (fileToFind.hasNextLine()){
                String row = fileToFind.nextLine();
                list.add(row);
            }
            
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
        System.out.println("");

        System.out.println("Enter names, an empty line quits.");
        while (true) {
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            if (list.contains(name)) {
                System.out.println("The name is on the list.");
            } else {
                System.out.println("The name is not on the list.");
            }
        }

        System.out.println("Thank you!");
    }
}
