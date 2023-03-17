import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> facility;

    public StorageFacility(){
        this.facility = new HashMap<>();
    }

    public void add(String unit, String item){
        ArrayList<String> items = new ArrayList<>();

        if (!(this.facility.containsKey(unit))){
            items.add(item);
            this.facility.put(unit, items);
        } else {
            facility.get(unit).add(item);
        }

    }
    
    public ArrayList<String> contents(String storageUnit){
        if(this.facility.containsKey(storageUnit)){
            return facility.get(storageUnit);
        }
        return new ArrayList<>();
    }

    public void remove(String storageUnit, String item){
        if (this.facility.containsKey(storageUnit)){
            this.facility.get(storageUnit).remove(item);
            if (this.facility.get(storageUnit).isEmpty()){
                this.facility.remove(storageUnit);
            }
        }
    }

    public ArrayList<String> storageUnits(){
        ArrayList<String> storageUnits = new ArrayList<>();
        for(String unit: this.facility.keySet()){
            storageUnits.add(unit);
        }
        return storageUnits;
    }
}
