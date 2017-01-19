package com.company;

/**
 * Created by Cyborg on 1/20/2017.
 */
abstract public class Mashine {
    private String color;
    private int weight;
    private int speed;

    public Mashine(String color, int weight, int speed) {
        this.color = color;
        this.weight = weight;
        this.speed = speed;
    }

    public String printSmth(){
        return "color=" + color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Mashine{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                ", speed=" + speed +
                '}';
    }


}