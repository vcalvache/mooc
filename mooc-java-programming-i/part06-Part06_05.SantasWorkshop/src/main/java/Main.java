
public class Main {

    public static void main(String[] args) {

        // use this main method to try out your classes!

        Gift book = new Gift("Harry Potter", 2);
        System.out.println(book.getName());
        System.out.println(book.getWeight());
        System.out.println(book);
        Gift anotherBook = new Gift("Dune", 4);
        Package pack = new Package();
        pack.addGift(book);
        pack.addGift(anotherBook);
        System.out.println(pack.totalWeight());

    }
}
