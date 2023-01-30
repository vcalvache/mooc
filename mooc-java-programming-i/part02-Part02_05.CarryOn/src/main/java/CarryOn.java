
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        /*
        Write a program by using the loop example that asks "Shall we carry on?" until the user inputs the string "no".

        Sample output
        Shall we carry on?
        yes
        Shall we carry on?
        ye
        Shall we carry on?
        y
        Shall we carry on?
        no
        */
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Shall we carry on?");
            String userInpt = scanner.nextLine();
            if (userInpt.equals("no")){
                break;
            }
        }    
    }
}
