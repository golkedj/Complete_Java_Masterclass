package com.davidgolke;

public class Main {

    public static void main(String[] args) {
        // Create a new class for a bank account
        // Create fields for the account number, balance, customer name, email and phone number.
        //
        // Create getters and setters for each field
        // Create two additional methods
        // 1. To allow the customer to deposit funds (this should increment the balance field).
        // 2. To allow the customer to withdraw funds. This should deduct from the balance field,
        // but not allow the withdrawal to complete if their are insufficient funds.
        // You will want to create various code in the Main class (the one created by IntelliJ) to
        // confirm your code is working.
        // Add some System.out.println's in the two methods above as well.

//        Account bobsAccount = new Account();//("12345", 0.00, "Bob Brown", "myemail@bob.com", "(087) 123-4567");
//        System.out.println(bobsAccount.getNumber());
//        System.out.println(bobsAccount.getBalance());
//
//        bobsAccount.withdraw(100.0);
//
//        bobsAccount.deposit(50.0);
//        bobsAccount.withdraw(100.0);
//
//        bobsAccount.deposit(51.0);
//        bobsAccount.withdraw(100.0);
//
        Account davesAccount = new Account("Dave", "dave@email.com", "12345");
        System.out.println(davesAccount.getNumber() + " name " + davesAccount.getCustomerName());
        System.out.println("Current balance is " + davesAccount.getBalance());
        davesAccount.withdraw(100.55);

        // Create a new class VipCustomer
        // it should have 3 fields name, credit limit, and email address.
        // create 3 constructors
        // 1st constructor empty should call the constructor with 3 parameters with default values
        // 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
        // 3rd constructor should save all fields.
        // create getters only for this using code generation of intellij as setters wont be needed
        // test and confirm it works.

//        VipCustomer customer1 = new VipCustomer();
//        System.out.println("customer1 has name of " + customer1.getCustomerName() +
//                ", credit limit of " + customer1.getCreditLimit() +
//                ", and email address of " + customer1.getCustomerEmailAddress());
//
//        VipCustomer customer2 = new VipCustomer("David", "david@email.com");
//        System.out.println("customer2 has name of " + customer2.getCustomerName() +
//                ", credit limit of " + customer2.getCreditLimit() +
//                ", and email address of " + customer2.getCustomerEmailAddress());
//
//        VipCustomer customer3 = new VipCustomer("Name 3", 25000.0, "name3@email.com");
//        System.out.println("customer3 has name of " + customer3.getCustomerName() +
//                ", credit limit of " + customer3.getCreditLimit() +
//                ", and email address of " + customer3.getCustomerEmailAddress());



    }
}
