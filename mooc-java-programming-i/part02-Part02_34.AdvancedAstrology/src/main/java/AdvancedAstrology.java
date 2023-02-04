import javax.xml.transform.SourceLocator;

public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for (int i = 0 ; i < number ; i++){
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printStarsWithoutEndLine(int number) {
        // part 1 of the exercise
        for (int i = 0 ; i < number ; i++){
            System.out.print("*");
        }
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i++){
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int y = 1;
        for (int i = 0; i < size; size--){
            printSpaces(size-1);
            printStars(y);
            y++;
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int y = 1;
        int z = 0;
        int base = height;
        for (int i = 0; i < height; height--){
            printSpaces(height-1);
            printStarsWithoutEndLine(y);
            printStars(z);  
            z++;
            y++;
        }
        printSpaces(base -2);
        printStars(3);
        printSpaces(base- 2 );
        printStars(3);
        
    }

    public static void main(String[] args) {

        /*
        Part 1: Printing stars and spaces
        Define a method called printSpaces(int number) that produces the number of spaces specified by number.
        The method does not print the line break.

        You will also have to either copy the printStars method from your previous exercise or reimplement it in this exercise template.

        Part 2: Printing a right-leaning triangle
        Create a method called printTriangle(int size) that uses printSpaces and printStars to print the correct triangle.
        So the method call printTriangle(4) should print the following:

        Sample output

           *
          **
         ***
        ****
        
        Part 3: Printing a Christmas tree
        Define a method called christmasTree(int height) that prints the correct Christmas tree.
        The Christmas tree consists of a triangle with the specified height as well as the base.
        The base is two stars high and three stars wide, and is placed at the center of the triangle's bottom. The tree is to be constructed by using the methods printSpaces and printStars.

        For example, the call christmasTree(4) should print the following:

        Sample output

           *
          ***
         *****
        *******
          ***
          ***
        The call christmasTree(10) should print:

        Sample output

                 *
                ***
               *****
              *******
             *********
            ***********
           *************
          ***************
         *****************
        *******************
                ***
                ***
        NB: heights shorter than 3 don't have to work correctly!
        */
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
