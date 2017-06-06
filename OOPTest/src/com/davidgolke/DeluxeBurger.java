package com.davidgolke;

/**
 * Created by David Golke on 6/6/2017.
 */
public class DeluxeBurger extends Hamburger {
    public DeluxeBurger(String meat, double price) {
        super("Deluxe Burger", "sesame seed", meat, price);

        super.addHamburgerExtra1("chips", 1.00);
        super.addHamburgerExtra2("drink", 1.50);
    }

    @Override
    public void addHamburgerExtra1(String extraName, double extraPrice) {
        System.out.println("No additional items can be added to the Deluxe Burger");
    }

    @Override
    public void addHamburgerExtra2(String extraName, double extraPrice) {
        System.out.println("No additional items can be added to the Deluxe Burger");
    }

    @Override
    public void addHamburgerExtra3(String extraName, double extraPrice) {
        System.out.println("No additional items can be added to the Deluxe Burger");
    }

    @Override
    public void addHamburgerExtra4(String extraName, double extraPrice) {
        System.out.println("No additional items can be added to the Deluxe Burger");
    }
}
