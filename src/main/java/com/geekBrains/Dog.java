package com.geekBrains;

public class Dog extends Animal {
    public static int dogCounter = 0;

    public Dog() {
        dogCounter++;
    }

    @Override
    public void lengthRun(int speed) {
        if (speed <= 500) {
            System.out.println("Питомец пробежал " + speed + " м");
        } else {
            System.out.println("Питомец столько не пробежит");
        }
    }

    @Override
    public void lengthSwim(int speed) {
        if (speed <= 10) {
            System.out.println("Питомец проплыл " + speed + " м");
        } else {
            System.out.println("Питомец столько не проплывёт");
        }
    }

}
