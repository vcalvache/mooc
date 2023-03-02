
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {

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