In the estate agent's information system, an apartment that is on sale is represented by an object that is instantiated from the following class:

    public class Apartment {
        private int rooms;
        private int squares;
        private int pricePerSquare;

        public Apartment(int rooms, int squares, int pricePerSquare) {
            this.rooms = rooms;
            this.squares = squares;
            this.pricePerSquare = pricePerSquare;
        }
    }

Your task is to create a few methods that can be used to compare apartments that are being sold.

Part 1: Comparing sizes
Create a method public boolean largerThan(Apartment compared) that returns true if the apartment object whose method is called has a larger total area than the apartment object that is being compared.

An example of how the method should work:

    Apartment manhattanStudioApt = new Apartment(1, 16, 5500);
    Apartment atlantaTwoBedroomApt = new Apartment(2, 38, 4200);
    Apartment bangorThreeBedroomApt = new Apartment(3, 78, 2500);

    System.out.println(manhattanStudioApt.largerThan(atlantaTwoBedroomApt));       // false
    System.out.println(bangorThreeBedroomApt.largerThan(atlantaTwoBedroomApt));  // true

Part 2: Price difference
Create a method public int priceDifference(Apartment compared) that returns the price difference of the apartment object whose method was called and the apartment object received as the parameter. The price difference is the absolute value of the difference of the prices (price can be calculated by multiplying the price per square by the number of squares).

An example of how the method should work:

    Apartment manhattanStudioApt = new Apartment(1, 16, 5500);
    Apartment atlantaTwoBedroomApt = new Apartment(2, 38, 4200);
    Apartment bangorThreeBedroomApt = new Apartment(3, 78, 2500);

    System.out.println(manhattanStudioApt.priceDifference(atlantaTwoBedroomApt));  //71600
    System.out.println(bangorThreeBedroomApt.priceDifference(atlantaTwoBedroomApt));   //35400

Part 3: More expensive?
Write a method public boolean moreExpensiveThan(Apartment compared) that returns true if the apartment object whose method is called is more expensive than the apartment object being compared.

An example of how the method should work:

    Apartment manhattanStudioApt = new Apartment(1, 16, 5500);
    Apartment atlantaTwoBedroomApt = new Apartment(2, 38, 4200);
    Apartment bangorThreeBedroomApt = new Apartment(3, 78, 2500);

    System.out.println(manhattanStudioApt.moreExpensiveThan(atlantaTwoBedroomApt));  // false
    System.out.println(bangorThreeBedroomApt.moreExpensiveThan(atlantaTwoBedroomApt));   // true