
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Valentin
 */
public class ShoppingCart {

    private Map<String, Item> map;

    public ShoppingCart() {
        this.map = new HashMap();
    }

    public void add(String product, int price) {
        Item item = new Item(product, 1, price);
        if (this.map.containsKey(product)) {
            this.map.get(product).increaseQuantity();
        } else {
            this.map.put(product, item);
        }

    }

    public int price() {
        int totalPrice = 0;
        for (Item values : this.map.values()) {
            totalPrice += values.price();
        }
        return totalPrice;
    }

    public void print() {
        int values = 0;
        for (Item item : this.map.values()) {
            System.out.println(item);
        }

    }

}
