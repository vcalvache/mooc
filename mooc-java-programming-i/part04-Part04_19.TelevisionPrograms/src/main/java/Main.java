import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        In the exercise template there is a ready-made class TelevisionProgram,
        representing a television program. The class has object variables name and duration,
        a constructor, and a few methods.

        Implement a program that begins by reading television programs from the user.
        When the user inputs an empty string as the name of the program, the program stops reading programs.

        After this the user is queried for a maximum duration. Once the maximum is given,
        the program proceeds to list all the programs whose duration is smaller or equal to the specified maximum duration.

        Sample output
        Name: Rick and Morty
        Duration: 25
        Name: Two and a Half Men
        Duration: 30
        Name: Love it or list it
        Duration: 60
        Name: House
        Duration: 60

        Program's maximum duration? 30
        Rick and Morty, 25 minutes
        Two and a Half Men, 30 minutes
        */
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Name: ");
            String name = scanner.nextLine();
            if (name.isEmpty()){
                break;
            }
            System.out.println("Duration: ");
            int duration = Integer.valueOf(scanner.nextLine());
            programs.add(new TelevisionProgram(name, duration));    
        }
        System.out.println("Program's maximum duration? ");
        int maxDuration = Integer.valueOf(scanner.nextLine());
        for (TelevisionProgram program: programs){
            if (program.getDuration() <= maxDuration){
                System.out.println(program.getName()+", "+program.getDuration()+" minutes");
            }
        }
    }
}
