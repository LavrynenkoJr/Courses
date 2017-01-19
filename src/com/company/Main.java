package com.company;

public class Main {

    public static void main(String[] args) {
        Tank t34 = new Tank("green", 34000, 34, 20);
        Plane cy = new Plane("white", 3000, 300, 2000);

        System.out.println(cy.printSmth());
        Mashine q = cy;
        System.out.println(q.printSmth());

        Mashine m = t34;



        System.out.println(m instanceof Tank ?"true":"false");
        System.out.println(cy instanceof Plane);
    }
}
