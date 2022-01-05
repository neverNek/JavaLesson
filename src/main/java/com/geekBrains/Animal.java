package com.geekBrains;

public abstract class Animal {
    private int run;
    private int swim;
    public static int animalCounter = 0;

    public Animal() {
        animalCounter++;
    }


    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getSwim() {
        return swim;
    }

    public void setSwim(int swim) {
        this.swim = swim;
    }

    public abstract void lengthRun(int speed);

    public abstract void lengthSwim(int speed);
}
