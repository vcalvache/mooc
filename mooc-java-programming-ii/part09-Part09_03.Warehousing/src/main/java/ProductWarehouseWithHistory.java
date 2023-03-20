public class ProductWarehouseWithHistory extends ProductWarehouse{
    private ChangeHistory changeHistory;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName, capacity, initialBalance);
        this.changeHistory = new ChangeHistory();
        this.changeHistory.add(initialBalance);
    }
    
    public String history(){
        return changeHistory.toString();
    }

    @Override
    public void addToWarehouse(double amount){
        double newBalance = changeHistory.getLastBalance() + amount;
        super.addToWarehouse(amount);
        this.changeHistory.add(newBalance);
    }

    @Override
    public double takeFromWarehouse(double amount){
        Double newBalance = (double) super.getBalance() - amount;
        this.changeHistory.add(newBalance);    
        return super.takeFromWarehouse(amount);
    }

    public void printAnalysis(){
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + history());
        System.out.println("Largest amount of product: " + changeHistory.maxValue());
        System.out.println("Smallest amount of product: " + changeHistory.minValue());
        System.out.println("Average: " + changeHistory.average());

    }
}
