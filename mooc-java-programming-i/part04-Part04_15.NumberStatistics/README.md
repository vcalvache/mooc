Part 1: Count
Create a class Statistics that has the following functionality (the file for the class is provided in the exercise template):

    * a method addNumber adds a new number to the statistics
    * a method getCount tells the number of added numbers

The class does not need to store the added numbers anywhere, it is enough for it to remember their count. At this stage, the addNumber method can even neglect the numbers being added to the statistics, since the only thing being stored is the count of numbers added.

The method's body is the following:

    public class Statistics {
        private int count;

        public Statistics() {
            // initialize the variable numberCount here
        }

        public void addNumber(int number) {
            // write code here
        }

        public int getCount() {
            // write code here
        }
    }

The following program introduces the class' use:

    public class MainProgram {
        public static void main(String[] args) {
            Statistics statistics = new Statistics();
            statistics.addNumber(3);
            statistics.addNumber(5);
            statistics.addNumber(1);
            statistics.addNumber(2);
            System.out.println("Count: " + statistics.getCount());
        }
    }

The program prints the following:

    Sample output
        Count: 4

Part 2: Sum and average
Expand the class with the following functionality:

    * the sum method tells the sum of the numbers added (the sum of an empty number statistics object is 0)
    * the average method tells the average of the numbers added (the average of an empty number statistics object is 0

The class' template is the following:

    public class Statistics {
        private int count;
        private int sum;

        public Statistics() {
            // initialize the variables count and sum here
        }

        public void addNumber(int number) {
            // write code here
        }

        public int getCount() {
            // write code here
        }

        public int sum() {
            // write code here
        }

        public double average() {
            // write code here
        }
    }

The following program demonstrates the class' use:

    public class Main {
        public static void main(String[] args) {
            Statistics statistics = new Statistics();
            statistics.addNumber(3);
            statistics.addNumber(5);
            statistics.addNumber(1);
            statistics.addNumber(2);
            System.out.println("Count: " + statistics.getCount());
            System.out.println("Sum: " + statistics.sum());
            System.out.println("Average: " + statistics.average());
        }
    }

The program prints the following:

    Sample output
    Count: 4
    Sum: 11
    Average: 2.75

Part 3: Sum of user input
Write a program that asks the user for numbers until the user enters -1. The program will then provide the sum of the numbers.

The program should use a Statistics object to calculate the sum.

NOTE: Do not modify the Statistics class in this part. Instead, implement the program for calculating the sum by making use of it.

    Sample output
        Enter numbers:
        4
        2
        5
        4
        -1
        Sum: 15

Part 4: Multiple sums
Change the previous program so that it also calculates the sum of even and odd numbers.

NOTE: Define three Statistics objects in the program. Use the first to calculate the sum of all numbers, the second to calculate the sum of even numbers, and the third to calculate the sum of odd numbers.

For the test to work, the objects must be created in the main program in the order they were mentioned above (i.e., first the object that sums all the numbers, then the one that sums the even ones, and then finally the one that sums the odd numbers)!

NOTE: Do not change the Statistics class in any way!

The program should work as follows:

    Sample output
        Enter numbers:
        4
        2
        5
        2
        -1
        Sum: 13
        Sum of even numbers: 8
        Sum of odd numbers: 5