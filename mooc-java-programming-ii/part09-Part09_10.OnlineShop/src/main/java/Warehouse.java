import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class Warehouse {
    private Map<String, Integer> prices;
    private Map<String, Integer> stock;


    public Warehouse(){
        this.prices = new HashMap<>();
        this.stock = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock){
        this.prices.put(product, price);
        this.stock.put(product, stock);
    }

    public int price(String product){
        if (this.prices.containsKey(product)){
            return prices.get(product);
        }
        return -99;
    }

    public int stock(String product){
        if (this.stock.containsKey(product)){
            return stock.get(product);
        }

        return 0;
    }

    public boolean take(String product){

        if (stock.containsKey(product)){
            if(stock.get(product) > 0){
                this.stock.put(product, stock.get(product) - 1);
                return true;
            }

        }
        return false;
    }

    public Set<String> products(){
        Set<String> products = new HashSet<>();
        for (String product: prices.keySet()){
            products.add(product);
        }
        return products;
    }
}