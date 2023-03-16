
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        while (true){
            String givenString = reader.nextLine();
            if (givenString.equals("")){
                break;
            }
            String [] splittedString = givenString.split(" ");
            for (int i = 0; i <splittedString.length; i++){
                if (splittedString[i].contains("av")){
                    System.out.println(splittedString[i]);
                }
            }   

        }
    }
}