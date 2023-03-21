import java.util.ArrayList;

public class BoxWithMaxWeight extends Box{
    private ArrayList<Item> items;
    private int capacity;

    public BoxWithMaxWeight(int capacity){
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    public int currentWeight(){
        int weight = 0;
        for (Item item: items){
            weight += item.getWeight();
        }
        return weight;
    }

    @Override
    public void add(Item item){
        if (currentWeight() + item.getWeight() <= this.capacity){
            items.add(item);
        }
    }
    
    public boolean isInBox(Item item){
        return items.contains(item);
    }
}
