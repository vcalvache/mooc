public class Item {
    private String itemName;
    private int itemWeight;

    public Item (String name, int weigth){
        this.itemName = name;
        this.itemWeight = weigth;
    }

    public String getName(){
        return this.itemName;
    }

    public int getWeight(){
        return this.itemWeight;
    }
    @Override
    public String toString(){
        return this.itemName +" (" + this.itemWeight +" kg)";
    }
}
