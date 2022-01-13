package com.geekBrains;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 10);
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Кузя", 15);
        cats[1] = new Cat("Рыжик", 5);
        cats[2] = new Cat("Снежок", 10);
        Plate plate = new Plate(25);

        plate.info();
        cats[0].eat(plate);
        cats[1].eat(plate);
        cats[2].eat(plate);
        plate.info();

        System.out.println(cats[0].isFullness());
        System.out.println(cats[1].isFullness());
        System.out.println(cats[2].isFullness());

        plate.addFood(10);
        plate.info();
    }
}
