package com.davidgolke;

/**
 * Created by David Golke on 5/28/2017.
 */
public class Bedroom {
    private Bed bed = new Bed("Serta", 50);
    private Ceiling ceiling = new Ceiling(12);
    private Lamp lamp = new Lamp("blue", 2, false);
    private Wall frontWall = new Wall(12, 20, "white");
    private Wall backWall = new Wall(12, 20, "white");
    private Wall leftWall = new Wall(12, 20, "white");
    private Wall rightWall = new Wall(12, 20, "white");
    
}
