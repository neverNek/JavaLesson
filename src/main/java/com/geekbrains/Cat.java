package com.geekBrains;

public class Cat {
    private String name;
    private int appetite;
    private boolean fullness = false;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean isFullness() {
        return fullness;
    }

    public void setFullness(boolean fullness) {
        this.fullness = fullness;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p) {
        if (p.getFood() >= appetite) {
            fullness = true;
        }

        p.decreaseFood(appetite);

    }
}
