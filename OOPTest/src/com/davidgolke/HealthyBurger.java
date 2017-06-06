package com.davidgolke;

/**
 * Created by David Golke on 6/6/2017.
 */
public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy Burger", "brown rye", meat, price);
    }

    public void addHealthyExtra1(String extraName, double extraPrice) {
        this.healthyExtra1Name = extraName;
        this.healthyExtra1Price = extraPrice;
    }

    public void addHealthyExtra2(String extraName, double extraPrice) {
        this.healthyExtra2Name = extraName;
        this.healthyExtra2Price = extraPrice;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();

        if (this.healthyExtra1Name != null) {
            hamburgerPrice += this.healthyExtra1Price;
            System.out.println("Added " + this.healthyExtra1Name + " for an extra " + this.healthyExtra1Price);
        }

        if (this.healthyExtra2Name != null) {
            hamburgerPrice += this.healthyExtra2Price;
            System.out.println("Added " + this.healthyExtra2Name + " for an extra " + this.healthyExtra2Price);
        }

        return hamburgerPrice;
    }
}
