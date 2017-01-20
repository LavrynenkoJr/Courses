package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Tank t34 = new Tank("green", 34000, 34, 200, 200);
        Tank t35 = new Tank("green", 35000, 34, 200, 200);
        Plane cy = new Plane("white", 3000, 300, 2000);

        System.out.println(t34.equals(t35)?"Equals power":"Not equals power");

        List<Mashine> mashineList = new ArrayList<Mashine>();
        mashineList.add(t34);
        mashineList.add(t35);

        System.out.println(mashineList.get(1).getColor()); // тут мы не можем вывести переменную Power! тут мы работаем с Tank как с Mashine (ПОЛИМОРФИЗМ)
        Tank t35New = (Tank) mashineList.get(1); // делаем downcasting для того что бы вывести переменную обьявленную в классе-потомке
        System.out.println(t35New.getPower()); // непосредственно выводим переменную из класса-потомка
    }
}
