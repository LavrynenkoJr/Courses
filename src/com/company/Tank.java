package com.company;

/**
 * Created by Cyborg on 1/20/2017.
 */
public class Tank extends Mashine {
    private int gun;

    public Tank(String color, int weight, int speed, int gun) {
        super(color, weight, speed);
        this.gun = gun;
    }

    public int getGun() {
        return gun;
    }

    public void setGun(int gun) {
        this.gun = gun;
    }

    @Override
    public String toString() {
        return super.toString() + "gun=" + gun;
    }
}