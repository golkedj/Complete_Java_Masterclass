package com.davidgolke;

/**
 * Created by David Golke on 5/26/2017.
 */
public class Car extends Vehicle {
    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    public int getMinGear() {
        return minGear;
    }

    public void setMinGear(int minGear) {
        this.minGear = minGear;
    }

    public int getMaxGear() {
        return maxGear;
    }

    public void setMaxGear(int maxGear) {
        this.maxGear = maxGear;
    }

    private int currentGear;
    private int minGear;
    private int maxGear;

    public Car(String name, int doors, int wheels, String direction, int speed, int currentGear, int minGear, int maxGear) {
        super(name, doors, wheels, direction, speed);
        this.currentGear = currentGear;
        this.minGear = minGear;
        this.maxGear = maxGear;
    }

    public void gearUp() {
        if ((this.currentGear + 1) <= maxGear) {
            this.currentGear++;
        }
    }

    public void gearDown() {
        if ((this.currentGear - 1) >= minGear) {
            this.currentGear--;
        }
    }
}
