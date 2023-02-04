import java.util.ArrayList;

public class Items {
    private String identifier;
    private String name;

    public Items(String identifier, String name){
        this.identifier = identifier;
        this.name = name;
    }

    public String getIdentifier(){
        return this.identifier;
    }

    public String getName(){
        return this.name;
    }

    public boolean equals(Object toCompare){
        if (this == toCompare){
            return true;
        }

        if (!(toCompare instanceof Items)){
            return false;
        }

        Items itemToCompare = (Items) toCompare;

        return this.identifier.equals(itemToCompare.identifier);
    }

    @Override
    public String toString(){
        return this.identifier+": "+this.name;
    }
    
}
