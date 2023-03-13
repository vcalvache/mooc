public class Container {
    private int capacity;

    public Container(){
        this.capacity = 0;
    }

    public int contains(){
        return this.capacity;
    }

    public void add(int amount){
        if (amount >0){
            this.capacity += amount;
            if (capacity > 100){
                this.capacity = 100;
            }
        }
    }
    
    public void remove(int amount){
        if (amount > 0){
            this.capacity -= amount;
            if (capacity < 0){
                this.capacity = 0;
            }
        }
    }
    @Override
    public String toString(){
        return (this.capacity +"/100");
    }
}
