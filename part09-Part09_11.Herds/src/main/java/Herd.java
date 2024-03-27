
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
public class Herd implements Movable {

    private ArrayList<Movable> list;

    public Herd() {
        this.list = new ArrayList();
    }

    public String toString() {
        String c = "";
        for (int i = 0; i < this.list.size(); i++) {
           c += this.list.get(i).toString() + "\n";
            
            
        }
        
        return c;
    }

    public void addToHerd(Movable movable) {
        this.list.add(movable);
    }

    public void move(int dx, int dy) {
        for (Movable animal : this.list) {
            animal.move(dx, dy);
        }
        
    }
}
