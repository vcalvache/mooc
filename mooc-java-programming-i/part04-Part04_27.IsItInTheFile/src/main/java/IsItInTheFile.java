
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        boolean found = false;

        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        try (Scanner fileTofind = new Scanner (Paths.get(file))){
            while (fileTofind.hasNextLine()){
                String line = fileTofind.nextLine();
                names.add(line);
            }
            
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        for (int i = 0; i < names.size(); i++){
            if (names.get(i).equals(searchedFor)){
                found = true;
            } 
        }
        if (found == true){
            System.out.println("Found!");
        } else {
            System.out.println("Not found.");
        }


    }
}