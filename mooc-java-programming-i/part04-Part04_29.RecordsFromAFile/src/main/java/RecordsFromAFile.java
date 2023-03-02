
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String fileToFind = scanner.nextLine();

        try (Scanner file = new Scanner (Paths.get(fileToFind))){
            while (file.hasNextLine()){
                String row = file.nextLine();
                String[] splittedRow = row.split(",");
                System.out.println(splittedRow[0] + ", age: " + splittedRow[1] + " years" );
            }
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}