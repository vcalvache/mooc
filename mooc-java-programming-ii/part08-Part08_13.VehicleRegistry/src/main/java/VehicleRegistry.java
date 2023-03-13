import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> vehicleRegistry;

    public VehicleRegistry(){
        this.vehicleRegistry = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner){
        if (this.vehicleRegistry.containsKey(licensePlate)){
            return false;
        } else {
            this.vehicleRegistry.put(licensePlate, owner);
            return true;
        }
    }

    public String get(LicensePlate licensePlate){
        if (!(this.vehicleRegistry.containsKey(licensePlate))){
            return null;
        } else {
            return this.vehicleRegistry.get(licensePlate);
        }
    }

    public boolean remove(LicensePlate licensePlate){
        if (this.vehicleRegistry.containsKey(licensePlate)){
            this.vehicleRegistry.remove(licensePlate);
            return true;
        } 
        return false;
    }

    public void printLicensePlates(){
        for (LicensePlate licensePlate: this.vehicleRegistry.keySet()){
            System.out.println(licensePlate);
        }

    }
    public void printOwners(){
        ArrayList<String> owners = new ArrayList<>();
        for(String owner: this.vehicleRegistry.values()){
            if (!(owners.contains(owner))){
                owners.add(owner);
            }
        }

        for (String owner: owners){
            System.out.println(owner);
        }
    }
}
