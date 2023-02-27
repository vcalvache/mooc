
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Experiment with your program here

        Cube firstCube = new Cube(4);
        System.out.println(firstCube.volume());
        System.out.println(firstCube);
    }
}