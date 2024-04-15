
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
public class Pipe<T> {
    private ArrayList<T> list;
    
    public Pipe() {
        this.list = new ArrayList();
    }
    
    public void putIntoPipe(T value) {
        this.list.add(value);
    }
    
    public T takeFromPipe(int index) {
        T value = this.list.get(index);
        this.list.remove(index);
        return value;
    }
    
    public boolean isInPipe() {
        if (this.list.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }
}
