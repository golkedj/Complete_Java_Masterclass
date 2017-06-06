package com.davidgolke;

/**
 * Created by David Golke on 6/6/2017.
 */
public class Hamburger {
    private String name;
    private String breadRollType;
    private String meat;
    private double price;

    private String extra1Name;
    private double extra1Price;

    private String extra2Name;
    private double extra2Price;

    private String extra3Name;
    private double extra3Price;

    private String extra4Name;
    private double extra4Price;

    public Hamburger(String name, String breadRollType, String meat, double price) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
    }

    public void addHamburgerExtra1(String extraName, double extraPrice) {
        this.extra1Name = extraName;
        this.extra1Price = extraPrice;
    }

    public void addHamburgerExtra2(String extraName, double extraPrice) {
        this.extra2Name = extraName;
        this.extra2Price = extraPrice;
    }

    public void addHamburgerExtra3(String extraName, double extraPrice) {
        this.extra3Name = extraName;
        this.extra3Price = extraPrice;
    }

    public void addHamburgerExtra4(String extraName, double extraPrice) {
        this.extra4Name = extraName;
        this.extra4Price = extraPrice;
    }

    public double itemizeHamburger() {
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger on a " +
                this.breadRollType + " roll with " +
                this.meat + " meat, price is " + hamburgerPrice);

        if (this.extra1Name != null) {
            hamburgerPrice += this.extra1Price;
            System.out.println("Added " + this.extra1Name + " for an extra " + this.extra1Price);
        }

        if (this.extra2Name != null) {
            hamburgerPrice += this.extra2Price;
            System.out.println("Added " + this.extra2Name + " for an extra " + this.extra2Price);
        }

        if (this.extra3Name != null) {
            hamburgerPrice += this.extra3Price;
            System.out.println("Added " + this.extra3Name + " for an extra " + this.extra3Price);
        }

        if (this.extra4Name != null) {
            hamburgerPrice += this.extra4Price;
            System.out.println("Added " + this.extra4Name + " for an extra " + this.extra4Price);
        }

        return hamburgerPrice;
    }
}
