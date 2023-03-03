
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int i = 0;
        int nameSize = 0;
        String longestName = "";
        double birthYearsAverage = 0;
        while (true){
            String givenString = reader.nextLine();
            if (givenString.equals("")){
                break;
            }
            String[] splittedString = givenString.split(",");
            if (nameSize < splittedString[0].length()){
                nameSize = splittedString[0].length();
                longestName = splittedString[0];
            }
            birthYearsAverage += Integer.valueOf(splittedString[1]);    
            i++;
        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + birthYearsAverage / i);
    }
}