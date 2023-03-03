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

        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}