
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
public class Box implements Packable {

    private double maximumCapacity;
    private ArrayList<Packable> items;
    

    public Box(double maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        this.items = new ArrayList();
    }

    public double weight() {
        
        return calculateWeights();
    }

    public void add(Packable item) {
        System.out.println("print item weight " + item.weight());
        if (item.weight() + calculateWeights() <= this.maximumCapacity) {
            this.items.add(item);
        }

    }

    public String toString() {
        return ("Box: " + this.items.size() + " items, total weight " + calculateWeights() + " kg");
    }

    public double calculateWeights() {
        double totalWeight = 0.0;
        for (Packable i : this.items) {
            totalWeight += i.weight();
        }

        return totalWeight;
    }

}
