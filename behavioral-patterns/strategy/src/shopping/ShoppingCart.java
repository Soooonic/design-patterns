package shopping;

import strategy.PaymentStrategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Item>items;
    public ShoppingCart(){
        this.items=new ArrayList<Item>();
    }
    public void addItem(Item item){
        items.add(item);
    }
    public void removeItem(Item item){
        items.remove(item);
    }
    public int calculateTotal(){
        int sum=0;
        for (Item item:
             items) {
            sum+=item.getPrice();
        }
        return sum;
    }
    public void pay(PaymentStrategy paymentStrategy){
        paymentStrategy.pay(calculateTotal());
    }
}
