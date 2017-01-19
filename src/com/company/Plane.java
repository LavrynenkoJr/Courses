package com.company;

/**
 * Created by Cyborg on 1/20/2017.
 */
public class Plane extends Mashine {
    private int maxHight;

    public Plane(String color, int weight, int speed, int maxHight) {
        super(color, weight, speed);
        this.maxHight = maxHight;
    }

    public int getMaxHight() {
        return maxHight;
    }

    public void setMaxHight(int maxHight) {
        this.maxHight = maxHight;
    }

    @Override
    public String toString() {
        return super.toString() + "maxHight=" + maxHight;
    }
}
