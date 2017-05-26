package com.davidgolke;

/**
 * Created by golke on 5/26/2017.
 */
public class VipCustomer {
    private String customerName;
    private double creditLimit;
    private String customerEmailAddress;

    public VipCustomer(String customerName, double creditLimit, String customerEmailAddress) {

        this.customerName = customerName;
        this.creditLimit = creditLimit;
        this.customerEmailAddress = customerEmailAddress;
    }

    public VipCustomer(String customerName, String customerEmailAddress) {
        this(customerName, 50000.0, customerEmailAddress);
    }

    public VipCustomer() {
        this("Default", 50000.0, "default@email.com");
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }
}
