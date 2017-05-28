package com.davidgolke;

/**
 * Created by David Golke on 5/28/2017.
 */
public class Bed {
    private String brand;
    private int firmness;

    public Bed(String brand, int firmness) {
        this.brand = brand;
        this.firmness = firmness;
    }

    public String getBrand() {
        return brand;
    }

    public int getFirmness() {
        return firmness;
    }
}
