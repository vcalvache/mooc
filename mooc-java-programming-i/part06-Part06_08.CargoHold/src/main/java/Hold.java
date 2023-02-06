import java.util.ArrayList;

public class Hold {
    private ArrayList<Suitcase> toHold;
    private int maximumWeight;

    public Hold(int maximumWeight){
        this.maximumWeight = maximumWeight;
        this.toHold = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase){
        if (suitcase.totalWeight() + weightToHold() <= this.maximumWeight){
            toHold.add(suitcase);
        }
    }

    public int weightToHold(){
        int weightToHold = 0;
        for (Suitcase suitcase: this.toHold){
            weightToHold += suitcase.totalWeight();
        }
        return weightToHold;

    }

    public void printItems(){
        for (Suitcase suitcase: this.toHold){
            suitcase.printItems();
        }
    }

    public String toString(){
        int weightToHold = 0;
        for (Suitcase suitcase: toHold){
            weightToHold += suitcase.totalWeight();
        }
        return this.toHold.size()+" suitcases (" + weightToHold + " kg)";
    }
    
}
