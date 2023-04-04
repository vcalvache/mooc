import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Item> shoppingCart;

    public ShoppingCart(){
        this.shoppingCart = new HashMap<String,Item>();
    }

    public void add(String product, int price){
        Item itemToAdd = new Item(product, 1, price);
        if (shoppingCart.containsKey(product)){
            shoppingCart.get(product).increaseQuantity();
        } else {
            shoppingCart.put(itemToAdd.getProduct(), itemToAdd);
        }
    }

    public int price(){
        int cartPrice = 0;
        for(Item product: shoppingCart.values()){
            cartPrice += product.price();
        }
        return cartPrice;
    }    

    public void print(){
        for (Item product: shoppingCart.values()){
            System.out.println(product.getProduct() +": " + product.getQty());
        }
    }
}