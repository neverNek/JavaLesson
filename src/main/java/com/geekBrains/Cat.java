package com.geekBrains;

public class Cat extends Animal {
    public static int catCounter = 0;

    public Cat() {
        catCounter++;
    }

    @Override
    public  void lengthRun(int speed) {
        if (speed <= 200) {
            System.out.println("Питомец пробежал " + speed + " м");
        } else {
            System.out.println("Питомец столько не пробежит");
        }
    }

    @Override
    public  void lengthSwim(int speed) {
        System.out.println("Кошки не плавают");
    }
}
