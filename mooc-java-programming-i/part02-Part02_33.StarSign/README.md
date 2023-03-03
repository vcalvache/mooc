Part 1: Printing stars
Define a method called printStars that prints the given number of stars and a line break.

Write the method in the following template:

    public static void printStars(int number) {
        // you can print one star with the command
        // System.out.print("*");
        // call the print command n times
        // in the end print a line break with the comand
        // System.out.println("");
    }

    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);
    }

The output of the program:

    Sample output

        *****
        ***
        *********

N.B multipart exercises can be uploaded to the server (click the button to the right of the testing button) even if some parts are unfinished. In this case the server will complain about the tests for the parts that haven't been completed, but it will mark down the finished parts.

Part 2: Printing a square
Define a method called printSquare(int size) that prints a suitable square with the help of the printStars method. So the method call printSquare(4) results in the following output:

    Sample output

        ****
        ****
        ****
        ****

N.B.: producing the correct output is not enough; the rows of the square must be produced by calling the printStars method inside the printSquaremethod.

When creating the program, you can use the code in the main to test that the methods behave as required.

Part 3: Printing a rectangle
Write a method called printRectangle(int width, int height) that prints the correct rectangle by using the printStars method. So the method call printRectangle(17, 3) should produce the following output:

    Sample output

        *****************
        *****************
        *****************

Part 4: Printing a triangle
Create a method called printTriangle(int size) that prints a triangle by using the printStars method. So the call printTriangle(4) should print the following:

    Sample output

        *
        **
        ***
        ****