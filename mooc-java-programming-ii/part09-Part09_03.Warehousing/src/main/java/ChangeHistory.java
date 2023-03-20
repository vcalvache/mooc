import java.util.ArrayList;

public class ChangeHistory {

    private ArrayList<Double> changeHistory;

    public ChangeHistory(){
        this.changeHistory = new ArrayList<>();
    }

    public void add(double status){
        this.changeHistory.add(status);
    }

    public void clear(){
        this.changeHistory.clear();
    }

    public double getLastBalance(){
        return changeHistory.get(changeHistory.size()-1);
    }

    public double maxValue(){
        double maxValue = changeHistory.get(0);

        if (changeHistory.isEmpty()){
            return 0;
        } else {
            for (Double value: changeHistory){
                if (value > maxValue){
                    maxValue = value;
                }
            }
        }
        return maxValue;
    }

    public double minValue(){
        double minValue = changeHistory.get(0);

        if (changeHistory.isEmpty()){
            return 0;
        } else {
            for (Double value: changeHistory){
                if (value < minValue){
                    minValue = value;
                }
            }
        }
        return minValue;
    }

    public double average(){
        double sum = 0;

        for(int i = 0; i < changeHistory.size(); i++){
            sum += changeHistory.get(i);
        }

        return sum/(changeHistory.size());
    }

    @Override
    public String toString(){
        return changeHistory.toString();
    }
}
