
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        /*
        Write a program that reads strings from the user.
        If the input is empty, the program stops reading input and halts.
        For each non-empty input it splits the string input by whitespaces and prints each part of the string on a new line.

        input: Sample output
        once upon a time
        once
        upon
        a
        time
        input: a little program
        a
        little
        program
        input: halted
        halted
        */
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
