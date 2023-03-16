In this exercise we create a program for printing statistics for points in course. The program receives points (integers from zero to one hundred) as input, based on which it prints statistics about grades. Reading of input stops when the user enters the number -1. Numbers that are not within the interval [0-100] should not be taken into account when calculating the statistics.

A string read from the user can be converted to an integer using the Integer class' method valueOf. It works as follows:

    String numberAsString = "3";
    int number = Integer.valueOf(numberAsString);

    System.out.println(numberAsString + 7);
    System.out.println(number + 7);

    Sample output
    37
    10

Part 1: Point averages
Write a program that reads integers representing course point totals from the user. Numbers between [0-100] are acceptable and the number -1 ends the reading of input. Other numbers are erroneous input, which should be ignored. When the user enters the number -1, the program should print the average of the point totals that were input.

    Sample output
    Enter point totals, -1 stops:
    -42
    24
    42
    72
    80
    52
    -1
    Point average (all): 54.0

    Sample output
    Enter point totals, -1 stops:
    50
    51
    52
    -1
    Point average (all): 51.0

Part 2: Point average for points giving a passing grade
Extend the program, such that it in addition to giving the point average of all totals also provides the point average for points giving a passing grade.

A passing grade is achieved by getting a minimum of 50 course points. You may assume that the user always provides at least one integer between [0-100]. If there are no numbers giving a passing grade, the program should print a line "-" where the average would be.

    Sample output
    Enter point totals, -1 stops:
    -42
    24
    42
    72
    80
    52
    -1
    Point average (all): 54.0
    Point average (passing): 68.0

    Sample output
    Enter point totals, -1 stops:
    49
    48
    47
    -1
    Point average (all): 48.0
    Point average (passing): -

Part 3: Pass percentage
Extend the program from the previous part, such that it also print the pass percentage. The pass percentage is calculated using the formula 100 * passing / participants.

    Sample output
    Enter point totals, -1 stops:
    49
    48
    47
    -1
    Point average (all): 48.0
    Point average (passing): -
    Pass percentage: 0.0

    Sample output
    Enter point totals, -1 stops:
    102
    -4
    33
    77
    99
    1
    -1
    Point average (all): 52.5
    Point average (passing): 88.0
    Pass percentage: 50.0

Part 4: Grade distribution
Extend the program, such that it also prints the grade distribution. The grade distribution is as follows:

    points	grade
    < 50	failed, i.e. 0
    < 60	1
    < 70	2
    < 80	3
    < 90	4
    >= 90	5

Each point total is converted to a grade based on the above table. If a point total isn't within [0-100], it should be ignored.

The grade distribution is printed out as stars. E.g. if there is one point total giving the grade 5, then it should print the row 5: *. If there are no point totals giving a particular grade, then no stars should be printed for it. In the sample below this is true for e.g. the grade 4.

    Sample output
    Enter point totals, -1 stops:
    102
    -2
    1
    33
    77
    99
    -1
    Point average (all): 52.5
    Point average (passing): 88.0
    Pass percentage: 50.0
    Grade distribution:
    5: *
    4:
    3: *
    2:
    1:
    0: **