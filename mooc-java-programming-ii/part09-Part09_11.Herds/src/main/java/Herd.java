import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable{

    private List<Movable> herdList;

    public Herd(){
        this.herdList = new ArrayList<Movable>();
    }

    @Override
    public String toString(){
        String string = "";
        for(Movable movable: herdList){
            string += movable.toString()+"\n";
        }
        return string;
    }

    public void addToHerd(Movable movable){
        herdList.add(movable);
    }

    public void move(int dx, int dy){
        for(Movable movable: herdList){
            movable.move(dx, dy);
        }
    }
    
}
