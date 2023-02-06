import java.util.ArrayList;

public class Stack {
    private ArrayList<String> stackList;

    public Stack(){
        this.stackList = new ArrayList<String>();
    }

    public boolean isEmpty(){
        if(this.stackList.isEmpty()){
            return true;
        } else {
            return false;
        }
    }

    public void add(String value){
        this.stackList.add(value);
    }

    public ArrayList<String> values(){
        ArrayList<String> copiedList = this.stackList;
        return copiedList;
    }

    public String take(){
        String lastAdded = this.stackList.get(this.stackList.size()-1);
        this.stackList.remove(this.stackList.size()-1);
        return lastAdded;
    }
    
    
}
