package com.davidgolke;

/**
 * Created by David Golke on 5/28/2017.
 */
public class Ceiling {
    private int height;

    private int paintedColor;

    public Ceiling(int height, int paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }

    public int getHeight() {
        return height;
    }

    public int getPaintedColor() {
        return paintedColor;
    }
}
