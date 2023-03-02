
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.MatchResult;

public class SportStatistics {

    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        System.out.println("File: ");
        String fileToFind = scan.nextLine();
        System.out.println("Team: ");
        String teamToFind = scan.nextLine();

        ArrayList<Integer> results = new ArrayList<Integer>(readFromFile(fileToFind, teamToFind));
        System.out.println("Games: "+results.get(0));
        System.out.println("Wins: "+results.get(1));
        System.out.println("Losses: "+results.get(2));

    }

    public static ArrayList<Integer> readFromFile (String fileToFind, String teamToFind){
        int gamesPlayed = 0;
        int wins = 0;
        int loses = 0;
        try (Scanner file = new Scanner(Paths.get(fileToFind))){
            while (file.hasNextLine()){
                String line = file.nextLine();
                String[] splittedLine = line.split(",");
                //this conditional checks if a team plays as a local or guest.
                if (splittedLine[0].equals(teamToFind) || splittedLine[1].equals(teamToFind)){
                    gamesPlayed++;
                }
                //this checks if the team to find is local and wins or loses
                if (splittedLine[0].equals(teamToFind)){
                    if (Integer.valueOf(splittedLine[2]) > Integer.valueOf(splittedLine[3])){
                        wins++;
                    } else {
                        loses++;
                    }
                }
                //checks if the searched team plays as guest and wins
                if (splittedLine[1].equals(teamToFind)){
                    if (Integer.valueOf(splittedLine[2]) <Integer.valueOf(splittedLine[3])){
                        wins++;
                    }
                }
            }
            
        } catch (Exception e) {
            // TODO: handle exception
        }
        ArrayList<Integer> matchResults = new ArrayList<Integer>();
        matchResults.add(gamesPlayed);
        matchResults.add(wins);
        matchResults.add(loses);

        return matchResults;
    }
}