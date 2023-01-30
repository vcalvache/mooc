
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        /*
        Write a program that reads names and birth years from the user until an empty line is entered.
        The name and birth year are separated by a comma.

        After that the program prints the longest name and the average of the birth years.
        If multiple names are equally longest, you can print any of them. You can assume that the user enters at least one person.

        Sample output
            sebastian,2017
            lucas,2017
            lily,2017
            hanna,2014
            gabriel,2009

        Longest name: sebastian
        Average of the birth years: 2014.8

        Sample output
            sauli,1948
            tarja,1943
            martti,1936
            mauno,1923
            urho,1900

            Longest name: martti
            Average of the birth years: 1930.0
        */
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
