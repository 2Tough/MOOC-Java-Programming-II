/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Valentin
 */
public class AverageSensor implements Sensor {

    private ArrayList<Sensor> list;
    private ArrayList<Integer> temps;

    public AverageSensor() {
        this.list = new ArrayList();
        this.temps = new ArrayList();

    }

    public void addSensor(Sensor toAdd) {
        this.list.add(toAdd);
    }

    @Override
    public void setOn() {
        for (Sensor sensor : this.list) {
            sensor.setOn();
        }
    }

    @Override
    public void setOff() {
        for (Sensor sensor : this.list) {
            sensor.setOff();
        }
    }

    @Override
    public boolean isOn() {
        boolean state = true;
        for (Sensor sensor : this.list) {
            if (sensor.isOn() == false) {
                state = false;
            }
        }
        return state;
    }

    @Override
    public int read() {
        int sum = 0;
        sum = this.list.stream().mapToInt(val -> val.read()).sum();
        this.temps.add((int) this.list.stream().mapToInt(val -> val.read()).average().getAsDouble());
        if (isOn() == false || this.list.isEmpty()) {
            throw new IllegalStateException("No info available or sensors are off.");
        }

        return sum / this.list.size();
    }

    public List<Integer> readings() {
        return this.temps;
    }
}
