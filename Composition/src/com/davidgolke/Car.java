package com.davidgolke;

/**
 * Created by David Golke on 5/27/2017.
 */
public class Car extends Vehicle {
    private int doors;
    private int engineCapacity;

    public Car(String name, int doors, int engineCapacity) {
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }
}
