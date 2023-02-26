The exercise template has a predefined SimpleCollection class, which is used to represent a group of values. The class is missing the toString method used for printing.

Implement a toString method for the class that will perform as demonstrated in the following examples.

    SimpleCollection s = new SimpleCollection("alphabet");
    System.out.println(s);

    System.out.println();

    s.add("a");
    System.out.println(s);

    System.out.println();

    s.add("b");
    System.out.println(s);

    System.out.println();

    s.add("c");
    System.out.println(s);

    Sample output
        The collection alphabet is empty.

        The collection alphabet has 1 element:
        a

        The collection alphabet has 2 elements:
        a
        b

        The collection alphabet has 3 elements:
        a
        b
        c

    SimpleCollection s = new SimpleCollection("characters");
    System.out.println(s);

    System.out.println();

    s.add("magneto");
    System.out.println(s);

    System.out.println();

    s.add("mystique");
    System.out.println(s);

    System.out.println();

    s.add("phoenix");
    System.out.println(s);

    Sample output
        The collection characters is empty.

        The collection characters has 1 element:
        magneto

        The collection characters has 2 elements:
        magneto
        mystique

        The collection characters has 3 elements:
        magneto
        mystique
        phoenix