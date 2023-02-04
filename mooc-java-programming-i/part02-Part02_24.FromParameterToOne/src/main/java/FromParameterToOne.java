

public class FromParameterToOne {

    public static void main(String[] args) {
        /*
        Create the following method in the exercise template: public static void printFromNumberToOne(int number).
        It should print the numbers from the number passed as a parameter down to one. Two examples of the method's usage are given below.

        public static void main(String[] args) {
            printFromNumberToOne(5);
        }
        Sample output
        5
        4
        3
        2
        1

        public static void main(String[] args) {
            printFromNumberToOne(2);
        }
        Sample output
        2
        1
        */

        printFromNumberToOne(5);

    }

    public static void printFromNumberToOne (int number){
        for (int i = 1 ; i <= number; number--){
            System.out.println(number);
        }
    }
}
