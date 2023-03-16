
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int firstNumberGIven = Integer.valueOf(scanner.nextLine());
        int seconndNUmberGiven = Integer.valueOf(scanner.nextLine());
        Double squareRoot = Math.sqrt(firstNumberGIven+seconndNUmberGiven);
        System.out.println(squareRoot);

    }
}