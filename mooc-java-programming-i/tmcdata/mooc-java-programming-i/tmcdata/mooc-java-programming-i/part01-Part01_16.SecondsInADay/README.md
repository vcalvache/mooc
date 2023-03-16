In the exercise template, implement a program that asks the user for the number of days. After that, the program prints the number of seconds in the given number of days.

Earlier we learned to read an integer in the following manner:

    Scanner scanner = new Scanner(System.in);

    System.out.println("Give a number:");
    int number = Integer.valueOf(scanner.nextLine());
    System.out.println("You gave " + number);

Examples of expected output:

    Sample output
        How many days would you like to convert to seconds?
        1
        86400

    Sample output
        How many days would you like to convert to seconds?
        3
        259200

    Sample output
        How many days would you like to convert to seconds?
        7
        604800