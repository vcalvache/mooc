public class Container {
    private int capacity;

    public Container(){
        this.capacity = 0;
    }

    public int getQuantity(){
        return capacity;
    }
    public void setQuantity(int quantity){
        this.capacity = quantity;
    }

    public void add(int quantity){
        if (quantity > 0){
            this.capacity +=quantity;
        }
        if (capacity >100){
            this.capacity = 100;
        }
    }

    public void move(int quantity, Container secondContainer){
        if (quantity > 0){
            if(quantity > this.capacity){
                int difference = this.capacity;
                this.capacity = 0;
                secondContainer.add(difference);
            } else {
                this.capacity -= quantity;
                secondContainer.add(quantity);
            }
        }
    }

    public void remove(int quantity, Container secondContainer){
        if (quantity > 0){
            secondContainer.setQuantity(secondContainer.getQuantity() - quantity);
            if (secondContainer.getQuantity() < 0){
                secondContainer.setQuantity(0);
            }
        }
    }
}