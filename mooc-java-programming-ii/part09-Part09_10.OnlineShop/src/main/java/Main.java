import java.util.WeakHashMap;

public class Main {

    public static void main(String[] args) {
        // Test your app here
        Warehouse warehouse = new Warehouse();
        warehouse.addProduct("milk", 3, 10);
        warehouse.addProduct("chocolate", 20, 5);

        System.out.println("Prices:");
        System.out.println("milk:  " + warehouse.price("milk"));
        System.out.println("sugar: " +warehouse.price("sugar"));

        System.out.println("Stock:");
        System.out.println("milk:" + warehouse.stock("milk"));
        warehouse.take("milk");
        warehouse.take("milk");
        System.out.println("milk:" + warehouse.stock("milk"));
        System.out.println("coffee:" + warehouse.stock("coffee"));
        System.out.println("list:");
        System.out.println(warehouse.products());
        System.out.println();
        System.out.println();
        Item item = new Item("milk", 4, 2);
        System.out.println("an item that contains 4 milks has the total price of " + item.price());
        System.out.println(item);
        item.increaseQuantity();
        System.out.println(item);

    }
}
