package com.davidgolke;

/**
 * Created by David Golke on 5/28/2017.
 */
public class Lamp {
    private String color;
    private int bulbs;
    private boolean on;

    public Lamp(String color, int bulbs, boolean on) {
        this.color = color;
        this.bulbs = bulbs;
        this.on = on;
    }

    public void turnOnLamp() {
        on = true;
    }

    public void turnOffLamp() {
        on = false;
    }
}
