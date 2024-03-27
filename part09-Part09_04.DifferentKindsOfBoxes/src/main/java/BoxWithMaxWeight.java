
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Valentin
 */
public class BoxWithMaxWeight extends Box {

    private int maxWeight;
    private ArrayList<Item> list;

    public BoxWithMaxWeight(int capacity) {
        this.maxWeight = capacity;
        this.list = new ArrayList();

    }

    @Override
    public void add(Item item) {
        
        if (weightCap() + item.getWeight() <= this.maxWeight) {
            this.list.add(item);
        } else {
            return;
        }
        
    }

    @Override
    public boolean isInBox(Item item) {
        return this.list.contains(item);
    }
    
    public int weightCap() {
        int weight = 0;
        for (Item i : this.list) {
            weight += i.getWeight();
            
        }
        System.out.println(weight);
        
        return weight;
    }
    
    
}
