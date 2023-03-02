
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
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