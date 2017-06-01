package com.davidgolke;

class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public void startEngine() {
        System.out.println("Generic engine being started");
    }

    public void accelerate() {
        System.out.println("Generic car accelerating");
    }

    public void brake() {
        System.out.println("Generic car braking");
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }
}

class Ferrari extends Car {
    public Ferrari() {
        super("Ferrari", 6);
    }

    @Override
    public void startEngine() {
        System.out.println("Ferrari engine started");
    }

    @Override
    public void accelerate() {
        System.out.println("Ferrari accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Ferrari breaking");
    }
}

class Porsche extends Car {
    public Porsche() {
        super("Porsche", 4);
    }

    @Override
    public void startEngine() {
        System.out.println("Porsche engine started");
    }

    @Override
    public void accelerate() {
        System.out.println("Porsche accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Porsche breaking");
    }
}

class Mustang extends Car {
    public Mustang() {
        super("Mustang", 5);
    }

    @Override
    public void startEngine() {
        System.out.println("Mustang engine started");
    }

    @Override
    public void accelerate() {
        System.out.println("Mustang accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Mustang breaking");
    }
}

class Common extends Car {
    public Common() {
        super("Some car", 4);
    }
}

public class Main {

    public static void main(String[] args) {
        // We are going to go back to the car analogy.
        // Create a base class called Car
        // It should have a few fields that would be appropriate for a generic car class.
        // engine, cylinders, wheels, etc.
        // Constructor should initialize cylinders (number of) and name, and set wheels to 4
        // and engine to true. Cylinders and names would be passed parameters.
        //
        // Create appropriate getters
        //
        // Create some methods like startEngine, accelerate, and brake
        //
        // show a message for each in the base class
        // Now create 3 sub classes for your favorite vehicles.
        // Override the appropriate methods to demonstrate polymorphism in use.
        // put all classes in the one java file (this one).
        for (int i = 1; i < 11; i++) {
            Car car = randomCar();
            car.startEngine();
            car.accelerate();
            car.brake();
            System.out.println();
        }
    }

    public static Car randomCar() {
        int randomNumber = (int) (Math.random() * 4) + 1;
        System.out.println("Random number generated was " + randomNumber);
        switch(randomNumber) {
            case 1:
                return new Ferrari();
            case 2:
                return new Porsche();
            case 3:
                return new Mustang();
            case 4:
                return new Common();
        }

        return null;
    }
}
