package com.geekBrains;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        cat1.lengthRun(200);
        cat1.lengthSwim(10);
        System.out.println(Cat.catCounter);

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        dog1.lengthRun(500);
        dog1.lengthSwim(10);
        dog2.lengthRun(50);
        System.out.println(Dog.dogCounter);
        System.out.println(Animal.animalCounter);
    }
}
