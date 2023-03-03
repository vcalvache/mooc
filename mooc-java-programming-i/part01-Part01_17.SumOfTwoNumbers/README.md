Write a program that asks the user for two numbers. After this, the program prints the sum of the numbers given by the user.

When you ask for multiple numbers, create a separate variable for each:

    Scanner scanner = new Scanner(System.in);

    System.out.println("Give the first number:");
    int first = Integer.valueOf(scanner.nextLine());
    System.out.println("Give the second number:");
    int second = Integer.valueOf(scanner.nextLine());

    // do something with the numbers

Here's how the program is expected to work:

    Sample output
        Give the first number:
        8
        Give the second number:
        3
        The sum of the numbers is 11

    Sample output
        Give the first number:
        3
        Give the second number:
        -1
        The sum of the numbers is 2