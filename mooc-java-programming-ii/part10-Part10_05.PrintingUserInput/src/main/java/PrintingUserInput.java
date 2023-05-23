
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        List<String> inputedText = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        while (true){
            String input = scanner.nextLine();
            if (input.equals("")){
                break;
            } else {
                inputedText.add(input);
            }           
        }
        inputedText.stream().forEach(line -> System.out.println(line));

    }
}
