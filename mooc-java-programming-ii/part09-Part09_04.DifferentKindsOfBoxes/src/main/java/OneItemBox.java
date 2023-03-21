import java.util.ArrayList;

public class OneItemBox extends Box{
    private ArrayList<Item> singleItem;
    

    public OneItemBox(){
        this.singleItem = new ArrayList<>();
    }

    @Override
    public void add(Item item){
        if (this.singleItem.isEmpty()){
            singleItem.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item){
        return singleItem.contains(item);
    }


}
