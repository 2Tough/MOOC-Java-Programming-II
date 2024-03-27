
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
public class ChangeHistory {

    private ArrayList<Double> list;

    public ChangeHistory() {
        this.list = new ArrayList();
    }

    public void add(double status) {
        this.list.add(status);
    }

    public void clear() {
        this.list.clear();
    }

    public String toString() {
        return this.list.toString();
    }

    public double maxValue() {
        double value = 0.0;
        for (int i = 0; i < this.list.size(); i++) {
            if (value < this.list.get(i)) {
                value = this.list.get(i);
            }
        }
        return value;
    }
    
    public double minValue() {
        double value = 1000.0;
        for (int i = 0; i < this.list.size(); i++) {
            if (value > this.list.get(i)) {
                value = this.list.get(i);
            }
        }
        return value;
    }
    
    public double average() {
        double value = 0.0;
        for (int i = 0; i < this.list.size(); i++) {
            value += this.list.get(i);
            
        }
        return value/this.list.size() * 1.0;
    }
}
