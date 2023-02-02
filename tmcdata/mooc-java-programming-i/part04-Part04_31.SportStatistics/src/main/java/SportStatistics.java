
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.MatchResult;

public class SportStatistics {

    public static void main(String[] args) {

        /*
        In this exercise, we'll be working with files stored in CSV format.
        Each line of the file contains the home team, visiting team, home team points,
        and visiting team points, all separated by commas.

        You can see an example below of the file's contents.
        The file shown below is also included in the exercise template with the name "data.csv".

        Sample data
        ENCE,Vitality,9,16
        ENCE,Vitality,16,12
        ENCE,Vitality,9,16
        ENCE,Heroic,10,16
        SJ,ENCE,0,16
        SJ,ENCE,3,16
        FURIA,NRG,7,16
        FURIA,Prospects,16,1

        Write a program that prompts the user for a filename, after which it reads the match statistics from the file.
        The program then prompts the user for the name of a team, and prints the data specified in the following parts for that team.

        Part 1: Games Played
        Implement the ability to output the number of games played by any given team. We're using the above-mentioned data.csv file.

        Sample output
        File:
        data.csv
        Team:
        FURIA
        Games: 2

        Sample output
        File:
        data.csv
        Team:
        ENCE
        Games: 6

        Part 2: Wins and Losses
        Extend the program so that it has the ability to print the number of wins and losses of a given team.
        The winner of a game is the team that has gained more points from it.

        You may assume that the games cannot be tied. Below, we're using the above-mentioned data.csv file.

        Sample output
        File:
        data.csv
        Team:
        FURIA
        Games: 2
        Wins: 1
        Losses: 1

        Sample output
        File:
        data.csv
        Name:
        ENCE
        Games: 6
        Wins: 3
        Losses: 3
        */
        
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
