/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author Valentin
 */
public class TemperatureSensor implements Sensor {

    private boolean state;

    public TemperatureSensor() {
        this.state = false;
    }

    @Override
    public void setOn() {
        this.state = true;
    }

    @Override
    public void setOff() {
        this.state = false;
    }

    @Override
    public boolean isOn() {
        return this.state;
    }

    @Override
    public int read() {
        Random randomNum = new Random();
        int x = randomNum.nextInt(60) - 30;
        if (!isOn()) {
            throw new IllegalStateException("Wrong number");
        } else {
            return x;
        }

    }

}
