
public class Main {

    public static void main(String[] args) {

        /*
        In the exercise base there is a class called Song that can be used to create new objects that represent songs.
        Add to that class the equals method so that the similarity of songs can be examined.

        Song jackSparrow = new Song("The Lonely Island", "Jack Sparrow", 196);
        Song anotherSparrow = new Song("The Lonely Island", "Jack Sparrow", 196);

        if (jackSparrow.equals(anotherSparrow)) {
            System.out.println("Songs are equal.");
        }

        if (jackSparrow.equals("Another object")) {
            System.out.println("Strange things are afoot.");
        }
        Sample output
        Songs are equal
        */
        
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
