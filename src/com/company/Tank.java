package com.company;

/**
 * Created by Cyborg on 1/20/2017.
 */
public class Tank extends Mashine {
    private int gun;  //  огневая мощь
    private int bron; //  бронь
    private int power; //  соотношение огневой мощи и брони

    public Tank(String color, int weight, int speed, int gun, int bron) {
        super(color, weight, speed);
        this.gun = gun;
        this.power = weight/(gun+bron);
    }

    public int getGun() {
        return gun;
    }

    public void setGun(int gun) {
        this.gun = gun;
    }

    public int getPower() {
        return power;
    }

    public int getBron() {
        return bron;
    }

    public void setBron(int bron) {
        this.bron = bron;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tank tank = (Tank) o;

        return power == tank.power;
    }

    @Override
    public int hashCode() {
        return power;
    }

    @Override
    public String toString() {
        return super.toString() + "gun=" + gun;
    }
}