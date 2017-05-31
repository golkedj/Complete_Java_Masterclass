package com.davidgolke;

/**
 * Created by David Golke on 5/31/2017.
 */
public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplexPrinter;

    public Printer(int tonerLevel) {
        this(tonerLevel, 0, false);
    }

    public Printer(int tonerLevel, boolean duplexPrinter) {
        this(tonerLevel, 0, duplexPrinter);
    }

    public Printer(int tonerLevel, int pagesPrinted, boolean duplexPrinter) {
        if (tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = 100;
        }

        this.pagesPrinted = pagesPrinted;
        this.duplexPrinter = duplexPrinter;
    }

    public void fillToner(int tonerValue) {
        tonerLevel += tonerValue;
        if (tonerLevel > 100) {
            tonerLevel = 100;
        }
        System.out.println("Filling toner. New toner level is " + tonerLevel);
    }

    public void printPage() {
        pagesPrinted++;

        if (duplexPrinter) {
            System.out.println("Printer is duplex printer.");
        }
        System.out.println("Printed page " + pagesPrinted + " successfully");
    }
}
