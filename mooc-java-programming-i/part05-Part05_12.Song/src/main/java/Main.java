
public class Main {

    public static void main(String[] args) {

        // you can write code here for testing your program

        Song jackSparrow = new Song("The Lonely Island", "Jack Sparrow", 196);
        Song anotherSparrow = new Song("The Lonely Island", "Jack Sparrow", 196);
        Song thirdSparrow = new Song("Turbonegro", "Age of pamparius", 230);

        if (jackSparrow.equals(anotherSparrow)) {
            System.out.println("Songs are equal.");
        }

        if (jackSparrow.equals(thirdSparrow)) {
            System.out.println("Strange things are afoot.");
        } else {
            System.out.println("not equals");
        }
    }
}