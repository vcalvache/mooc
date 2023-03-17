
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public int getRooms(){
        return this.rooms;
    }

    public int getSquares(){
        return this.squares;
    }

    public int getPricePerSquare(){
        return this.princePerSquare;
    }

    public boolean largerThan(Apartment compared){
        if (getSquares() < compared.getSquares()){
            return false;
        }
        return true;
    }

    public int obtainTotalPrice(){
        return squares * princePerSquare;
    }

    public int priceDifference(Apartment compared){
        int priceDifference = (obtainTotalPrice() - compared.obtainTotalPrice());
        if (priceDifference < 0){
            priceDifference *= -1;
        }
        return priceDifference;
    }

    public boolean moreExpensiveThan (Apartment compared){
        if (obtainTotalPrice() < compared.obtainTotalPrice()){
            return false;
        }
        return true;
    }

}
