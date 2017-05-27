package com.davidgolke;

/**
 * Created by David Golke on 5/26/2017.
 */
public class Vehicle {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    private String name;
    private int doors;
    private int wheels;
    private String direction;
    private int speed;

    public Vehicle(String name, int doors, int wheels, String direction, int speed) {
        this.name = name;
        this.doors = doors;
        this.wheels = wheels;
        this.direction = direction;
        this.speed = speed;
    }

    public void changeDirection(String direction) {
        switch (direction.toLowerCase()) {
            case "right":case "left":case "straight":
                this.direction = direction;
                break;
            default:
                this.direction = "straight";
                break;
        }
    }

    public void increaseSpeed() {
        this.speed += 5;
    }

    public void decreaseSpeed() {
        this.speed -= 5;
    }
}
