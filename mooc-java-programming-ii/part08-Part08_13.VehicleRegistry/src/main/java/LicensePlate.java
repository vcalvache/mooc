
import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }

        if (!(obj instanceof LicensePlate)){
            return false;
        }

        LicensePlate toCompare = (LicensePlate) obj;
        if (this.liNumber.equals(toCompare.liNumber) &&
            this.country.equals(toCompare.country)){
                return true;
            }

        return false;
    }

    @Override
    public int hashCode(){
        return this.liNumber.hashCode();
    }
}
