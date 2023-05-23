

public class Main {

    public static void main(String[] args) {
        // Use this main program for testing your classes!

        Item firstItem = new Item("ps5", 5);
        Item secondItem = new Item("iphone", 1);

        Suitcase suitcase = new Suitcase(7);
        Suitcase secondSuitcase = new Suitcase(12);

        Item anotherItem = new Item("laptop", 4);
        secondSuitcase.addItem(anotherItem);

        suitcase.addItem(firstItem);
        suitcase.addItem(secondItem);

        System.out.println(suitcase.totalWeight());
        suitcase.printItems();
        System.out.println("-------");

        Hold cargo = new Hold(120);
        cargo.addSuitcase(suitcase);
        cargo.addSuitcase(secondSuitcase);
        System.out.println(cargo.totalWeight());
        cargo.printItems();
    }

}
