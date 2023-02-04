
public class Averaging {

    // implement the sum method here again
    public static int sum(int number1, int number2, int number3, int number4) {
        // write some code here
        return number1+number2+number3+number4;
    }

    public static double average(int number1, int number2, int number3, int number4) {
        //write some code here
        double average = sum(number1, number2, number3, number4);
        return average/4;
    }

    public static void main(String[] args) {

        /*
        Create a method called average that calculates the average of the numbers passed as parameters.
        The previously created method sum must be used inside this method!

        Define the method in the following template:

        public static int sum(int number1, int number2, int number3, int number4) {
            // you can copy your implementation of the method sum here
        }

        public static double average(int number1, int number2, int number3, int number4) {
            // write your code here
            // calculate the sum of the elements by calling the method sum
        }

        public static void main(String[] args) {
            double result = average(4, 3, 6, 1);
            System.out.println("Average: " + result);
        }
        The output of the program:

        Sample output
        Average: 3.5

        Make sure to remember how to convert an integer (int) into a decimal number (double)!
        */
        double result = average(4, 3, 6, 1);
        System.out.println("Average: " + result);
    }
}
