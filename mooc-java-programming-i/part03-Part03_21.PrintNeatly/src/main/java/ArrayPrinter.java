
public class ArrayPrinter {

    public static void main(String[] args) {

        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        // Write some code in here
        int size = array.length;
        for (int i = 0; i < array.length; i++){
            if (i == size -1) {
                System.out.println(array[i] );
            } else {
                System.out.print(array[i] +", ");
            }    
        }
    }
}