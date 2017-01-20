package com.company;

public class Main {

    public static void main(String[] args) {
        Tank t34 = new Tank("green", 34000, 34, 200, 200);
        Tank t35 = new Tank("green", 34000, 34, 200, 200);
        Plane cy = new Plane("white", 3000, 300, 2000);

        System.out.println(t34.equals(t35)?"Equals power":"Not equals power");
    }
}
