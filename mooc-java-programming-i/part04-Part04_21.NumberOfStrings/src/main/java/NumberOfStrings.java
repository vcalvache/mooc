
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int totalStringsGiven =0;
        while (true){
            String givenString = scanner.nextLine();
            if (givenString.equals("end")){
                break;
            }
            totalStringsGiven+=1;
        }
        System.out.println(totalStringsGiven);

    }
}