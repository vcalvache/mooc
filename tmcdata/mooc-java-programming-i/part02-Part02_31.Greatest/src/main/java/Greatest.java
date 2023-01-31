
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        //write some code here
        if (number1 >= number2 && number1 >= number3){
            return number1;
        } else if (number2 >= number1 && number2 >= number3){
            return number2;
        } else if (number3 >= number1 && number3 >= number2){
            return number3;
        }

        return -1;
    }

    public static void main(String[] args) {

        /*
        Define a method called greatest that takes three numbers and returns the greatest of them. If there are multiple greatest values, returning one of them is enough. Printing will take place in the main program.

        public static int greatest(int number1, int number2, int number3) {
        // write some code here
        }

        public static void main(String[] args) {
        int answer =  greatest(2, 7, 3);
        System.out.println("Greatest: " + answer);
        }
        The output of the program:

        Sample output
        Greatest: 7
        */
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
