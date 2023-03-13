import java.util.HashMap;

public class IOU {
    private HashMap<String ,Double> iOwe;

    public IOU(){
        this.iOwe = new HashMap<>();

    }

    public void setSum(String toWhom, double amount){
        this.iOwe.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom){
        double debt = 0;
        for (String person: iOwe.keySet()){
            if (person.equals(toWhom)){
                debt = iOwe.get(person);
            }
        }
        return debt;
    }
    
}
