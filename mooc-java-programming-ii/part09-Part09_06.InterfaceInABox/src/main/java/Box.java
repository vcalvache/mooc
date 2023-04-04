import java.util.ArrayList;

public class Box implements Packable{
    private double capacity;
    private double weight;
    private ArrayList<Packable> items;

    public Box (double capacity){
        this.capacity = capacity;
        this.weight = 0;
        this.items = new ArrayList<>();
    }

    public void add(Packable packable){
        if (weight + packable.weight() < capacity){
            items.add(packable);
            this.weight += packable.weight();
        }
    }

    public double weight(){
        double weight = 0;
        for (Packable item: items){
            weight += item.weight();
        }
        return weight;
    }

    public String toString(){
        return "Box: " + items.size() + " items, total weight " + weight + " kg";
    }
    
}
