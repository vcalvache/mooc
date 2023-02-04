
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        /*
        Create a Cube class that represents a cube (i.e., a standard hexahedron).
        Create a public Cube (int edgeLength) constructor for the class,
        that takes the length of the cube's edge as its parameter.

        Make a public int volume() method for the cube, which calculates and returns the cube's volume.
        The volume of the cube is calculated with the formula edgeLength * edgeLength * edgeLength.
        Moreover, make a public String toString() method for the cube, which returns a string representation of it.
        The string representation should take the form "The length of the edge is l and the volume v",
        where l is the length and v the volume - both the length and volume must be represented as integers.

        Examples are provided underneath

        Cube oSheaJackson = new Cube(4);
        System.out.println(oSheaJackson.volume());
        System.out.println(oSheaJackson);

        System.out.println();

        Cube salt = new Cube(2);
        System.out.println(salt.volume());
        System.out.println(salt);
        Sample output
        64
        The length of the edge is 4 and the volume 64

        8
        The length of the edge is 2 and the volume 8
        */
        Scanner scanner = new Scanner(System.in);

        // Experiment with your program here

        Cube firstCube = new Cube(4);
        System.out.println(firstCube.volume());
        System.out.println(firstCube);
    }
}
