package com.geekBrains;

public class Plate {
    private int food;

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        if (food >= n) {
            food -= n;
        } else {
            System.out.println("Мало еды");
        }
    }

    public void addFood(int food) {
        this.food += food;
    }

    public void info() {
        System.out.println("plate: " + food);
    }
}
