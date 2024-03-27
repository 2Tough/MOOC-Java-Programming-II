/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Valentin
 */
public class Dog extends Animal implements NoiseCapable {

    private String dog;

    public Dog(String dog) {
        super(dog);
    }

    public Dog() {
        super("Dog");
    }

    public void bark() {
        System.out.println(super.getName() + " barks");
    }

    public void makeNoise() {
        System.out.println(super.getName() + " barks");
    }

}
