
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        while (true){
            String givenString = reader.nextLine();
            if (givenString.equals("")){
                break;
            }
            String [] splitedString = givenString.split(" ");
            for (int i = 0; i < splitedString.length; i++){
                System.out.println(splitedString[i]);
            }
        }
    }
}