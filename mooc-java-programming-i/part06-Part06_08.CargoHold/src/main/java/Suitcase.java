import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> suitcaseContent;
    private int maxWeight;

    public Suitcase(int maxWeight){
        this.maxWeight = maxWeight;
        this.suitcaseContent = new ArrayList<>();
    }

    public void addItem(Item itemToAdd){
       if (itemToAdd.getWeight() + totalWeight() <= this.maxWeight){
        suitcaseContent.add(itemToAdd);
       }
    }

    public int totalWeight(){
        int totalWeight = 0;
        for (Item item: this.suitcaseContent){
            totalWeight += item.getWeight();
        }

        return totalWeight;
    }

    public void printItems(){
        for (Item item: this.suitcaseContent){
            System.out.println(item.getName()+" ("+ item.getWeight()+" kg)");
        }
    }

    public Item heaviestItem(){
        if (suitcaseContent.isEmpty()){
            return null;
        }

        Item heaviestItem = suitcaseContent.get(0);
        for(Item item: suitcaseContent){
            if (heaviestItem.getWeight() < item.getWeight()){
                heaviestItem = item;
            }
        }
        return heaviestItem;

    }

    @Override
    public String toString(){

        if (suitcaseContent.size() == 0){
            return "no items (0 kg)";
        } else if  (suitcaseContent.size() == 1){
            return  "1 item (" +  totalWeight() + " kg)";
        } else {
            return suitcaseContent.size() + " items (" +  totalWeight() + " kg)";
        }
    }
}
