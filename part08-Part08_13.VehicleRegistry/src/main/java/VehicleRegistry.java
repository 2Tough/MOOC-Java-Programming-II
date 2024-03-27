
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Valentin
 */
public class VehicleRegistry {

    private HashMap<LicensePlate, String> hash;

    public VehicleRegistry() {
        this.hash = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {

        if (!this.hash.containsKey(licensePlate)) {
            this.hash.put(licensePlate, owner);
            return true;
        } else {
            return false;
        }

    }

    public String get(LicensePlate licensePlate) {
        return this.hash.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (this.hash.containsKey(licensePlate)) {
            this.hash.remove(licensePlate);
            return true;
        } else {
            return false;
        }

    }

    public void printLicensePlates() {
        for (LicensePlate key : this.hash.keySet()) { 
            System.out.println(key);
        }
        

    }

    public void printOwners() {
        ArrayList<String> list = new ArrayList<>();
        
        for (LicensePlate key : this.hash.keySet()) { 
            if (!list.contains(this.hash.get(key)))
            list.add(this.hash.get(key));
        }
        
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
