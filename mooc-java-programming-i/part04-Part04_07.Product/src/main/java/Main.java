
public class Main {

    public static void main(String[] args) {
        /*
        Create a class Product that represents a store product.
        The product should have a price (double), a quantity (int) and a name (String).

        The class should have:

        the constructor public Product (String initialName, double initialPrice, int initialQuantity)
        a method public void printProduct() that prints product information in the following format:
        Sample output
        Banana, price 1.1, 13 pcs

        The output above is based on the product being assigned the name banana, with a price of 1.1, and a quantity of 13 .
        */

        // This is an empty main method for testing the Product class
        // Try:

        Product product = new Product("Banana", 1.1, 13);
        product.printProduct();
    }
}
