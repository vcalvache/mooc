
public class Main {

    public static void main(String[] args) {

        /*
        In this exercise, we create the classes Item, Suitcase and Hold to practise the use of objects containing other objects.

        Part 1: Item-class
        Create an Item class from which objects can be instantiated to represent different items.
        The information to store is the name and weight of the item (kg).

        Add the following methods to the class:

        - Constructor that takes the name and the weight of the item as parameters
        - Method public String getName(), which returns the item's name
        - Method public int getWeight(), which returns the item's weight
        - Method public String toString(), which returns the string "name (weight kg)"

        The following is an example of the class in use:

            public class Main {
                public static void main(String[] args) {
                    Item book = new Item("The lord of the rings", 2);
                    Item phone = new Item("Nokia 3210", 1);

                    System.out.println("The book's name: " + book.getName());
                    System.out.println("The book's weight: " + book.getWeight());

                    System.out.println("Book: " + book);
                    System.out.println("Phone: " + phone);
                }
            }
        The program's print output should be the following:

            Sample output
            The book's name: Lord of the rings
            The book's weight: 2
            Book: Lord of the rings (2 kg)
            Phone: Nokia 3210 (1 kg)

        Part 2: Suitcase-class
        Create a Suitcase class. The suitcase has items and a maximum weight that determines the maximum
        total weight of the items.

        Add the following methods to the class:

        - Constructor, to which the maximum weight is provided
        - The method public void addItem(Item item), which adds the item passed as a parameter to the suitcase. The method does not return a value.
        - The method public String toString(), which returns the string "x items (y kg)"

        It's advisable to store the items in an ArrayList object:

            ArrayList<Item> items = new ArrayList<>();

        The class Suitcase should ensure that the total weight of the items within it does not exceed
        the maximum weight limit. If that limit would be exceeded as a result of the item to be added,
        the method addItem should not add the new item to the suitcase.

        The following is an example use case of the class:

            public class Main {
                public static void main(String[] args) {
                    Item book = new Item("Lord of the rings", 2);
                    Item phone = new Item("Nokia 3210", 1);
                    Item brick = new Item("brick", 4);

                    Suitcase suitcase = new Suitcase(5);
                    System.out.println(suitcase);

                    suitcase.addItem(book);
                    System.out.println(suitcase);

                    suitcase.addItem(phone);
                    System.out.println(suitcase);

                    suitcase.addItem(brick);
                    System.out.println(suitcase);
                }
            }
        The program's output should be the following:

            Sample output
            0 items (0 kg)
            1 items (2 kg)
            2 items (3 kg)
            2 items (3 kg)

        Part 3: Language Formatting
        The statement "1 items" is not exactly proper English — a better form would be "1 item".
        The lack of items could also be expressed as "no items".
        Implement this change to the toString method of the Suitcase class.

        The output of the previous program should now look as follows:

            Sample output
            no items (0 kg)
            1 item (2 kg)
            2 items (3 kg)
            2 items (3 kg)

        Part 4: All items
        Add the following methods to the Suitcase class:

        - a printItems method, which prints all the items in the suitcase
        - a totalWeight method, which returns the total weight of the items

        The following is an example use case of the class:

            public class Main {
                public static void main(String[] args) {
                    Item book = new Item("Lord of the rings", 2);
                    Item phone = new Item("Nokia 3210", 1);
                    Item brick = new Item("brick", 4);

                    Suitcase suitcase = new Suitcase(10);
                    suitcase.addItem(book);
                    suitcase.addItem(phone);
                    suitcase.addItem(brick);

                    System.out.println("The suitcase contains the following items:");
                    suitcase.printItems();
                    System.out.println("Total weight: " + suitcase.totalWeight() + " kg");
                }
            }
        The program's output should be the following:

            Sample output
            The suitcase contains the following items:
            Lord of the rings (2 kg)
            Nokia 3210 (1 kg)
            Brick (4 kg)
            Total Weight: 7 kg

        Make a further modification to your class so that you only use two instance variables.
        One holds the maximum weight, the other is the list of items in the suitcase.

        Part 5: Heaviest item
        Add to the Suitcase class a heaviestItem method, which returns the largest item based on weight.
        If several items share the heaviest weight, the method can return any one of them.
        The method should return an object reference. If the suitcase is empty, return the value null.

        The following is an example of the class in use:

            public class Main {
                public static void main(String[] args) {
                    Item book = new Item("Lord of the rings", 2);
                    Item phone = new Item("Nokia 3210", 1);
                    Item brick = new Item("Brick", 4);

                    Suitcase suitcase = new Suitcase(10);
                    suitcase.addItem(book);
                    suitcase.addItem(phone);
                    suitcase.addItem(brick);

                    Item heaviest = suitcase.heaviestItem();
                    System.out.println("Heaviest item: " + heaviest);
                }
            }
        The program should print the following:

            Sample output
            Heaviest item: Brick (4 kg)

        Part 6: Hold-class
        Make a Hold class with the following methods:

        - a constructor, to which the maximum weight is given
        - method public void addSuitcase(Suitcase suitcase) that adds the specified luggage to the hold
        - method public String toString() that returns the string "x suitcases (y kg)"

        Store your suitcases in a suitable ArrayList structure.

        The class Hold has to ensure that the total weight of the suitcases it contains does not exceed the maximum weight.
        Should the maximum weight be exceeded due to the addition of new luggage,
        the addSuitcase method should not add the new suitcase.

        The following is an example of the class in use:

            public class Main {
                public static void main(String[] args) {
                    Item book = new Item("Lord of the rings", 2);
                    Item phone = new Item("Nokia 3210", 1);
                    Item brick = new Item("brick", 4);

                    Suitcase adasCase = new Suitcase(10);
                    adasCase.addItem(book);
                    adasCase.addItem(phone);

                    Suitcase pekkasCase = new Suitcase(10);
                    pekkasCase.addItem(brick);

                    Hold hold = new Hold(1000);
                    hold.addSuitcase(adasCase);
                    hold.addSuitcase(pekkasCase);

                    System.out.println(hold);
                }
            }
        The program's output should be the following:

        Sample output
        2 suitcases (7 kg)

        Part 7: The Hold's Contents
        Add to the Hold class the method public void printItems() that prints all the items contained in the hold's suitcases.

        The following is an example of the class in use:

            public class Main {
                public static void main(String[] args) {
                    Item book = new Item("Lord of the rings", 2);
                    Item phone = new Item("Nokia 3210", 1);
                    Item brick = new Item("brick", 4);

                    Suitcase adasCase = new Suitcase(10);
                    adasCase.addItem(book);
                    adasCase.addItem(phone);

                    Suitcase pekkasCase = new Suitcase(10);
                    pekkasCase.addItem(brick);

                    Hold hold = new Hold(1000);
                    hold.addSuitcase(adasCase);
                    hold.addSuitcase(pekkasCase);

                    System.out.println("The suitcases in the hold contain the following items:");
                    hold.printItems();
                }
            }
        The program's output should be as follows:

            Sample output
            The suitcases in the hold contain the following items:
            Lord of the rings (2 kg)
            Nokia 3210 (1 kg)
            brick (4 kg)
        */

        // You can use the main to test your classes!

        Item book = new Item("Lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);
        Item brick = new Item("brick", 4);

        Suitcase adasCase = new Suitcase(10);
        adasCase.addItem(book);
        adasCase.addItem(phone);

        Suitcase pekkasCase = new Suitcase(10);
        pekkasCase.addItem(brick);

        Hold hold = new Hold(1000);
        hold.addSuitcase(adasCase);
        hold.addSuitcase(pekkasCase);

        System.out.println("The suitcases in the hold contain the following items:");
        hold.printItems();
    }
}
