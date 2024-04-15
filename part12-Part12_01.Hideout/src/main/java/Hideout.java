
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
public class Hideout<T> {
    ArrayList<T> list;
    
    public Hideout() {
        this.list = new ArrayList();
    }
    public void putIntoHideout(T toHide) {
        this.list.add(toHide);
    }
    
    public T takeFromHideout(int index) {
        T value = this.list.get(index);
        this.list.remove(index);
        return value;
    }
}
