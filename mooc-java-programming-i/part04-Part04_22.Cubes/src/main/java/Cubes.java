
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            String givenInput = scanner.nextLine();
            if (givenInput.equals("end")){
                break;
            }
            int num = Integer.valueOf(givenInput);
            System.out.println((num * num) *num);
        }

    }
}