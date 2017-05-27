package com.davidgolke;

/**
 * Created by David Golke on 5/26/2017.
 */
public class Outback extends Car {
    boolean inFourWheel;

    public Outback(String name, int doors, int wheels, String direction, int speed, int currentGear, int minGear, int maxGear) {
        super(name, doors, wheels, direction, speed, currentGear, minGear, maxGear);
        this.inFourWheel = false;
    }

    public Outback(String name, int doors, int wheels, String direction, int speed, int currentGear, int minGear, int maxGear, boolean inFourWheel) {
        super(name, doors, wheels, direction, speed, currentGear, minGear, maxGear);
        this.inFourWheel = inFourWheel;
    }

    public boolean isInFourWheel() {
        return inFourWheel;
    }

    public void setInFourWheel(boolean inFourWheel) {
        this.inFourWheel = inFourWheel;
    }

    public void enableFourWheel() {
        setInFourWheel(true);
    }

    public void disableFourWheel() {
        setInFourWheel(false);
    }
}
